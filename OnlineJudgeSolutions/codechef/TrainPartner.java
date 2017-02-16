import java.util.Scanner;

class TrainPartner {
	static long mod = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String block[] = { "1LB", "2MB", "3UB", "4LB", "5MB", "6UB", "7SL",
				"8SU" };
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int toFindBlock = n % 8;
			if (toFindBlock == 0)
				toFindBlock = 8;

			String seat = block[toFindBlock - 1];
			// System.out.println("Seat: "+seat);
			if (seat.charAt(0) == '1') {
				System.out.println((n + 3) + "LB");
			} else if (seat.charAt(0) == '2') {
				System.out.println((n + 3) + "MB");
			} else if (seat.charAt(0) == '3') {
				System.out.println((n + 3) + "UB");
			} else if (seat.charAt(0) == '4') {
				System.out.println((n - 3) + "LB");
			} else if (seat.charAt(0) == '5') {
				System.out.println((n - 3) + "MB");
			} else if (seat.charAt(0) == '6') {
				System.out.println((n - 3) + "UB");
			} else if (seat.charAt(0) == '7') {
				System.out.println((n + 1) + "SU");
			} else if (seat.charAt(0) == '8') {
				System.out.println((n - 1) + "SL");
			}
		}
	}

}
