import java.util.Scanner;

class RepeatedString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		int cnt = 0;
		final int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == 'a') {
				cnt++;
			}
		}
		long rem = n % len;
		long answer = ((n - rem) * cnt) / len;
		for (int i = 0; i < rem; i++) {
			if (s.charAt(i) == 'a') {
				answer++;
			}
		}
		System.out.println(answer);
	}
}