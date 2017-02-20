//https://www.hackerrank.com/contests/rookierank-2/challenges/migratory-birds
import java.util.Scanner;

class MigrateBird {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int cnt[] = new int[5];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			cnt[a[i] - 1]++;
		}
		int max = cnt[0];
		int result = 1;
		for (int i = 1; i < 5; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				result = i + 1;
			}
		}
		System.out.println(result);
	}
}
