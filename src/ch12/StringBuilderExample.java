package ch12;

public class StringBuilderExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
		long end = System.nanoTime();
		
		System.out.println(end-start + "실행시");
	}
}