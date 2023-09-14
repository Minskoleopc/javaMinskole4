package oops;

public class day8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//worldBankq bnk = new worldBankq();
		
		SBIq a = new SBIq();
		a.loan();
		a.save();
		
	}

}

abstract class worldBankq{
	
	public abstract void save();
	public abstract void loan();
	
}

class SBIq extends worldBankq {
	@Override
	public void save() {
		System.out.println("I am from SBI save");
	}
	@Override
	public void loan() {
		System.out.println("I am from loan save");
	}
}

class PNBq extends worldBankq {
	@Override
	public void save() {
		System.out.println("I am from PNB save");
	}
	@Override
	public void loan() {
		System.out.println("I am from PNB save");
	}
}





