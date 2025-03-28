import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		java.util.Locale.setDefault(Locale.US);
		
		double c1 = 4.00;
		double c2 = 4.50;
		double c3 = 5.00;
		double c4 = 2.00;
		double c5 = 1.50;
		double p;
		int c, q;
		
		c = sc.nextInt();
		q = sc.nextInt();
		
		if (c==1) {
			p = q*c1;
			System.out.printf("TOTAL: R$ %.2f%n", p);
		} else if (c==2) {
			p = q*c2;
			System.out.printf("TOTAL: R$ %.2f%n", p);
		} else if (c==3) {
			p = q*c3;
			System.out.printf("TOTAL: R$ %.2f%n", p);
		} else if (c==4) {
			p = q*c4;
			System.out.printf("TOTAL: R$ %.2f%n", p);
		} else if (c==5) {
			p = q*c5;
			System.out.printf("TOTAL: R$ %.2f%n", p);
		}
		
		
		sc.close();
	}

}
