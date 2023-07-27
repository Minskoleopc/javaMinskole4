package basicjava;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addA();
		addA();
		addA();
		addA();
		
		
		addB(13,4);
		addB(130,15);
		
		int q1 = addC(23,45);
		System.out.println(q1);
		System.out.println(q1+q1);
		System.out.println(q1 * 0.10);

	}

	
	//function without parameter and without return type 
	
	public static void addA() {
		System.out.println(8+1);
	}
	
	// function with parameter and without return type
	
	public static void addB(int x, int y) {
		System.out.println(x+y);
	}
	
	// 100 - show
	// 100 - given 
	
	// function with parameter and with return type 
	public static int addC(int x, int y) {
		return  x + y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
