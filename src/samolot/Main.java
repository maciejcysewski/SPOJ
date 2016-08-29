package samolot;

import java.util.Scanner;

/*
 * http://pl.spoj.com/problems/POTSAM/
 */
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n1, n2, k1, k2;

		n1 = in.nextInt();
		k1 = in.nextInt();
		n2 = in.nextInt();
		k2 = in.nextInt();

		System.out.println(((n1*k1)+(n2*k2)));
	}
}