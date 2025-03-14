package pratice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p13 {

	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		
		queue.add(1);
		queue.remove();
		queue.remove();
		
		System.out.println(queue);
	}

}
