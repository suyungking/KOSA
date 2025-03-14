package ch07.ch07;

public class Car {
	
	private Tire tire;
	
	
	public Car(Tire tire) {
		this.tire = tire;
	}
		
	public void run(){
		tire.roll();
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
}


