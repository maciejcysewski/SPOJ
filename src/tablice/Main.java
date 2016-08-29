package tablice;

import java.util.Scanner;

/*
 * http://pl.spoj.com/problems/PP0502B/
 */
public class Main {

	public static void main(String[] args) {

		int t, n;
		Scanner scanner = new Scanner(System.in);

		//ile testow?
		t = scanner.nextInt();

		//dla kazdego testu(tablic)
		for (int i = 0; i < t; i++){

			//wielkosc tablicy
			n = scanner.nextInt();

			int[] tablica1 = new int[n];

			//wypelnij tablice
			for (int y = 0; y < n; y++){
				tablica1[y] = scanner.nextInt();//przypisuj od poczatku tablicy
			}

			//wyswielt odwrocona tablice
			for (int z = n-1; z >= 0; z--){
				System.out.print(tablica1[z] + " ");
			}
			System.out.println('\n');
		}
		scanner.close();
	}
}
