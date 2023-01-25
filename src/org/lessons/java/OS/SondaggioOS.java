package org.lessons.java.OS;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SondaggioOS {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.CEILING);

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

		macPercentage = (double) macCounter / (double) totalStudents;
		windowsPercentage = (double) windowsCounter / (double) totalStudents;
		linuxPercentage = (double) linuxCounter / (double) totalStudents;
		otherPercentage = (double) otherCounter / (double) totalStudents;

		System.out.println("------------------------------");
		System.out.println("Risultato sondaggio: ");

		System.out.println("Totale studenti: " + totalStudents);
		System.out.print("MacOS: " + macCounter);
		System.out.println(" | Percentuale: " + df.format(((float) macPercentage) * 100) + "%");
		System.out.print("Windows: " + windowsCounter);
		System.out.println(" | Percentuale: " + df.format(((float) windowsPercentage) * 100) + "%");
		System.out.print("Linux: " + linuxCounter);
		System.out.println(" | Percentuale: " + df.format(((float) linuxPercentage) * 100) + "%");
		System.out.print("Altro: " + otherCounter);
		System.out.println(" | Percentuale: " + df.format(((float) otherPercentage) * 100) + "%");

	}

}
