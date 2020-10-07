package task_1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int n = getRandomValueFromRange(1, 10);
		int m = getRandomValueFromRange(1, 10);

		ArrayList<ArrayList<Car>> arrayOfCarsList = new ArrayList();
		for (int i = 0; i < n; i++) {
			ArrayList<Car> arrayOfCarsArrayList = new ArrayList();
			for (int j = 0; j < m; j++) {
				Car car = new Car(getRandomNumberInRange(1100, 5400), getRandomNumberInRange(1990, 2018),
						new Helm(getRandomNumberInRange(10, 20), "skin"), new Engine(getRandomNumberInRange(3, 6)));
				arrayOfCarsArrayList.add(car);
			}
			arrayOfCarsList.add(arrayOfCarsArrayList);
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Array of cars = " + arrayOfCarsList.toString());
				break;
			}
			case "2": {
				arrayOfCarsList.clear();
				for (int i = 0; i < n; i++) {
					ArrayList<Car> arrayOfCarsArrayList = new ArrayList();
					for (int j = 0; j < m; j++) {
						Car car = new Car(1800, 2005, new Helm(16, "skin"), new Engine(4));
						arrayOfCarsArrayList.add(car);
					}
					arrayOfCarsList.add(arrayOfCarsArrayList);
					System.out.println("Array of cars = " + arrayOfCarsList.toString());
					break;
				}
			}
			}
		}

	}

	static void menu() {
		System.out.println("Press 1 to output data of the array on the console");
		System.out.println("Press 2 to set all field Object Car default values");
	}

		public static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min values must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt((max - min + 1) + min);
	}

	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int) (Math.random() * ((max - min) + 1)) + min;
	}

}