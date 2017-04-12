/**
 ��һ����Ϣ���м�Ⱥ����Ⱥ��ÿ̨Broker����Ӧʱ��RT����һ��������ÿ̨Broker�ļ��޷���QPS����һ���ģ�
 �������QPS����ֹ���ѩ��������Ϣ�������߿ͻ��ˣ�ÿ�η��Ͷ���ѡ�����е�һ̨broker�����ͣ�һ����˵�����߼���������һ���̳߳����档
 ����cpu��Դ���㣬ͨ��ʵ��һ�����ؾ����㷨��ʹ���������ܹ��ﵽ��������������ŵ�ƽ����Ӧʱ�䣬�����ֲ��ܰ��κ�һ̨������ѹ�塣
 ��֪ÿ��broker��rt������qps����Ϣ�����ߵ��߳���������������������������������ŵ��㷨������������������Ҫ�ĺ�ʱ����λ���롣
 
����˵����
QPS��query per second�� ÿ��������
RT��response time���������Ӧʱ��
Broker����Ϣ���еķ�����


���޷���QPS��maxQps����200
ÿ��broker��RT��rtList����1,1,1,10,10
����������requestNum����5000
�߳�������threadNum����10
�𰸣�500

 */
package �����ᰢ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int maxQps= Integer.valueOf(in.nextLine());
		final String[] rtList = in.nextLine().split(",");
		final int requestNum = Integer.valueOf(in.nextLine());
		final int threadNum = Integer.valueOf(in.nextLine());
		System.out.println(doneTime(maxQps, rtList, requestNum, threadNum));
	}
	/**
	 * ���ʹ�����ŵ�������������ؾ����㷨����������ģ�Ͷ���ܹ��������������󣬵�λ���롣
	 * @return
	 */
	static long doneTime(int maxQps,String[] rtList,int requestNum,int threadNum) {
		//TODO
		List<Integer> rt = new ArrayList<Integer>();
		int one_rt;
		for (int i = 0; i < rtList.length; i++) {
			one_rt = Integer.valueOf(rtList[i]);
			rt.add(one_rt);
		}
		
		Collections.sort(rt, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if (o2 > o1) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		int num = requestNum / threadNum;
		int now;
		int res = 0;
		for (int i = 0; i < rt.size(); i++) {
			now = rt.get(i);
			if (num>maxQps) {
				res += now*maxQps;
				num -= maxQps;
			}else {
				res += now*num;
				break;
			}
		}
		return res;
	}
}