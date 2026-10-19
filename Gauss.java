import java.util.Scanner;
public class Gauss{
	
	public static void main(String[] args) {
		
		System.out.println("Enter your x");
		Scanner in1 = new Scanner(System.in);
        int x = in1.nextInt();
        
        System.out.println("Enter your n");
        Scanner in2 = new Scanner(System.in);
        int n = in2.nextInt();

        System.out.println(gauss(x, n));
    }

    public static double gauss(int x, int n) {
		
        double sum = 0.0;
        double term = 1.0;

        for (int i = 0; i < n; i++) {
            sum += term;
            term *= -x * x / (i + 1);
        }

        return sum;
    }


}
