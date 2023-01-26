package org.lessons.java.food;

public class CibiPreferiti {

	public static void main(String[] args) {

		String[] myFood = { "Pizza", "Lasagna", "Pasta e lenticchie", "Pasta al forno", "Bolognese" };

		System.out.println("Elementi della classifica: " + myFood.length);
		System.out.println("");

		System.out.println("Primo posto in classifica: " + myFood[0]);

		System.out.println("Ultimo posto in classifica: " + myFood[myFood.length - 1]);

	}

}
