package oops;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compile time error
		// local error
		// run time error

		// compile time error
		// System.out.println(a;

		// logical error
//		float salary  = 15000;
//		float totalsalary = (float) (0.10 * 15000);
//		System.out.println(totalsalary);
		// System.out.println(10/0); // Exceptions

		// ArithmeticException
//		System.out.println("hello");
//		System.out.println(10/0);
//		System.out.println("bye");

//		 int [] numbers = {11,22,33};
//		 System.out.println(numbers[44]);

		// program 1
//		System.out.println("hello");
//		try {
//			System.out.println(10/0);
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println("bye");

		// program 2
//		System.out.println("hello");
//		try {
//			int [] numbers = {11,22,33,44,55};
//			System.out.println(numbers[6]);
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println("bye");

		// program 3
//		System.out.println("hello");
//		System.out.println(10 / 0);

//		try {
//
//			System.out.println(10 / 0);
//			String names[] = { "chinmay", "deshpande", "shirish" };
//			System.out.println(names[3]);
//
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("please enter correct input");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("element not found at particular index");
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		// program 3 try catch finally
		System.out.println("hello");

		try {
			System.out.println(10/5);
		} 
		catch(Exception e) {
			System.out.println("incorrect input");
		}
		finally {
			System.out.println("I will always run");
		}
		
		System.out.println("bye");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
