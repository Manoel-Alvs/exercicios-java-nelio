import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_f3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double media = (2 * x + 3 * y + 5 * z) / 10;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
