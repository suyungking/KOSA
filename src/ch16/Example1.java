package ch16;

public class Example1 {
	public static void main(String[] args) {

		Button button = new Button();
		button.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
		button.click();

		Button button2 = new Button();
		button2.setClickListener(() -> System.out.println("Cancle 버튼을 클릭했습니"));
		button2.click();
	}

}
