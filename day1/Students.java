package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id is: " + id);

	}

	public void getStudentInfo(int id, String name) {
		//System.out.println("Student id is:  " + id);
		System.out.println("Student Name is: " + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email ID is: " + email);
		System.out.println("Student Phone Number is: " + phoneNumber);

	}

	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(56);
		details.getStudentInfo(56,"XXX");
		details.getStudentInfo("XXX@gmail.com",9789160305L);



	}
}
