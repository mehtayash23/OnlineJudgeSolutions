import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int count = 0;
			long[] digits = new long[10];
			int index = -1;
			long no = sc.nextInt();
			long temp = no;
			while (no > 0) {
				index += 1;
				digits[index] = no % 10;
				no = no / 10;
			}
			for (int i = 0; i <= index; i++) {
				if (digits[i] != 0) {
					if (temp % digits[i] == 0) {
						count += 1;
					}
				}
			}
			System.out.println(count);
			t--;
		}
	}
}
