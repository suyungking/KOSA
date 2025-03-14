package pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class p12 {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3)); 
		List<Board> list3 = new ArrayList<>();
		
		list3.add(new Board("1", "2", "3"));
		list3.add(new Board("4", "5", "3"));
		list3.add(new Board("6", "7", "3"));
		list3.add(new Board("8", "9", "3"));
		
		
		for (Board board : list3) {
			System.out.println(board.getName()+board.getTitle()+board.getQwer());
		}
//		System.out.println(list1);
//		System.out.println(list2);
	}
}
