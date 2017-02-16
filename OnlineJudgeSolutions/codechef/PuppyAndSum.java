import java.util.Scanner;

class PuppyAndSum {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int d = in.nextInt();
			int n = in.nextInt();
			sum(d, n);
		}
	}

	public static void sum(int d, int n) {
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += i;
		}
		d = d - 1;
		if (d == 0)
			System.out.println(ans);
		else
			sum(d, ans);
	}
}
