
import java.util.Locale;
import java.util.Scanner;
import thiago.Cauculate;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cauculate cauculate = new Cauculate();

		

		System.out.print("Enter Full Name : ");
		cauculate.name = sc.nextLine();
		System.out.print("Enter Income : €");
		cauculate.income = sc.nextDouble();
		System.out.print("Enter Tax Credts : €");
		cauculate.taxcredt = sc.nextDouble();
		System.out.print("Enter Tax Deducted : €");
		cauculate.taxdeducted = sc.nextDouble();
	
		System.out.println("--------------------------------");
		System.out.printf("Tax Due: € %.2f%n", cauculate.taxDue());
		System.out.printf("Adjustments: € %.2f%n", cauculate.adjustments());
		System.out.printf("PAYE Result: € %.2f%n", cauculate.payeResulted());
		
		System.out.println("--------------------------------");
		System.out.print("Enter USC: €");
		cauculate.usc = sc.nextDouble();
		
		System.out.println("--------------------------------");
		System.out.printf("Total USC Result: € %.2f%n", cauculate.uscResulted());
		System.out.printf("Total of Result: € %.2f%n", cauculate.totalResulted());
		
		System.out.println("--------------------------------");
		System.out.printf("TREATMENT OF RESULT: € %.2f%n", cauculate.totalOfResult());

		

	  

		

		sc.close();

	}
	
}

