import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_f2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			if (10 <= y && y <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		

		sc.close();
	}

}
