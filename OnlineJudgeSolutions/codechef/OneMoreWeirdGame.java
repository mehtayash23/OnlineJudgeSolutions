import java.util.Scanner;

class OneMoreWeirdGame {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println(n * (m - 1) + m * (n - 1));
		}
	}

}