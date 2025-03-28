import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double r, area, pi;
		pi = 3.14159;
		
		System.out.println("Digite o tamanho do raio: ");
		r = sc.nextDouble();
		
		area = pi*(Math.pow(r,2));
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
