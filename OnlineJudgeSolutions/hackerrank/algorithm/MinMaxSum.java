//https://www.hackerrank.com/challenges/mini-max-sum

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] num = new long[5];
		for (int i = 0; i < 5; i++) {
			num[i] = in.nextInt();
		}
		Arrays.sort(num);
		System.out.println((num[0] + num[1] + num[2] + num[3]) + " "
				+ (num[1] + num[2] + num[3] + num[4]));

	}
}
