package ch05;

public class Pra1 {
	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = 0;
		
		for(int score: array) {
			max = (max<score) ? score : max;
		
		
		}
		System.out.println(max);
	}
}
