import java.util.Scanner;

class StrangeOperation {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			long sum = 0;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				sum += a[i];
			}
			if (k == 1) {
				if (sum % 2 == 0)
					System.out.println("odd");
				else
					System.out.println("even");
			} else {
				System.out.println("even");
			}

		}
	}

}