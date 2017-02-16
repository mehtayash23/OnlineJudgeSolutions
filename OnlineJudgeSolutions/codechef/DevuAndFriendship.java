import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DevuAndFriendship {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			List<Integer> friends = new ArrayList<Integer>();
			int n = in.nextInt();
			int d[] = new int[n];
			for (int i = 0; i < n; i++) {
				d[i] = in.nextInt();
				if (!friends.contains(d[i])) {
					friends.add(d[i]);
				}
			}
			System.out.println(friends.size());
		}
	}

}