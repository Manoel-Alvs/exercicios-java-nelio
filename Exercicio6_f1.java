import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_f1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		for (int i = 0; (2 * i + 1) <= x; i++) {
			System.out.println(2 * i + 1);
		}
		sc.close();
	}

}
