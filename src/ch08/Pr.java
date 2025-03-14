package ch08;

public class Pr {
	public static void main(String[] args) {
		String[] my_strings = { "progressive", "hamburger", "hammer", "ahocorasick" };
		int[][] parts = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };
		String answer = solution(my_strings, parts);

		System.out.println(answer);

	}

	public static String solution(String[] my_strings, int[][] parts) {
		String answer = "";

		for (int i = 0; i < my_strings.length; i++) {
			String str = my_strings[i];

			answer += str.substring(parts[i][0], parts[i][1] + 1);
		}
		return answer;
	}
}
