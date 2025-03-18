package ch16;

import java.time.Year;

public class Lamba {
	public static void main(String[] args) {
		calculate((x, y) -> {
			int result = x+ y ;
			System.out.println("result = " + result);
		} );
		
		
		
		calculate((x , y ) -> {
			int result = x - y ;
			System.out.println("result = " + result);
		});
		
		calculate((x,y)->{
			int result = x * y ;
			System.out.println("result = " + result);
		});
		
		calculate((x,y)->{
			int result = x / y;
			System.out.println("result = " + result);
		});
		
	}
	
	
	public static void calculate(Calculable calculable ) {
		
		int x = 10;
		int y = 20;
		calculable.cal(x, y);
		
		
		
		
	}

}
