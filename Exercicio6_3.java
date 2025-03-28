import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, alcool, gasolina, diesel;

		alcool = 0;
		gasolina = 0;
		diesel = 0;
		x = sc.nextInt();

		while (x != 4) {
			if (x == 1) {
				alcool += 1;
			} else if (x == 2) {
				gasolina += 1;
			} else if (x == 3) {
				diesel += 1;
			} 
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("ÁLCOOL: %d%n", alcool);
		System.out.printf("GASOLINA: %d%n", gasolina);
		System.out.printf("DIESEL: %d%n", diesel);
		sc.close();
	}

}
