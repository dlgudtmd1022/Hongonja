package sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);

	}

}
