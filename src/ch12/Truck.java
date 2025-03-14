package ch12;

public class Truck extends Vehicle   {
	public Truck() {
		System.out.println("Treck call");
	}
	
	public void run() {
		System.out.println("TRuch run	");
		
	}
	
	public int add(int a, int b) {
		System.out.println("a = "+  a );
		System.out.println("b = "+  b );
		return a+ b ;
	}
}
