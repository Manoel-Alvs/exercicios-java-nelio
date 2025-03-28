import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua renda?");
		double renda = sc.nextDouble();
		double imposto;
		
		if (renda > 0 && renda <= 2000) {
			System.out.println("ISENTO");
		} else if (renda > 2000 && renda <= 3000) {
			imposto = (renda - 2000)*0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else if (renda > 3000 && renda <= 4500) {
			imposto = (renda - 3000)*0.18 + 1000*0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = (renda - 4500)*0.28 + 1500*0.18 + 1000*0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		
		sc.close();
	

	}

}
