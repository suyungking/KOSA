package pratice;

import java.nio.Buffer;

public class Bufer {
	public static void main(String[] args ) {
		int[] a = new int[5];
		
		for(int i =0; i< a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		System.out.println(a.length);
	}


}
