package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list= new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		for (int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company(i/c)? ");
			char indOrComp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (indOrComp == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, anualIncome, healthExpenditures));
				
			} else {
				System.out.print("Number of employees: ");
				int nEmployees = sc.nextInt();
				list.add(new LegalPerson(name, anualIncome, nEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID");
		double totalTax = 0.0;
		for(Person person : list) {
			System.out.println(person);
			totalTax += person.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES $ %.2f", totalTax);

		sc.close();

	}

}
