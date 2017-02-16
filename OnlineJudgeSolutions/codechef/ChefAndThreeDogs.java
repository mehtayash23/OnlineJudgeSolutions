import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class ChefAndThreeDogs {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		DecimalFormat requiredFormat = new DecimalFormat("0.000000");
		while (t-- > 0) {
			String sAndv[] = br.readLine().split(" ");
			double s = Double.parseDouble(sAndv[0]);
			double v = Double.parseDouble(sAndv[1]);
			double distance = (2.0 * s) / 3.0;
			double time = distance / v;
			System.out.println(requiredFormat.format(time));
		}
	}

}