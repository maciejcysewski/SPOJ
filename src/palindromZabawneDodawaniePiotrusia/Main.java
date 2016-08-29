package palindromZabawneDodawaniePiotrusia;

import java.io.*;

/*
 * http://pl.spoj.com/problems/BFN1/
 */
public class Main {

	static int tests, counter, number1, number2, sum;
	static String numberA, numberB, sumOfTheNumbers;
	static boolean palindrome = false;

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {

			//ile testów
			tests = Integer.parseInt(reader.readLine());

			for (int i = 0; i < tests; i++) {
				
				//jaka liczba
				sum = Integer.parseInt(reader.readLine());
				
				//sprawdza palindrome
				palindrome(sum);
	
				while (palindrome == false) {
					counter += 1;
					conversion(sum);
					palindrome(sum); //sprawdz palindrom dla nowych liczb
				}
	
				if (palindrome == true) {
					System.out.println(sum + " " + counter);
					counter = 0;
				}
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

	static void conversion(int a) {
		number1 = a;
		numberA = String.valueOf(number1);
		numberB = new StringBuffer(numberA).reverse().toString(); // odwrocenie ci¹gu znaków i zapisanie do nowej zmiennej
		number2 = Integer.valueOf(numberB);

		sum = number1 + number2;

		sumOfTheNumbers = String.valueOf(sum);
	}

	static void palindrome(int sum) {

		sumOfTheNumbers = String.valueOf(sum);

		if (sumOfTheNumbers.length()/2 == 0) {
			palindrome = true;
		} else {
			for (int i = 0; i < sumOfTheNumbers.length()/2; i++) {
				if ( sumOfTheNumbers.charAt(i) == sumOfTheNumbers.charAt( sumOfTheNumbers.length()-1-i ) ) {
					palindrome = true;
				} else {
					palindrome = false;
				}
			}
		}
	}
}