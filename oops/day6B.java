package oops;

public class day6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SonH chinmay  = new SonH("manohar","deshpande","shirish","chinmay");
		chinmay.displayName();
	}

}

class GrandFatherH {

	String firstName;
	String lastName;

	public GrandFatherH(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class FatherH extends GrandFatherH {

	String fname;
	public FatherH(String fn, String ln,String ffn) {
		super(fn, ln);
		this.fname = ffn;
	}
	
	public void displayName() {
		System.out.println(this.fname + this.lastName);
		super.displayName();
	}
	
}


class SonH extends FatherH {

	String sname;
	public SonH(String fn, String ln,String ffn,String ssn) {
		super(fn, ln,ffn);
		this.sname = ssn;
	}
	
	public void displayName() {
		System.out.println(this.sname + this.lastName);
		super.displayName();
	}
	
}











