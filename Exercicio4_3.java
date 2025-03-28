import java.util.Locale; 
import java.util.Scanner;

public class Exercicio4_3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d= sc.nextInt();
		
		diferenca = a*b - c*d;
				
		System.out.printf("DIFERENÇA = %d", diferenca);		
		
		sc.close();	
		
		
	}

}
