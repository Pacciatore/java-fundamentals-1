package org.lessons.java.food;

public class CibiPreferiti {

	public static void main(String[] args) {

		String[] myFood = { "Pizza", "Lasagna", "Pasta e lenticchie", "Pasta al forno", "Bolognese" };

		System.out.println("Elementi della classifica: " + myFood.length);
		System.out.println("");

		System.out.println("Primo posto in classifica: " + myFood[0]);

		if (myFood.length % 2 == 0)
			System.out.println("Impossibile determinare la mediana, gli elementi in classifica sono in numero pari.");
		else
			System.out.println("Il cibo in posizione mediana è: " + myFood[myFood.length / 2]);

		System.out.println("Ultimo posto in classifica: " + myFood[myFood.length - 1]);

	}

}
