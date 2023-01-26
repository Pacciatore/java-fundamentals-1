package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		String name = "";

		String[] whiteList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		System.out.println("Benvenuto al Ferragnez Party!");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

		Scanner s = new Scanner(System.in);

		System.out.println("Come ti chiami?");
		name = s.nextLine().trim();

		s.close();

	}

}
