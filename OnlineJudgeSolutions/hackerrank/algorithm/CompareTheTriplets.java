import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int aPoint = 0;
		int bPoint = 0;
		if (a0 > b0)
			aPoint += 1;
		if (b0 > a0)
			bPoint += 1;
		if (a1 > b1)
			aPoint += 1;
		if (b1 > a1)
			bPoint += 1;
		if (a2 > b2)
			aPoint += 1;
		if (b2 > a2)
			bPoint += 1;
		System.out.println(aPoint + " " + bPoint);
	}
}