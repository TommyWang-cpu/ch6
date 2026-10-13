import java.util.Scanner;
public class SquareRoot{

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println(squareRoot(a));
	}
		
	public static double squareRoot(double x){
		double sqrt = Math.sqrt(x);
		double i =x/2.0;
		double differ = Math.abs(x - sqrt);
		while  (differ >= 0.0001){
			i = (i+x / i) / 2;
			System.out.println(i);
		}
		return i;
	}
}
