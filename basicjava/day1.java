package basicjava;

public class day1 {
	

	public static void main(String[] args) {
		int x = 90;
		boolean y = true;
		String z = "chinmay";
	
		// Arithmetic operation 
		int k = 10;
		int l = 5;
		
		System.out.println(k+l);
		System.out.println(k-l);
		System.out.println(k*l);
		System.out.println(k/l);
		System.out.println(k%l);
		
		
		int s = 8;
		int t = 4 ;
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		
		Calculator(12,4);
		Calculator(10,5);
		
		
		
		
		
		addA();
		addA();
		addA();
		addA();
		addA();
		
		addB(34,5);
		addB(34,1);
		addB(34,6);
		addB(34,6);
		
		int a = addC(24,5);
		System.out.println(a);
		System.out.println(a+a);
		
	
	}
	
	
	
	public static void Calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}
	
	
	// function without parameter and without return type 
	
	public static void addA() {
		System.out.println(8+7);
	}
	
	
	// function with parameter and without return type
	
	public static void addB(int x, int y) {
		System.out.println(x+y);
	}
	
	
	
	// function with parameter and with return  type 
	
	public static int addC(int x , int y) {
		return x + y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
