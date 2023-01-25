package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {

		String name = "";
		String surname = "";
		String color = "";
		byte birthDay = 0;
		byte birthMonth = 0;
		short birthYear = 0;
		short passwordNumber = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Benvenuto nel generatore di password!");

		System.out.println("Inserire nome: ");
		name = s.nextLine();

		System.out.println("Inserire cognome: ");
		surname = s.nextLine();

		System.out.println("Inserire colore preferito: ");
		color = s.nextLine();

		System.out.println("Inserire giorno di nascita: ");
		birthDay = s.nextByte();

		System.out.println("Inserire mese di nascita: ");
		birthMonth = s.nextByte();

		System.out.println("Inserire anno di nascita: ");
		birthYear = s.nextShort();

		s.close();

		passwordNumber = (short) ((short) birthDay + (short) birthMonth + birthYear);

		System.out.println("----------------------------");
		System.out.println("Riepilogo informazioni");

		System.out.println("Nome: " + name);
		System.out.println("Cognome: " + surname);
		System.out.println("Colore preferito: " + color);
		System.out.println("Data di nascita: " + birthDay + "/" + birthMonth + "/" + birthYear);

		System.out.println("La tua password: " + name + "-" + surname + "-" + color + "-" + passwordNumber);

	}

}
