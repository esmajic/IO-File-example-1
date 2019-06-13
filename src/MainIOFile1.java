
//Prepostavimo da tekstualni file sadrži neodredeni broj cijelih brojeva odvojenih spaceom. 
//Napisati program koji pita korisnika da unese ime file, procita sve brojeve iz filea te ispisuje njihov zbir i 
//prosjek svih unesenih brojeva.
//(Ime fajla je file.txt)

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainIOFile1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter text file name:  ");
		String textFile = input.nextLine();

		File file = new File(textFile);

		if (file.exists()) {
			System.out.println("\nFile " + file.getName() + " exists!");
			Scanner input1 = new Scanner(new FileReader(file));
			int sum = 0;
			int counter = 0;
			int number;

			while (input1.hasNextLine()) {
				String string = input1.nextLine();
				int i = 0;
				for (i = 0; i < 4; i++) {
					String[] parts = string.split(" ");
					String parts1 = parts[i];
					number = Integer.parseInt(parts1);
					sum = sum + number;
					counter++;
				}
			}
			System.out.println("\nSum of all numbers in file " + file.getName() + " is " + sum);
			System.out.println("\nAverage of all numbers in file " + file.getName() + " is " + sum / counter);
			input1.close();
		} else {
			System.out.println("Sorry, file with name " + textFile + " doesn't exist.");
		}
		input.close();
	}

}