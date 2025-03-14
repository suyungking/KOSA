package ch05;

public class Ps2 {
	public static void main(String[] args) {
		int[][] scores = {
				{ 80, 90, 96 },
				{ 76, 88 }
		};
		int cnt = 0;
		int sum = 0;
		int i = 1;
	
		for(int[] score : scores) {
			sum = 0;
			cnt = 0;
			for(int sc : score) {
				sum += sc;
				cnt++;
			}
			double aver = (double) sum / cnt ;
			System.out.println( i+ "번째 반의 평균은 : " + aver);
			i++;
		}

	}

}
