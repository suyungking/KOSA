package ch16;

import java.security.PublicKey;

public class Example {
	public static void main(String[] args) {
		Thread thread = new Thread(
			()->{System.out.println("작업스레드가 실행됩ㄴ다.");
			System.out.println("작업스레드가 실행됩ㄴ다.");
			System.out.println("작업스레드가 실행됩ㄴ다.");
			
				
			}	);
	thread.start();
	}

}
