import java.util.Scanner;

class AndarshAndStipendium {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			boolean fail = false;
			boolean top = false;
			int sum = 0;
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int a = in.nextInt();
				fail = a == 2 ? true : fail;
				top = a == 5 ? true : top;
				sum += a;
			}
			System.out.println(!fail && top && sum / n >= 4 ? "Yes" : "No");
		}
	}
}