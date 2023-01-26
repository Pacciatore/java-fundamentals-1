package org.lessons.java.train;

import java.util.Scanner;

public class CalcolaBiglietto {

	static final float TICKET_COST = 0.21f;

	static final float JUNIOR_DISCOUNT = 0.2f;
	static final float SENIOR_DISCOUNT = 0.4f;

	static final int JUNIOR_AGE_UPPER_LIMIT = 18;
	static final int SENIOR_AGE = 65;

	public static void main(String[] args) {

		float ticketTotal = 0f; // Variable

		float kmToTravel = 0f; // Variable
		int passengerAge = 0; // Variable

		System.out.println("Benvenuto nel tuo calcolatore di biglietti personale!");

		Scanner s = new Scanner(System.in);

		System.out.print("Inserire età del passeggero: ");
		passengerAge = Integer.parseInt(s.nextLine());

		System.out.print("Inserire distanza da percorrere in km (usare il punto come separatore decimale): ");
		kmToTravel = Float.parseFloat(s.nextLine());

		s.close();

		ticketTotal = TICKET_COST * kmToTravel;

		if (passengerAge < JUNIOR_AGE_UPPER_LIMIT) {
			ticketTotal -= ticketTotal * JUNIOR_DISCOUNT;
		} else if (passengerAge > SENIOR_AGE) {
			ticketTotal -= ticketTotal * SENIOR_DISCOUNT;
		}

		System.out.println("");
		System.out.println("Età del passegero: " + passengerAge);
		System.out.println("Distanza da percorrere: " + kmToTravel + "km");
		System.out.println("");

		if (passengerAge < JUNIOR_AGE_UPPER_LIMIT)
			System.out.println("Sconto per minorenni applicato!");

		if (passengerAge > SENIOR_AGE)
			System.out.println("Sconto per over " + SENIOR_AGE + " applicato!");

		System.out.println("-----------------------------");
		System.out.println("Il costo del biglietto è di: " + ticketTotal + "€");

	}

}
