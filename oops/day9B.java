package oops;

public class day9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuleBookI rbi = new RuleBookI();
	}

}

class GrandFatherY {

	String firstName ;
	String lastName ;
	public GrandFatherY(String fn ,String ln) {
		this.firstName = fn;
		this.lastName = ln;	
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
class GrandFatherM {

	String firstName ;
	String lastName ;
	public GrandFatherM(String fn ,String ln) {
		this.firstName = fn;
		this.lastName = ln;	
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}	
}
// Not possible
//class Father extends GrandFatherM, GrandFatherY{
//	
//	
//}

interface A {
	public void Rule1();
	public void Rule2();
	public void Rule3();
	public void Rule4();
}

interface B {
	public void Rule5();
	public void Rule6();
	public void Rule7();
	public void Rule8();
}

class RuleBookI implements A, B {

	@Override
	public void Rule5() {
		System.out.println("Rule 5");
	}

	@Override
	public void Rule6() {
		// TODO Auto-generated method stub
		System.out.println("Rule 6");
	}

	@Override
	public void Rule7() {
		// TODO Auto-generated method stub
		System.out.println("Rule 7");
	}

	@Override
	public void Rule8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rule1() {
		System.out.println("Rule 1");
		
	}

	@Override
	public void Rule2() {
		System.out.println("Rule 2");
		
	}

	@Override
	public void Rule3() {
		System.out.println("Rule 3");
		
	}

	@Override
	public void Rule4() {
		System.out.println("Rule 4");
		
	}
	
	public void Rule11() {
		System.out.println("Rule 11");
	}
	
	

}



















