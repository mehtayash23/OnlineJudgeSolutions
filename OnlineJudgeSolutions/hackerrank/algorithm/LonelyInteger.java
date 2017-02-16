import java.util.Scanner;

public class LonelyInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[i] != a[j]) {
					count = count + 1;
				}
			}
			if (count == (a.length - 1)) {
				ans = a[i];
				break;
			}
		}
		System.out.println(ans);
	}
}
