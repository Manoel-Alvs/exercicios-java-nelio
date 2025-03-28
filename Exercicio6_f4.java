import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_f4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double media = x / y;
			if (y == 0) {
				System.out.println("divisão impossível");
			} else {
				System.out.printf("%.1f%n", media);
			}
		}

		sc.close();

	}

}
