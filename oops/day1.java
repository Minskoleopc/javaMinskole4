package oops;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person amol = new Person();
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.age);
		amol.displayName();
		
		
		Person chinmay = new Person();
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.age);
		chinmay.displayName();
		
		
		chinmay.firstName = "chinmay S ";
		chinmay.lastName = "Deshpandey";
		chinmay.age = 33;
		chinmay.displayName();
		
		
		// Setting the values at the tym of object creation
		
		Person2 chinmay2  = new Person2("chinmay","deshpande",23);
		System.out.println(chinmay2.firstName);
		System.out.println(chinmay2.lastName);
		System.out.println(chinmay2.age);
		chinmay2.displaName();
		

		Person2 amol2  = new Person2("amol","rao2",33);
		System.out.println(amol2.firstName);
		System.out.println(amol2.lastName);
		System.out.println(amol2.age);
		amol2.displaName();
		
		
	}

}

class Person {
	
	String firstName = "chinmay";
	String lastName = "deshpande" ;
	int age = 30;
	
	public  void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Person2 {
	
	String firstName ;
	String lastName;
	int age;
	
	public Person2(String fn, String ln , int ag) {
		this.firstName  = fn;
		this.lastName  = ln;
		this.age  = ag;
	}
	
	public void displaName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	
	
}









