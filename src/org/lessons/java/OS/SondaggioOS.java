package org.lessons.java.OS;

import java.util.Scanner;

public class SondaggioOS {

	public static void main(String[] args) {

		short macCounter = 0;
		short windowsCounter = 0;
		short linuxCounter = 0;
		short otherCounter = 0;

		short totalStudents = 0;

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

		totalStudents = (short) (linuxCounter + macCounter + otherCounter + windowsCounter);

		double macPercentage = 0D;
		double windowsPercentage = 0D;
		double linuxPercentage = 0D;
		double otherPercentage = 0D;

		System.out.println("------------------------------");
		System.out.println("Risultato sondaggio: ");

		System.out.println("Totale studenti: " + totalStudents);
		System.out.println("MacOS: " + macCounter);
		System.out.println("Windows: " + windowsCounter);
		System.out.println("Linux: " + linuxCounter);
		System.out.println("Altro: " + otherCounter);

	}

}
