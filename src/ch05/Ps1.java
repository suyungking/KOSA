package ch05;

public class Ps1 {
	public static void main(String[] args) {
		int[][] scores = {
				{ 80, 90, 96 },
				{ 76, 88 }
		};
		String[] name = {"첫" ,"두"};
		
		for(int i =0; i<scores.length; i++) {
			int sum =0;
			for(int j=0;j<scores[i].length; j++) {
				sum+= scores[i][j];
			}
			double aver = (double) sum / scores[i].length;
			System.out.println(name[i] + "번째 반의 평균은 : "+ aver);
		}
	}

}
