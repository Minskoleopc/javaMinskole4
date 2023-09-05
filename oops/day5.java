package oops;

public class day5 {

	// polymorphism - overloading
	// same class , same method name and different signature
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			addition(1,3);
			addition(1,3,4);
			addition(1,3,4,5);
	}

	public static void addition(int x , int y) {
		System.out.println(x + y);
	}

	public static void addition(int x , int y , int z) {
		System.out.println(x + y + z);
	}
	
	public static void addition(int x , int y ,int z ,int a) {
		System.out.println(x + y + z + a);
	}
	
	
	
}
