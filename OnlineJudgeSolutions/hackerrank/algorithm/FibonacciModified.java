import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		BigInteger t1 = BigInteger.valueOf(a);
		BigInteger t2 = BigInteger.valueOf(b);
		BigInteger temp;

		BigInteger tmp;
		int n = sc.nextInt();
		if (n <= 2) {
			if (n == 1) {
				System.out.println(t1);
			} else {
				System.out.println(t2);
			}
		} else {
			for (int i = 1; i <= n - 2; i++) {
				temp = t2.multiply(t2);
				tmp = t1.add(temp);
				t1 = t2;
				t2 = tmp;
			}
			System.out.println(t2);
		}
	}
}