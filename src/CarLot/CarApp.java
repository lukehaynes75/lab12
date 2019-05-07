package CarLot;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		ArrayList<Car> carApp = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		System.out.println("How many cars would you like to add to your list");
		int numCars = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numCars; i++) {
			
			System.out.println("Enter make of car");
			String make = scan.nextLine();
			
			System.out.println("Enter model of car");
			String model = scan.nextLine();

			System.out.println("Enter year of car");
			int year = scan.nextInt();

			System.out.println("Enter price of car");
			double price = scan.nextDouble();
			scan.nextLine();
			carApp.add(new Car(make, model, year, price));

		}
		for(int x = 0; x < carApp.size(); x++) {
			System.out.println(carApp.get(x));
		}
		
		scan.close();
	}

}
