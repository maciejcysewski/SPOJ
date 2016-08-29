package pesel;

/*
 * http://pl.spoj.com/problems/JPESEL
 */
import java.io.*;

public class Main {

	public static void main (String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int nrOfTests, sum = 0;
		String pesel, number;
		int tab[] = new int[11];

		nrOfTests = Integer.parseInt(reader.readLine());

		for (int i = 0; i < nrOfTests; i++) {

			pesel = reader.readLine();

			for (int ix = 0; ix < pesel.length(); ix++) {
				if (ix == 0) tab[ix] = pesel.charAt(ix) * 1;
				if (ix == 1) tab[ix] = pesel.charAt(ix) * 3;
				if (ix == 2) tab[ix] = pesel.charAt(ix) * 7;
				if (ix == 3) tab[ix] = pesel.charAt(ix) * 9;
				if (ix == 4) tab[ix] = pesel.charAt(ix) * 1;
				if (ix == 5) tab[ix] = pesel.charAt(ix) * 3;
				if (ix == 6) tab[ix] = pesel.charAt(ix) * 7;
				if (ix == 7) tab[ix] = pesel.charAt(ix) * 9;
				if (ix == 8) tab[ix] = pesel.charAt(ix) * 1;
				if (ix == 9) tab[ix] = pesel.charAt(ix) * 3;
				if (ix == 10) tab[ix] = pesel.charAt(ix) * 1;
				sum += tab[ix];
			}

			number = String.valueOf(sum);
			if (number.charAt(number.length()-1) == '0') {
				System.out.println("D ");
			} else {
				System.out.println("N ");
			}
			sum = 0;
		}
	}
}
