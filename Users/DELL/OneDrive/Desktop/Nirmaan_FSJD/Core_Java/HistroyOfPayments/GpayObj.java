package HistroyOfPayments;

public class GpayObj {
	public static void main(String[] args) {
		GapyClass g = new GapyClass(10000);
		System.out.println(g.history.size());
		System.out.printf("%.2f", g.Checkbalance());
		System.out.println();
		g.deposit(10000);
		System.out.println(g.history.size());
		g.withdraw(1000);
		System.out.println(g.history.size());
		System.out.println();
		System.out.printf("%.2f", g.Checkbalance());
		System.out.println();
		for (String history : g.history) {
			System.out.println(history);
		}
		g.history.clear();
		System.out.println(g.history.size());
	}

}
