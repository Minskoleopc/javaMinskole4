package oops;

public class dayB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherB amolT2 = new TeacherB("amolT","raoT","123",10000);
			
		System.out.println(amolT2.firstName);
		System.out.println(amolT2.lastName);
		System.out.println(amolT2.adharno);
		System.out.println(amolT2.salary);
		
		amolT2.displayName();
		amolT2.displaySalary();
	}
}

class StudentB {
	String firstName;
	String lastName;
	String adharno;
	
	public StudentB(String fn , String ln , String adhno) {	
		this.firstName = fn;
		this.lastName = ln;
		this.adharno = adhno;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherB extends StudentB {
	int salary ;
	public TeacherB(String fn, String ln, String adhno,int sy) {
		super(fn, ln, adhno);
		this.salary = sy;		
	}
	public void displaySalary() {
		
		System.out.println(this.salary);
	}
	
}


