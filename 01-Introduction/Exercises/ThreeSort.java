public class ThreeSort {
	public static void main (String[] args) {
		if(args.length != 3)
			System.out.println("Need 3 Command Line Arguments");
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double min;
		double mid;
		double max;

		max = Math.max(Math.max(a,b), Math.max(b,c));
		min = Math.min(Math.min(a,b), Math.min(b,c));
		mid = Math.max(Math.min(a,b), Math.min(b,c));

		System.out.println(min + " " + mid + " " + max);
	}
}
