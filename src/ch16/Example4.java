package ch16;

public class Example4 {

	public static void main(String[] args) {
		double englishAvg = avg(Student::getEnglishScore );
		//double englishAvg = avg(s-> s.getEnglishScore() );
		System.out.println("영어 평균점수 : " + englishAvg);
		
		double mathAvg = avg(Student::getMathScore );
		//double mathAvg = avg(s-> s.getMathScore() );
		System.out.println("수학 평균점수 : " + mathAvg);

	}
	
	private static Student[] students = { new Student("홍길동", 90,96), new Student("신용권", 95,93) };
	
	public static double avg(Function1<Student> function1) {
		int sum = 0; 
		for(Student student : students) {
			sum+= function1.apply(student);
		}
		double avg = sum / students.length;
		
	
		return avg ;
		
		
	}
		
	

}