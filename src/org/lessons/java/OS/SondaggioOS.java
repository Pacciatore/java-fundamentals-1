package org.lessons.java.OS;

import java.util.Scanner;

public class SondaggioOS {

	public static void main(String[] args) {

		short macCounter = 0;
		short windowsCounter = 0;
		short linuxCounter = 0;
		short otherCounter = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Quanti studenti utilizzano MacOS? (Inserire numero)");
		macCounter = s.nextShort();

		System.out.println("Quanti studenti utilizzano Windows? (Inserire numero)");
		windowsCounter = s.nextShort();

		System.out.println("Quanti studenti utilizzano Linux? (Inserire numero)");
		linuxCounter = s.nextShort();

		System.out.println("Quanti studenti utilizzano altri sistemi operativi? (Inserire numero)");
		otherCounter = s.nextShort();

		s.close();

		System.out.println("------------------------------");
		System.out.println("Risultato sondaggio: ");

		System.out.println("MacOS: " + macCounter);
		System.out.println("Windows: " + windowsCounter);
		System.out.println("Linux: " + linuxCounter);
		System.out.println("Altro: " + otherCounter);

	}

}
