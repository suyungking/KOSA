package ch08;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("개똥벌레", 8000);
		Book book2 = new Book("나는", 10000);
		Book book3 = new Book("사람이다", 18000);
				
		book1.publish();
		book2.publish();
		book3.publish();
	}

}
