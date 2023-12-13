package entities;

public class Car extends Vehicle{

	@Override
	public void engineStart() {
		System.out.println("Carro ligado");
	}
	
	public void accelerator() {
		System.out.println("Acelerando o carro");
	}
}
