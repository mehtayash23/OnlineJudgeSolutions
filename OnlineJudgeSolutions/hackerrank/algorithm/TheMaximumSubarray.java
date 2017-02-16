import java.util.Scanner;

public class TheMaximumSubarray {
	public static void main(String[] args) {
		int t = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t != 0) {
			int n = 0;
			n = sc.nextInt();
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int sumContiguous = maxSubArraySum(a, a.length);// Contiguous
			int sumNonContiguous = nonCongSum(a, a.length);// Non Contiguous
			System.out.println(sumContiguous + " " + sumNonContiguous);
			t--;
		}
	}

	public static int maxSubArraySum(int a[], int size) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		boolean positive = false;
		for (int i = 0; i < size; i++) {
			if (a[i] > 0) {
				positive = true;
				break;
			}
		}
		if (positive == true) {
			for (int i = 0; i < size; i++) {
				maxEndingHere = maxEndingHere + a[i];
				if (maxEndingHere < 0) {
					maxEndingHere = 0;
				}
				if (maxSoFar < maxEndingHere) {
					maxSoFar = maxEndingHere;
				}
			}
		} else {
			maxSoFar = a[0];
			for (int i = 1; i < size; i++) {
				if (a[i] > maxSoFar) {
					maxSoFar = a[i];
				}
			}
		}
		return maxSoFar;
	}

	public static int nonCongSum(int a[], int size) {
		int sum = 0;
		boolean positive = false;
		for (int i = 0; i < size; i++) {
			if (a[i] > 0) {
				positive = true;
				break;
			}
		}
		if (positive == true) {
			for (int i = 0; i < size; i++) {
				if (a[i] > 0) {
					sum += a[i];
				}
			}
		} else {
			int max = a[0];
			for (int i = 1; i < size; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			sum = max;
		}
		return sum;
	}
}
