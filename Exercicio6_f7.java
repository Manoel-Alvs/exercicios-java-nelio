import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_f7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.printf("%d %d %d%n", i, i * i, i * i * i);
		}

		sc.close();

	}

}
