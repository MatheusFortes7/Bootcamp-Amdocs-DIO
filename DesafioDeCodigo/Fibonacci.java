import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  
	  double n = sc.nextInt();
    double fibonacci = (Math.pow((1 + Math.sqrt(5)) / 2 , n) - Math.pow((1 - Math.sqrt(5)) / 2 , n)) / Math.sqrt(5);
    
    System.out.println(String.format("%.1f", fibonacci));

	}
}