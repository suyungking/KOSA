package ch05;



public class PraticeString {
	public static void main(String[] args) {
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum = 0;
		
		int count =0;
				
		for(int[] score : array) {
			for(int sc : score) {
				sum += sc;
				count++;
				
			}
		}
		double aver = (double) sum / count;
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + aver);
		
	}

}
