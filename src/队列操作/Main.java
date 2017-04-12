/**
问题描述
　　﻿队列操作题。根据输入的操作命令，操作队列（1）入队、（2）出队并输出、（3）计算队中元素个数并输出。
输入格式
　　第一行一个数字N。
　　下面N行，每行第一个数字为操作命令（1）入队、（2）出队并输出、（3）计算队中元素个数并输出。
输出格式
　　若干行每行显示一个2或3命令的输出结果。注意：2.出队命令可能会出现空队出队（下溢），请输出“no”，并退出。
样例输入
7
1 19
1 56
2
3
2
3
2
样例输出
19
1
56
0
no
数据规模和约定
　　1<=N<=50
 */

package 队列操作;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	static Scanner scanner;
	static Queue<String> queue = new ArrayBlockingQueue<String>(50);
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int key;
		for (int i = 0; i < n; i++) {
			key = scanner.nextInt();
			switch (key) {
			case 1:
				String res = scanner.next();
				queue.add(res);
				break;
			case 2:
				if (queue.isEmpty()) {
					System.out.println("no");
					return;
				}else {
					System.out.println(queue.poll());
				}
				break;
			case 3:
				System.out.println(queue.size());
				break;
			}
		}
	}
	
}
