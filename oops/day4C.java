package oops;

public class day4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonM chinmay  = new SonM("Kanchan","Deshpande","Chinmay");
		DaughterM gauri  = new DaughterM("Kanchan","Deshpande","Gauri");
		
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.sname);
		
		chinmay.displayMName();
		chinmay.displaySName();
		
		System.out.println(gauri.firstName);
		System.out.println(gauri.lastName);
		System.out.println(gauri.dname);
		
		gauri.displayMName();
		gauri.displayDName();
		
		
		
		
		
	}

}

class Mother {
	String firstName ;
	String lastName ;
	
	public Mother(String fn , String ln) {
		this.firstName  = fn ;
		this.lastName = ln;
			
	}
	
	public void displayMName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonM extends Mother{
	String sname;
	public SonM(String fn, String ln ,String sn) {
		super(fn, ln);
		this.sname = sn;
	}
	
	public void displaySName(){
		System.out.println(this.sname + this.lastName);
	}
}

class DaughterM extends Mother{
	String dname;
	public DaughterM(String fn, String ln, String dn) {
		super(fn, ln);
		this.dname = dn;
	}
	
	public void displayDName(){
		System.out.println(this.dname + this.lastName);
	}
}








