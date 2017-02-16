import java.io.IOException;
import java.util.Scanner;

class LibraryFine {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// input starts
		int actualDay = in.nextInt();
		int actualMonth = in.nextInt();
		int actualYear = in.nextInt();
		int expectDay = in.nextInt();
		int expectMonth = in.nextInt();
		int expectYear = in.nextInt();
		// input ends

		// Solving starts
		if (actualYear < expectYear) {
			System.out.println(0);
		} else if (actualMonth < expectMonth && actualYear <= expectYear) {
			System.out.println(0);
		} else if (actualMonth <= expectMonth && actualYear <= expectYear
				&& actualDay <= expectDay) {
			System.out.println(0);
		}

		else if (actualYear == expectYear && actualMonth == expectMonth
				&& actualDay > expectDay) {
			System.out.println(15 * (actualDay - expectDay));
		} else if (actualYear == expectYear && actualMonth > expectMonth) {
			System.out.println(500 * (actualMonth - expectMonth));
		} else {
			System.out.println(10000);
		}
	}

}