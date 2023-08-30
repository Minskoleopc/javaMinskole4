package oops;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student amol = new Student();
//		System.out.println(amol.firstName);
//		System.out.println(amol.lastName);
//		System.out.println(amol.adharNo);
//		amol.displayName();
		

		
		Teacher amolT = new Teacher();
		System.out.println(amolT.salary);
		System.out.println(amolT.firstName);
		System.out.println(amolT.lastName);
		System.out.println(amolT.adharNo);
		amolT.displaySalary();
		amolT.displayName();
		
		

	}

}

class Student {

	String firstName = "chinmay";
	String lastName = "deshpande";
	String adharNo = "123";

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

// Repetition
//class Teacher {
//	String firstName = "chinmay";
//	String lastName = "deshpande";
//	String  adharNo = "123";
//	int salary = 100000;
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//	public void displaySalary() {
//		System.out.println(this.salary)
//	}
//	
//}

class Teacher extends Student {

	int salary = 100000;

	public void displaySalary() {
		System.out.println(this.salary);
	}

}
