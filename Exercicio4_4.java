import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hour;
		double value, salary;
		
		number = sc.nextInt();
		hour = sc.nextInt();
		value = sc.nextDouble();
		
		salary = hour*value;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
		
	}

}
