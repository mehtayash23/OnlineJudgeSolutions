import java.util.Scanner;

class ChefAndChocolate {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			if (n * m % 2 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}