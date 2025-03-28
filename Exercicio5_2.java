import java.util.Scanner;
import java.util.Locale;


public class Exercicio5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o número escolhido:");
		int a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
	
		sc.close();
	}

}
