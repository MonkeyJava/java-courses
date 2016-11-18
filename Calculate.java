public class Calculate{
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first+second;
		double i = Double.valueOf(arg[2]);
		double j = summ / i;
		
		System.out.println("Sum " + summ);
		System.out.println("Result " + j);
		}
}