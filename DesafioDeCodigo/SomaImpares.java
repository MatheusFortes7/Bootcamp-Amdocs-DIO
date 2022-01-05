import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
    int x = sc.nextInt();
    int y = sc.nextInt();
    int aux = 0;
    if(x > y){
      aux = x;
      x = y;
      y = aux;
    }
    x++;
    
    if(x%2==0) x++;
    
    int soma = 0;
    
    for(int i = x ; i < y; i = i + 2){
      soma =+ i;
    }
    
    System.out.println(soma);
    
	}
}