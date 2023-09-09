package oops;

public class day7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WorldBankC india = new WorldBankC();
		
		SBIC laxmi = new SBIC();
		laxmi.save();
		laxmi.loan();
		laxmi.branchName();
		
		
		PNBC pc = new PNBC();
		pc.save();
		pc.loan();
	}

}

// No object creation for abstract class

abstract class WorldBankC {
	
		public abstract void save();
		public abstract void loan();
	
	
}

class SBIC extends WorldBankC {
	@Override
	public void save() {
		System.out.println("save from SBI c");	
	}
	@Override
	public void loan() {
		System.out.println("loan from SBI c");
	}
		
	public void branchName() {
		System.out.println("branch name nagpur");
	}
}

class PNBC extends WorldBankC {

	@Override
	public void save() {
		System.out.println("save from PNB c");		
	}
	@Override
	public void loan() {
		System.out.println("save from PNB c");
	}
	
}









