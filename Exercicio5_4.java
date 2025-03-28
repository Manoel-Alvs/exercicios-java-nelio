import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		if (b > a) {
			c = b - a;
			System.out.printf("O JOGOU DUROU %d HORA(S)", c);
		} else {
			c = (24 + b - a);
			System.out.printf("O JOGOU DUROU %d HORA(S)", c);
		}
		sc.close();
	}

}
