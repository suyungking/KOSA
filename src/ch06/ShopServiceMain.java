package ch06;

public class ShopServiceMain {
	public static void main(String[] args) {
		ShopService service1 = ShopService.getInstance();
		ShopService service2 = ShopService.getInstance();
		
		if(service1 == service2) {
			System.out.println("같은 객체입니다");
			
		}
		else {
			System.out.println("다른 객체입니다.");
		}
		
		
	}
}
