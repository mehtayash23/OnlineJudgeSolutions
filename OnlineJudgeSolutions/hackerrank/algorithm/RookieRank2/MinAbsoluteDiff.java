//https://www.hackerrank.com/contests/rookierank-2/challenges/minimum-absolute-difference-in-an-array

import java.util.Arrays;
import java.util.Scanner;

class MinAbsoluteDiff {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.parallelSort(a);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int diff = Math.abs(a[i] - a[i + 1]);
			if (diff < min)
				min = diff;
		}
		System.out.println(min);
	}

}
