package ÅÅÐò»ùÊý;

import java.util.LinkedList;

public class Main {
	private static int max_type = Integer.MIN_VALUE, max_data = Integer.MIN_VALUE;

	public static void main(String[] args) {
		LinkedList<card> ls = new LinkedList<card>();
		ls.add(new card(1, 1));
		ls.add(new card(2, 1));
		ls.add(new card(2, 3));
		ls.add(new card(3, 2));
		ls.add(new card(9, 4));
		ls.add(new card(4, 2));
		ls.add(new card(7, 1));
		ls.add(new card(2, 2));
		ls.add(new card(5, 1));
		ls.add(new card(3, 1));
		raid(ls);
	}

	public static LinkedList<card> sort(LinkedList<card> ls,int n,String type) {
		LinkedList[] ld = new LinkedList[n];
		for (int i = 0; i < ld.length; i++) {
			ld[i] = new LinkedList();
		}
		while (ls.size() > 0) {
			card t = ls.remove();
			ld[t.getClass(type) - 1].add(t);
		}
		for (int i = 0; i < ld.length; i++) {
			ls.addAll(ld[i]);
		}
		return ls;
	}
	
	public static void raid(LinkedList<card> ls) {
		ls = sort(ls, max_data,"data");
		ls = sort(ls, max_type,"type");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("( "+ls.get(i).type + " , " + ls.get(i).data+" )");
		}
	}

	static class card {
		private int data, type;

		public card(int data, int type) {
			if (data > max_data) {
				max_data = data;
			}
			if (type > max_type) {
				max_type = type;
			}
			this.data = data;
			this.type = type;
		}

		public int getClass(String type) {
			int res = this.data;
			if (type.equals("type")) {
				res = this.type;
			}
			return res;
		}
	}

}
