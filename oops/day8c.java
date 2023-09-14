package oops;
public class day8c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogN n  = new DogN();
		n.cityFound();
		n.type();
		n.sound();
	}

}
interface AnimalN {
	public abstract void sound();
	public abstract void type(); 
	public abstract void cityFound();
}
class DogN implements AnimalN{

	@Override
	public void sound() {
		System.out.println("Bow Bow");
	}

	@Override
	public void type() {
		System.out.println("Animal");	
	}
	@Override
	public void cityFound() {
		System.out.println("Pune ");
		
	}
	
	
}