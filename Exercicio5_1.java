import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número:");
		int a = sc.nextInt();
		
		if (a >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
