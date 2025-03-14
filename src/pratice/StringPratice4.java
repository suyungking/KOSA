package pratice;

public class StringPratice4 {
	public static void main(String[] args) {
		int[][] scores = { { 80, 90, 96 }, // 3
				{ 76, 88 } // 2
		};

		// 3차원 배열 생성
		// int[][][] scores =
		// {
		// {
		// { 80, 90, 96 },
		// { 76, 88, 50 }
		// }
		// };
		// 배열의 길이
//		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
//		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
//		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
//
//		// 첫 번째 반의 세 번째 학생의 점수 읽기
//		System.out.println("scores[0][2]: " + scores[0][2]);
//
//		// 두 번째 반의 두 번째 학생의 점수 읽기
//		System.out.println("scores[1][1]: " + scores[1][1]);
//
//		// 첫 번째 반의 평균 점수 구하기
//		int class1Sum = 0;
//		for (int i = 0; i < scores[0].length; i++) {
//			class1Sum += scores[0][i];
//		}
//		double class1Avg = (double) class1Sum / scores[0].length;
//		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
//
//		// 두 번째 반의 평균 점수 구하기
//		int class2Sum = 0;
//		for (int i = 0; i < scores[1].length; i++) {
//			class2Sum += scores[1][i];
//		}
//		double class2Avg = (double) class2Sum / scores[1].length;
//		System.out.println("두 번째 반의 평균 점수: " + class2Avg);

		// 문제 : 아래 (n+1) 부분을 첫, 두 이와 같은 글자가 나오게 수정한다
		// 힌트 : 문자열 배열을 선언 하고 적용한다
//			        String [] zzzz = {첫, 두}
		String[] name = {"첫번째","두번째"};
		
		System.out.println("==============================");
		for (int n = 0; n < name.length; n++) {
			int classSum = 0;
			for (int i = 0; i < scores[n].length; i++) {
				classSum += scores[n][i];
			}
			double classAvg = (double) classSum / scores[n].length;
			System.out.println((name[n]) + " 반의 평균 점수: " + classAvg);
		}
		System.out.println("==============================");

//		 향상된 for loop ver1, for loop ver2 으로 작성해볼 것

		for(int[] sc : scores) {
			int totalSum = 0;
			int cnt=0;
			for(int s :sc) {
				totalSum+= s;
				cnt++;
			}
			double aver = (double) totalSum/ cnt;
			System.out.println(aver);
		}
//		System.out.println(totalStudent);
//		System.out.println(totalSum);
//		double aver = (double) totalSum/ totalStudent;
		//System.out.println(aver);
		
		System.out.println("==================================");
//		
//
		for(var sc : scores) {
			int totalSum = 0;
			int cnt =0;
			for(var s :sc) {
				totalSum+= s;
				cnt++;
			}
			double aver = (double) totalSum/ cnt;
			System.out.println(aver);
		}

		
//		
		
		// 전체 학생의 평균 점수 구하기
//		int totalStudent = 0;
//		int totalSum = 0;
//		for (int i = 0; i < scores.length; i++) { // 반의 수만큼 반복
//			totalStudent += scores[i].length; // 반의 학생 수 합산
//			for (int k = 0; k < scores[i].length; k++) { // 해당 반의 학생 수만큼 반복
//				totalSum += scores[i][k]; // 학생 점수 합산
//			}
//		}
//		double totalAvg = (double) totalSum / totalStudent;
//		System.out.println("전체 학생의 평균 점수: " + totalAvg);

		// 향상된 for loop ver1, for loop ver2 으로 작성해볼 것

	}
}
