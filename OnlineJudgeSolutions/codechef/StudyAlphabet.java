import java.util.Scanner;

class StudyAlphabet {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		char knows[] = s.toCharArray();
		while (n-- > 0) {
			boolean know = false;
			char temp[] = in.next().toCharArray();
			for (int i = 0; i < temp.length; i++) {
				know = false;
				for (int j = 0; j < knows.length; j++) {
					if (temp[i] == knows[j]) {
						know = true;
						break;
					}
				}
				if (know == false)
					break;
			}
			if (know == false)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}