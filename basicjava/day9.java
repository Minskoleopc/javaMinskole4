package basicjava;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String
		// Properties and methods
		// Data type
		// loop
		// retrive
		// delete
		// update
		// add

		String first_name = new String("chinmay");
		String last_name = "deshpande";

		// String stores the value by index

		
		String city = "pune";
		System.out.println(city);

		// 0 1 2 3
		// p u n e

		System.out.println(city.charAt(0));
		System.out.println(city.charAt(1));
		System.out.println(city.charAt(2));
		System.out.println(city.charAt(3));

		// printing every character of string
		String city2 = "chandrapur";
		for (int i = 0; i < city2.length(); i++) {
			//System.out.println(i);
			System.out.println(city2.charAt(i));
		}

		// print the characters in reverse
		// length -1 is always the last index
		
		for(int i = city2.length()-1  ; i >= 0 ; i--) {
			System.out.println(city2.charAt(i));
		}
		
		
		// program 2 
		
		// int + int            =====> int 
		// int + string         =====> string 
		// string + int         =====> string 
		// string + string      ======> string 
		
		
		int a = 10;
		int b = 50;
		String c = "hello";
		System.out.println(a+b+c);
		System.out.println(b+c+a);
		System.out.println(c+a+b);
		
		
		String first_namea = "sarika";
		String last_nameb = "pansare";
	
		System.out.println("My firstname is "+first_namea +" my lastName name is "+last_nameb);
		
		String greeting = "hello";
		String greet = greeting.concat("world !");
		System.out.println(greet);
		
		
		// charAt()
		// length()
		// contact()
		
		// program 3
		
		String firstName2 = "amol";
		String upperCase = firstName2.toUpperCase();
		System.out.println(upperCase);
		
		// program 4
		

		String firstName3 = "AMOL";
		String lowerCase = firstName3.toLowerCase();
		System.out.println(lowerCase);
		
		// substring()
		
		
		// equals()
		
		
		// contains()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
