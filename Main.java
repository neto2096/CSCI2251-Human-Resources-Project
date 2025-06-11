/*
Name: Ernesto Morales Carrasco
Email: emoralescarras@cnm.edu
Assignment: Human Resources Part 1
Purpose: Read HR data from hr.txt, store unique Person objects in a PersonSet, and display them, implementing inheritance.

Questions with answers:
Q1: Car and Engine are related by (Composition). Engine is tied to Car.
Q2: Color and Red are related by (Inheritance). Red is a type of Color.
Q3: Shirt and Clothing are related by (Inheritance). Shirt is a type of Clothing.
Q4: Furniture and Desk are related by which (Inheritance). Desk is a type of Furniture.
Q5: CellPhone and Battery are related by (Composition). Battery is tied to CellPhone.
*/

// import java.io.FileWriter; -- Not used for Part 1, outputs are on terminal
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Testing Part 1:");
		System.out.println("");

		// Ensure file is given in command-line
		if (args.length != 1) {
			System.out.println("Usage: java Main <filename>");
			return;
		}

		// Instantiate a Person object
		Person testPerson = new Person("Yoshi", 177.0, 80.0);
		System.out.println("Test Person: " + testPerson);

		// Instantiate a PersonSet object
		PersonSet personSet = new PersonSet();
		personSet.add(testPerson);
		System.out.println("Initial PersonSet:\n" + personSet);

		// Read data from hr.txt and display it on the command line
		try (Scanner fileReader = new Scanner(new File(args[0]))) {
			fileReader.nextLine(); // Skip header row
			while (fileReader.hasNext()) {
				try {
					String name = fileReader.next();
					double height = fileReader.nextDouble();
					double weight = fileReader.nextDouble();
					Person person = new Person(name, height, weight);
					personSet.add(person);
				} catch (Exception e) {
					System.out.println("Error parsing line, skipping...");
					fileReader.nextLine(); // Skip to next line
				}
			}
			System.out.println("PersonSet after reading hr.txt:\n" + personSet);

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
