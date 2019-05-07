package CarLot;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> usedCars = new ArrayList<>();
		usedCars.add(new usedCar("GMC", "Sonoma", 1999, 1500.00, 156000));
		usedCars.add(new usedCar("Chevy", "Silverado", 2006, 3500.00, 90000));
		usedCars.add(new usedCar("Ford", "focus", 2003, 2500.00, 102030));
		usedCars.add(new Car("Mazda", "Miata", 2019, 32000));
		usedCars.add(new Car("BMW", "M5", 2019, 55000));
		usedCars.add(new Car("Porche", "911 spyder", 2019, 77576));
		String restart = "yes";
			
		int userNum;
		
		do {
			for (int x = 0; x < usedCars.size(); x++) {
				System.out.println(usedCars.get(x));
			}
			System.out.println("Cars are listed in order 1 - 6. Please select the car you would like to buy");
			userNum = scan.nextInt() - 1;
			System.out.println(usedCars.get(userNum));
			System.out.println("was this your car? Yes/No");
			String userAnswer = scan.next();
			if (userAnswer.equalsIgnoreCase("yes")) {
				usedCars.remove(userNum);
				for (int x = 0; x < usedCars.size(); x++) {
					System.out.println(usedCars.get(x));}
					restart = "turtle";
					break;
				
			} else if (userAnswer.equalsIgnoreCase("no")) {
				continue;
			} else {
				System.out.println("Yes or no not found here let me restart you");
				continue;
			}

		} while (restart.equalsIgnoreCase("yes"));

	}
}
