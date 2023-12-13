package entities;

public class Motorcycle extends Vehicle{

	@Override
	public void engineStart() {
		System.out.println("Moto ligada");
	}
	
	public void rollingTheThrottle() {
		System.out.println("Acelerando a moto");
	}
}
