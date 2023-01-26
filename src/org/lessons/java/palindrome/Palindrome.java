package org.lessons.java.palindrome;

public class Palindrome {

	public static void main(String[] args) {

		int max = 0;

		int firstN = 0;
		int secondN = 0;

		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {

				int n = i * j;

				String nString = String.valueOf(n);

				String nStringReverse = "";

				for (int k = nString.length() - 1; k >= 0; k--) {
					nStringReverse += nString.charAt(k);
				}

				int nReverse = Integer.parseInt(nStringReverse);

				if (n == nReverse && n > max) {
					max = n;
					firstN = i;
					secondN = j;
				}
			}
		}

		System.out.println("Max palindrome: " + max);
		System.out.printf("Prodotto da: %d * %d", firstN, secondN);

	}

}
