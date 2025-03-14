package ch05;

import java.util.Scanner;

public class PraString {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		int[] student = null;
		
		while (flag) {
			System.out.println("-----------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-----------------------");

			System.out.print("선택 :");
			String strnum = sc.nextLine();
			int num = Integer.parseInt(strnum);
			
			switch (num) {
			case 1:
				System.out.print("학생 > ");
				String strnumber = sc.nextLine();
				int number = Integer.parseInt(strnumber);
				student = new int[number];
				break;
				
			case 2:
				for(int i =0; i< student.length; i++) {
					System.out.print("score["+i+"] >" );
					int score = sc.nextInt();
					student[i] = score; 
				}
				break;
				
			case 3:
				for(int i =0; i< student.length; i++) {
					System.out.println("score["+i+"] : " + student[i] );
				}
				break;
				
			case 4:
				int sum = 0;
				int max = 0;
				
				for(int score : student) {
					sum += score;
					max = (max < score) ? score : max;
				}
				System.out.println("최고 점수 : " + max );
				double aver = (double) sum / student.length;
				System.out.println("평균점수 : " + aver);
				break;
				
				case 5:
					System.out.println("종료 ");
					flag = false;
					break;
					
			default:
				System.out.println("숫자를 다시 입력하세요 ");
			}
		}
	}
}
