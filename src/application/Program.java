package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Bill bill  = new Bill();

		System.out.println("Digite o seu sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas");
		bill.beer = sc.nextInt();
		
		System.out.println("Quantidade de refrigerantes");
		bill.softDrink = sc.nextInt();
		
		System.out.println("Quantidade de espetinho");
		bill.barbecue = sc.nextInt();
		

		
		System.out.println("\nRelatório\n");
		System.out.println("Consumo = R$ " + bill.cover()
				);
		if(bill.feeding() == 0) {
			System.out.println("Isento de Couvert");
			
		}
		else{
			System.out.println("Couvert = R$ " + bill.feeding());
		}
		
		System.out.println("Ingresso = R$ " + bill.ticket());
		
		System.out.println("\n Valor a pagar = R$ " + bill.total());
		
	}
}
