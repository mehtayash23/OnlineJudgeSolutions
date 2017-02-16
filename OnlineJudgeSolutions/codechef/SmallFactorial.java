import java.util.Scanner;

class SmallFactorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			long fact = 1;
			for (int i = 2; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
			t--;
		}
	}
}