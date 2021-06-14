public class Ex1 {
	public static void main (String[] args) {
		if(args.length != 3) 
			System.out.println("Need 3 Inputs");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if((a == b) && (b == c))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
