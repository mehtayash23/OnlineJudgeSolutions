import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams{
	private static final int sumAToZ = 2015;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean ans = isPangram(str);
		if (ans == true) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}

	private static boolean isPangram(String str) {
		str = removeSign(str);
		str = str.toUpperCase();
		Set<Character> charSet = convertToSet(str);
		int sum = findSum(charSet);
		return sum == sumAToZ;
	}

	private static int findSum(Set<Character> charSet) {
		int sum = 0;
		for (char c : charSet) {
			sum += c;
		}
		return sum;
	}

	private static Set<Character> convertToSet(String str) {
		Set<Character> charSet = new HashSet<>();
		for (char c : str.toCharArray()) {
			charSet.add(c);
		}
		return charSet;
	}

	private static String removeSign(String str) {
		return str.replaceAll("[\\s.?!-,'\"]", "");
	}
}