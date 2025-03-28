import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, cir, tra, qua, ret, pi = 3.14159;
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		tri = (a*c)/2;
		cir = pi*(Math.pow(c, 2));
		tra = (a+b)*c/2;
		qua = Math.pow(b, 2);
		ret = a*b;
		
		System.out.printf("TRIÂNGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPÉZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETÂNGULO: %.3f%n", ret);
		
		sc.close();	


	}

}
