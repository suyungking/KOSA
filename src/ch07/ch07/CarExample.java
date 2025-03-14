package ch07.ch07;

public class CarExample {
	public static void main(String[] agrs) {
		
		Car car = new Car(new Han());
		car.run();
		
		System.out.println("타이어 교체 ");
		car.setTire(new Kum());
		car.run();
		
		System.out.println("타이어 교체 ");
		car.setTire(new Gold());
		car.run();
		
		

	}

}
