package oops;

public class day7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog moti = new Dog();
		moti.makeSound();
		moti.type();
		
		Cat poorva =  new Cat();
		poorva.type();
		poorva.makeSound();
	}

	
}
abstract class Animals {
	
	public abstract void  makeSound();
	public void type() {
		System.out.println("I am of animal type");
	}
	
}

class Dog extends Animals {

	@Override
	public void makeSound() {
		System.out.println("bow bow");
		
	}
	
}

class Cat extends Animals {

	@Override
	public void makeSound() {
		System.out.println("meow meow");
		
	}
	
}








