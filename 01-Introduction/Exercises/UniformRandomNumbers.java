public class UniformRandomNumbers {
	public static void main (String[] args) {
		double x1 = Math.random();
		double x2 = Math.random();
		double x3 = Math.random();
		double x4 = Math.random();
		double x5 = Math.random();

		double avg = (x1 + x2 + x3 + x4 + x5)/5;

		double[] myArr = {x1, x2, x3, x4, x5};
		double maxVal = 0;
		double minVal = 1000;

		for(double x: myArr) {
			System.out.println(x);
			if(Math.max(maxVal, x) > maxVal)
				maxVal = x;
			if(Math.min(minVal, x) < minVal)
				minVal = x;
		}

		System.out.println("Max Val: " + maxVal);
		System.out.println("Min Val: " + minVal);
		System.out.println("Average: " + avg);
	}
}
		

