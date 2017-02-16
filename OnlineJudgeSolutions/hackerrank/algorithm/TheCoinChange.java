import java.util.Scanner;

public class TheCoinChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		count(a, a.length, n);
	}

	public static void count(int S[], int m, int n) {
		long x = 0;
		long y = 0;
		long[][] table = new long[n + 1][m];
		for (int i = 0; i < m; i++) {
			table[0][i] = 1;
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < m; j++) {
				x = (i - S[j] >= 0) ? table[i - S[j]][j] : 0;
				y = (j >= 1) ? table[i][j - 1] : 0;
				table[i][j] = x + y;
			}
		}
		System.out.println(table[n][m - 1]);
	}
}
