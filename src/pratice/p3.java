package pratice;
import java.util.Scanner;
public class p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i =0 ; i< 10; i++) {
			System.out.println(num + " * " + i +" = " + num*i  );
		}
		
		
	}

}
