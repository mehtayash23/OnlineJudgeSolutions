import java.util.Scanner;

class AlternateSubarray {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int a[] = new int[n];
			int count[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				count[i] = 1;
			}
			for (int i = n - 2; i >= 0; i--) {
				if (a[i] > 0 && a[i + 1] < 0)
					count[i] = count[i + 1] + 1;
				else if (a[i] < 0 && a[i + 1] > 0)
					count[i] = count[i + 1] + 1;
				else
					count[i] = 1;
			}
			for (Integer cnt : count) {
				System.out.print(cnt + " ");
			}
			System.out.println();

		}
	}

}
