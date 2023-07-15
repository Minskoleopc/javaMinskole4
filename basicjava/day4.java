package basicjava;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// String 
		
		// Object ---- properties and methods
		
		
		String first_name = "chinmay";
		
		// 0   1   2   3   4   5   6
		// C   h   i   n   m   a   y
		
		// String stores the value by index 
		System.out.println(first_name.charAt(0));
		
		
		// program 1
		
		for(int i = 0 ; i < first_name.length() ; i++) {
			//System.out.println(i);
			System.out.println(first_name.charAt(i));
		}
		
		// program 2
		
		int t1 = 0;
		
		while(t1 < first_name.length()) {
			System.out.println(first_name.charAt(t1));
			t1++;
		}
		
		// program 3
		
		// length()
		
		String city = "Pune";
		System.out.println(city.length());
		
		
		// toUpperCase()
		
		String q1 = city.toUpperCase();
		System.out.println(q1);
		
		
		// toLowerCase()
		String q2 = city.toLowerCase();
		System.out.println(q2);
		
		
		//concat()
		String q3 = city.concat(" Welcomes you !");
		System.out.println(q3);
		
		
		String q4 = "I am learning js";
		String [] arr = q4.split(" ");  // {"I","am","learning","js"}
		System.out.println(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		//replaceFirst()
		
		String q5  = "I am learning javascript";
		String q6 = q5.replaceFirst("javascript", "java");
		System.out.println(q6);
		
		// replaceAll()
	
		String q7 = "I am learning java and java is great";
		String q8 = q7.replaceAll("java", "python");
		System.out.println(q8);
		
		//replace()
		
		String q10 = "run";
		String q11 = q10.replace("r", "f");
		System.out.println(q11);
		
		
		// trim()
		String q12 = " goa ";
		System.out.println(q12.trim().length());
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
