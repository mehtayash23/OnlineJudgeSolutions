import java.util.Scanner;

public class BonApetit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();

		}
		int charged = in.nextInt();
		for (int i = 0; i < n; i++) {
			if (i != k)
				sum += arr[i];
		}
		if (sum / 2 == charged)
			System.out.println("Bon Appetit");
		else
			System.out.println(charged - (sum / 2));

	}
}