import java.io.BufferedReader;
import java.io.InputStreamReader;

class Laddu {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int activities = 0;
		int laddu = 0;
		int months, num;
		String combined, origin, act_temp;
		int t;
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			laddu = 0;
			combined = br.readLine();
			String[] com = combined.trim().split(" ");
			origin = com[1];
			activities = Integer.parseInt(com[0]);

			while (activities > 0) {
				act_temp = br.readLine();
				switch (act_temp) {
				case "TOP_CONTRIBUTOR":
					laddu += 300;
					break;
				case "CONTEST_HOSTED":
					laddu += 50;
					break;
				}
				if ((!act_temp.equals("TOP_CONTRIBUTOR"))
						&& (!act_temp.equals("CONTEST_HOSTED"))) {
					com = act_temp.trim().split(" ");
					num = Integer.parseInt(com[1]);
					switch (com[0]) {
					case "BUG_FOUND":
						laddu += num;
						break;
					case "CONTEST_WON":
						laddu += 300;
						if (num < 20)
							laddu += (20 - num);
						break;
					}
				}
				activities--;
			}
			if (origin.equals("INDIAN"))
				System.out.println(laddu / 200);
			else
				System.out.println(laddu / 400);

		}

	}
}