package ch13;


public class GenericExample {
	public static void main(String[] args) {
//		HomeAgency homeAgency = new HomeAgency();
//		Home home = homeAgency.rent();
//		home.turnOnLight();
//
//		CarAgency carAgency = new CarAgency();
//		Car car = carAgency.rent();
//		car.run();
//		
		
		Rentable<?> [] arr = {new HomeAgency(), new CarAgency()};
		
		for(var agency : arr) {
			var obj = agency.rent();
			if(obj instanceof Home home) {
				home.turnOnLight();
			}
			else if(obj instanceof Car car) {
				car.run();
			}
		}
	}
}