public class RightTriangle {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		boolean arePositive = (a > 0) && (b > 0) && (c > 0);

		int max = Math.max(Math.max(a,b), Math.max(b,c));
		int min = Math.min(Math.min(a,b), Math.min(b,c));
		int mid = Math.max(Math.min(a,b), Math.min(b,c));

		int term1 = (min * min) + (mid * mid);
		int term2 = (max * max);
		boolean pythagCorrect = (term1 == term2); 

		boolean isRightTriangle = arePositive && pythagCorrect;
		System.out.println(isRightTriangle);
	}
}
