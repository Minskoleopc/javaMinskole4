package basicjava;

public class day2 {

	
	public static void main(String[] args) {
		
		// comparison operator
		// < , > , <= , >= , != , ==
		
		System.out.println(5 < 4); // false
		System.out.println(5 > 4);  // true 
		System.out.println(5 != 4); // true
		System.out.println(5 == 4);  // false
		System.out.println(5 <= 5); // true
		System.out.println(5 >= 5); // true
		System.out.println(5 >= 1); //true
		System.out.println(5 <= 1); // false
		
		
		// logical operators
		
		// && - and 
		
		// true   &&   true  ====> true
		// false  &&   true  ====> false
		// true  &&    false  ====> false
		// false  &&   false ====> false
		
		System.out.println(12 == 12 && 13 == 13);
		System.out.println(12 != 12 && 13 == 13);
		System.out.println(12 == 12 && 13 != 13);
		System.out.println(12 != 12 && 13 != 13);
		
		// || - or 
		
		// true   ||   true   ====>  true
		// false  ||   true   ====> true
		// true   ||   false  ====> true
		// false  ||   false  ====>  false
		
		System.out.println(12 == 12 || 13 == 13);
		System.out.println(12 != 12 ||13 == 13);
		System.out.println(12 == 12 || 13 != 13);
		System.out.println(12 != 12 || 13 != 13);
		
		
		// not -
		System.out.println(!(7 != 7));
		System.out.println(!(7 == 7));
		
		
		// conditional statement ---
		
		// one input multiple comes 
		
		
//		if(condition) {
//			// block
//		}
		
		// boolean ----- true or false
		
		
		int numT = -67;

//		if(numT > 0 && numT <= 5) {
//			System.out.println("10 % discount");
//		}
//		if(numT > 5 && numT <= 10) {
//			System.out.println("30 % discount");
//		}
//		if(numT > 10) {
//			System.out.println("40 % discount");
//		}
		
		
//		if(numT > 0 && numT <= 5) {
//			System.out.println("10 % discount");
//		}
//		else if(numT > 5 && numT <= 10) {
//			System.out.println("30 % discount");
//		}
//		else if(numT > 10) {
//			System.out.println("40 % discount");
//		}
//		else {
//			System.out.println("Incorrect input");
//		}
		
		
		
		
		int marks  = 92;
		
//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		
//		if(marks > 75) {
//			System.out.println("Grade B");
//		}
//		
//		if(marks > 65) {
//			System.out.println("Grade C");
//		
//		}
//		
		
		if(marks > 90) {
			System.out.println("Grade A");
		}
		
		else if(marks > 75) {
			System.out.println("Grade B");
		}
		
		else if(marks > 65) {
			System.out.println("Grade C");
		
		}
		else {
			System.out.println("please try again");
		}
		
		
		//tenary operator 
		
		
		int a = 10;
		int b = 5;
		
		
		String grt  = a > b ? "a is greater":"b is greater";
		System.out.println(grt);
		
		int age = 18;
		
		String jkl = age >= 18 ? "canndrive":"cannotdrive";
		System.out.println(jkl);
		
		
		// switch case 
		
		String city = "jaipur";
//		switch(city) {
//		case "pune":
//			System.out.println("MH");
//		case "jaipur":
//			System.out.println("RJ");
//		case "varanasi":
//			System.out.println("UP");
//		default:
//			System.out.println("Incorrect city name");
//		
//		}
		
//		switch(city) {
//		case "pune":
//			System.out.println("MH");
//			break;
//		case "jaipur":
//			System.out.println("RJ");
//			break;
//		case "varanasi":
//			System.out.println("UP");
//			break;
//		default:
//			System.out.println("Incorrect city name");
//		
//		}
		
	
		switch(city) {
		case "pune":
		case "nagpur":
			System.out.println("MH");
			break;
		case "jaipur":
		case "udaipur":
			System.out.println("RJ");
			break;
		case "varanasi":
		case "lucknow":
			System.out.println("UP");
			break;
		default:
			System.out.println("Incorrect city name");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	

}
