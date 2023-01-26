package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		String name = "";
		boolean found = false;

		String[] whiteList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		System.out.println("Benvenuto al Ferragnez Party!");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Come ti chiami?");
			name = s.nextLine().trim();
		} while (name.length() < 1);

		s.close();

		int i = 0;
		do {

			if (name.toLowerCase().equals(whiteList[i].toLowerCase()))
				found = true;
			i++;

		} while (!found && i < whiteList.length);

//		for (int i = 0; i < whiteList.length; i++) {
//			if (name.toLowerCase().equals(whiteList[i].toLowerCase()))
//				found = true;
//		}

		if (found)
			System.out.println("Prego, puoi entrare.");
		else
			System.out.println("Mi spiace, non sei in lista.");

	}

}
