package ch08;

public class Book {
	private final String name;
	private final int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	public void publish() {
		System.out.println("책이름 : " + name + " 책가격 : " +price+"원");
	}
}
