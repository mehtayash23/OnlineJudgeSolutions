import java.util.Scanner;

class ChefAndDigitOfANumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String s = in.next();
			int cntOne = 0;
			int cntZero = 0;
			int len = s.length();
			for (int i = 0; i < len; i++) {
				if (s.charAt(i) == '1') {
					cntOne += 1;
				} else {
					cntZero += 1;
				}
			}
			if (cntOne == 1 || cntZero == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}