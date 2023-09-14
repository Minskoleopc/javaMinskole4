package oops;

public class class9c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherHH ninad = new TeacherHH("chinmay","deshpande",12,"213123213123123123213");
		ninad.displayName();
		ninad.displayCountryName();	
	}
	
}

interface Rule {
	public void displayCountryName();
}

class StudentH {
	String firstName ;
	String lastName ;
	int age ;
	public StudentH(String fn , String ln , int age) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = age;
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherHH extends StudentH implements Rule {
	String salary ;
	public TeacherHH(String fn, String ln, int age, String salary) {
		super(fn, ln, age);
		this.salary = salary;
	}

	@Override
	public void displayCountryName() {
		System.out.println("India");
		
	}
	
}















