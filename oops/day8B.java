package oops;

public class day8B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogq d = new Dogq();
		d.sound();
		d.type();
		
		Catq c = new Catq();
		c.sound();
		c.type();

	}

}
// object cannot be created for abstract class 
// abstract class can have abstract as well as normal method
abstract class Animalq {
	
	
	public  void type() {
		System.out.println("I belong to animal category");
	}
	public abstract void sound();
}

class Dogq extends Animalq{

	@Override
	public void sound() {
		System.out.println("bow bow");
		
	}
}

class Catq extends Animalq{

	@Override
	public void sound() {
		System.out.println("meow meow");
		
	}
}




