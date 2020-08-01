import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Tax;

public class Program_Tax_Cal {

	public static void main(String[] args) {
		// Programa para calcular Taxa.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Tax> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anual_Income = sc.nextDouble();
			if (ch == i) {
				System.out.print("Health expenditures: ");
				double health_Expenditures = sc.nextDouble();
				list.add(new Individual(name,anual_Income,health_Expenditures));
			}
			
		}
		
		
		
		sc.close();
	}

}
