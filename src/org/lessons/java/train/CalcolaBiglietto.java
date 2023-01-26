package org.lessons.java.train;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {

		float ticketCost = 0.21f; // Constant
		float ticketTotal = 0f; // Variable

		float juniorDiscount = 0.2f; // Constant
		float seniorDiscount = 0.4f; // Constant

		int juniorAgeUpperLimit = 18; // Constant
		int seniorAge = 65; // Constant

		float kmToTravel = 0f; // Variable
		int passengerAge = 0; // Variable

		System.out.println("Benvenuto nel tuo calcolatore di biglietti personale!");

		Scanner s = new Scanner(System.in);

		System.out.print("Inserire età del passeggero: ");
		passengerAge = Integer.parseInt(s.nextLine());

		System.out.print("Inserire distanza da percorrere in km (usare il punto come separatore decimale): ");
		kmToTravel = Float.parseFloat(s.nextLine());

		s.close();

		ticketTotal = ticketCost * kmToTravel;

		if (passengerAge < juniorAgeUpperLimit) {
			ticketTotal -= ticketTotal * juniorDiscount;
		} else if (passengerAge > seniorAge) {
			ticketTotal -= ticketTotal * seniorDiscount;
		}

		System.out.println("");
		System.out.println("Età del passegero: " + passengerAge);
		System.out.println("Distanza da percorrere: " + kmToTravel + "km");
		System.out.println("");

		if (passengerAge < juniorAgeUpperLimit)
			System.out.println("Sconto per minorenni applicato!");

		if (passengerAge > seniorAge)
			System.out.println("Sconto per over " + seniorAge + " applicato!");

		System.out.println("-----------------------------");
		System.out.println("Il costo del biglietto è di: " + ticketTotal + "€");

	}

}
