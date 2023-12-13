package application;

import entities.Car;
import entities.Motorcycle;
import entities.Vehicle;

public class Program {

	public static void main(String[] args) {

		Vehicle v1 = new Car();
		Vehicle v2 = new Motorcycle();
		
		v1.engineStart();
		v2.engineStart();
		
		if (v1 instanceof Car) {
			((Car)v1).accelerator();
		}
		
		if (v2 instanceof Motorcycle) {
			((Motorcycle)v2).rollingTheThrottle();
		}

	}

}
