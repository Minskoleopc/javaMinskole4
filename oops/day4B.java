package oops;

public class day4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonC chinmay = new SonC("manohar","deshpande","shrish","chinmay");
		
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.fname);
		System.out.println(chinmay.sname);
		
		chinmay.displayGName();
		chinmay.displayFName();
		chinmay.displaySName();
		
	}

}

class GrandFather {
	
	String firstName;
	String lastName;
	public GrandFather(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayGName() {
		System.out.println(this.firstName+ this.lastName);
	}	
}

class FatherC extends GrandFather {
	String fname ;

	public FatherC(String fn, String ln,String ffn) {
		super(fn, ln);
		this.fname = ffn;
	}
	
	public void displayFName() {
		System.out.println(this.fname + this.lastName);
	}
}

class SonC extends FatherC {
	String sname ;
	public SonC(String fn, String ln, String ffn ,String sn) {
		super(fn, ln, ffn);
		this.sname = sn;
		
	}
	public void displaySName() {
		System.out.println(this.sname + this.lastName);
	}
}









