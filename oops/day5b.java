package oops;

public class day5b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI nagpur = new SBI();
		nagpur.loan();
		nagpur.save();
	}
	// different class , same method and same signature (inheritance)
	// overriding
}

class WorldBank {
	
	public void loan() {
		System.out.println("I am loan from worldBank");
	}
	
	public void save() {
		System.out.println("I am save from worldBank");
	}
}

class SBI extends WorldBank {
	
	public void loan() {
		System.out.println("I am loan from sbi");
	}
	
	public void save() {
		System.out.println("I am save from sbi");
	}
}

class  PNB extends WorldBank{
	public void loan() {
		System.out.println("I am loan from pnb");
	}
	
	public void save() {
		System.out.println("I am save from pnb");
	}
}

