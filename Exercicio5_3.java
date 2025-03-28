import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ((a >= b) && a%b == 0 ) {
			System.out.println("São multiplos");
		} else if ((a<b) && b%a ==0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}
