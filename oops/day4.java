package oops;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeacherC amol = new TeacherC("amol","rao","23",1000);
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.rollNo);
		System.out.println(amol.salary);
		
		amol.displayName();
		amol.displaySalary();
	}

}

class StudentC {

	String firstName;
	String lastName;
	String rollNo;
	public StudentC(String fn , String ln , String rn) {
			
			this.firstName = fn;
			this.lastName = ln;
			this.rollNo = rn;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
	
}

class TeacherC extends StudentC{
	int salary;
	public TeacherC(String fn , String ln , String rn , int sy) {
		super(fn,ln,rn);
		this.salary = sy;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}




