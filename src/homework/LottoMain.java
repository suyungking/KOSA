package homework;

public class LottoMain {
	public static void main(String[] agrgs) {
		int[] first = call();
		// 출력
		System.out.print("로또 번호 : ");
		for (int i : first) {
			System.out.print(i + " ");
		}

	}

	public static int[] call() {
		int[] ball = ballArr();
		int[] number = new int[6];
		int cnt = 45;
		for (int i = 0; i < number.length; i++) {
			// 난수를 발생시켜 현재 공의 개수에서 하나를 선택
			int lotter_ball = (int) (Math.random() * (cnt - i) + 1);
			// 선택된 번호를 number 배열에 저장
			number[i] = ball[lotter_ball - 1];
			// 선택된 번호를 0으로 설정하여 이미 선택된 번호로 표시
			ball[lotter_ball - 1] = 0;
			// 선택된 번호와 맨 뒤의 번호를 교환 (이 방법을 사용하여 번호 중복을 방지)
			int temp = ball[lotter_ball - 1];
			ball[lotter_ball - 1] = ball[cnt - 1];
			ball[cnt - 1] = temp;
			// 공의 개수를 하나를 줄임
			cnt--;

		}
		return number;

	}

	public static int[] ballArr() {
		int[] ball = new int[45];
		for (int i = 1; i <= ball.length; i++) {
			ball[i - 1] = i;
		}
		return ball;
	}

}
