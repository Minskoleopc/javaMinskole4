package basicjava;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// one input and multiple outcome

		// numT > 0 && numT <= 5 =======> 10 % discount
		// numT > 5 && numT <= 10 =======> 20 % discount
		// numT > 10 =======> 30 % discount

//		int numT = 7 ;
//		
//		if(numT > 0 && numT <= 5) {
//			System.out.println("10 % discount");
//		}
//		
//		if(numT > 5 && numT <= 10) {
//			System.out.println("20 % discount");
//		}
//		if(numT > 10) {
//			System.out.println("30 % discount");
//		}

		// program 2

		int numT = -21;
		if (numT > 0 && numT <= 5) {
			System.out.println("10 % discount");
		}

		else if (numT > 5 && numT <= 10) {
			System.out.println("20 % discount");
		}
		else if (numT > 10) {
			System.out.println("30 % discount");
		}
		else {
			System.out.println("Incorrect input");
		}
		
		// program 3
		
		int marks = 92;
		
		if(marks > 90) {
			System.out.println("Grade A");
		}
		
		if(marks > 75) {
			System.out.println("Grade B");
		}
		
		if(marks > 65) {
			System.out.println("Grade C");
		}
		
		// program 4
		
		int marksB = 55;
		
		if(marksB > 90) {
			System.out.println("Grade A");
		}
		
		else if(marksB > 75) {
			System.out.println("Grade B");
		}
		
		else if(marksB > 65) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail please try again");
		}
		
		// Program 5
		int a = 100;
		int b = 800;
		
		
		if(a > b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		
		// Program 6
		
		int x = 10;
		int y = 50;
		int z = 300;
		
		if(x > y && x > z) {
			System.out.println("x is greater");
		}
		else if(y > x && y > z) {
			System.out.println("y is greater");
		}
		else {
			System.out.println("Z is greater");
		}
		
		// program 7
		
		int q = 8;
		int r = 40;
		
		if(q > r) {
			System.out.println("q is greater");
		}
		else {
			System.out.println("r is greater");
		}
		
		String result = q > r ?"q is greater":"r is greater";
		System.out.println(result);
		
		// program 8
		
		int age = 18;
		String result2 = age >= 17 ? "can drive":"cannot drive";
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
