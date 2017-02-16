import java.util.Scanner;

class ChefAndKeyboard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int c = in.nextInt();
			int cnt = 0;
			for (int i = 1; i <= n; i++) {
				if (c % i == 0 && c / i <= m)
					cnt++;
			}
			System.out.println(cnt);

		}
	}
}