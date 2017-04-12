/**
问题描述
　　L正在出题，新建了一个word文档，想不好取什么名字，身旁一人惊问：“你出的题目叫《新建Microsoft Word文档》吗？”，L大喜，一拍桌子，说：“好，就叫这个名字了。”
　　仔细观察，当你新建一个word文档时，会得到一个名为“新建 Microsoft Word 文档.doc”的文件，再新建一个，则名为“新建 Microsoft Word 文档(2).doc”，
再新建，便是“新建 Microsoft Word 文档(3).doc”。不断新建，编号不断递增。倘若你现在新建了三个文档，然后删除了“新建 Microsoft Word 文档(2).doc”，
再新建就又会得到一个“新建 Microsoft Word 文档(2).doc”。
　　严格说，Windows在每次新建文档时，都会选取一个与已有文件编号不重复的最小正整数作为新文档的编号。
　　请编程模拟以上过程，支持以下两种操作
　　New：新建一个word文档，反馈新建的文档的编号
　　Delete id：删除一个编号为id的word文档，反馈删除是否成功
　　初始时一个文件都没有，“新建 Microsoft Word 文档.doc”的编号算作1。
输入格式
　　第一行一个正整数n表示操作次数，接下来n行，每行表示一个操作。若该行为”New”，则表示新建，为”Delete id”则表示要删除编号为id的文档，其中id为一个正整数。操作按输入顺序依次进行。
输出格式
　　对于输入的每一行，输出其反馈结果。对于新建操作，输出新建的文档的编号；对于删除操作，反馈删除是否成功：如果删除的文件存在，则删除成功，输出”Successful”，否则输出”Failed”。
样例输入
12
New
New
New
Delete 2
New
Delete 4
Delete 3
Delete 1
New
New
New
Delete 4
样例输出
1
2
3
Successful
2
Failed
Successful
Successful
1
3
4
Successful
数据规模和约定
　　操作次数（即输入的行数）不超过1481
　　删除编号的数值不超过2012
 */
package 新建MicrosoftWord文档;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String l;
		int id;
		int index;
		int now;
		ArrayList<String> w = new ArrayList<String>();
		while (n > 0) {
			l = scanner.next();
			if (l.equals("New")) {
				if (w.isEmpty()) {
					id = 1;
					w.add(String.valueOf(id));
					System.out.println(String.valueOf(id));
				} else {
					index = Integer.valueOf(w.get(0));
					if (index == 1) {
						for (int i = 1; i < w.size(); i++) {
							now = Integer.valueOf(w.get(i));
							if (now - index > 1) {
								break;
							} else {
								index = now;
							}
						}
						id = index;
						index++;
					} else {
						index = 1;
						id = index-1;
					}
					w.add(id, String.valueOf(index));
					System.out.println(String.valueOf(index));
				}
			} else {
				String obj = scanner.next();
				if (w.remove(obj)) {
					System.out.println("Successful");
				} else {
					System.out.println("Failed");
				}
			}
			n--;
		}
	}
}
