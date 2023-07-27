package basicjava;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// comparison ======> true or false

		// < , > , <= , >= , != , ==

		System.out.println(3 > 2); // true
		System.out.println(3 < 2); // false
		System.out.println(3 <= 2); // false
		System.out.println(3 >= 2); // true
		System.out.println(3 >= 3); // true
		System.out.println(3 <= 3); // true
		System.out.println(3 != 3); // false
		System.out.println(3 == 3); // true

		// Logical operator

		// && - AND

		// Truth
		// True && True =========> True
		// False && True =========> False
		// True && False =========> False
		// False && False =========> False

		System.out.println(2 == 2 && 3 == 3);
		System.out.println(2 != 2 && 3 == 3);
		System.out.println(2 == 2 && 3 != 3);
		System.out.println(2 != 2 && 3 != 3);

		// || - OR
		// Truth
		// True || True =========> True
		// False || True =========> True
		// True || False =========> True
		// False || False =========> False
		
		
		System.out.println(2 == 2 || 3 == 3);
		System.out.println(2 != 2 || 3 == 3);
		System.out.println(2 == 2 || 3 != 3);
		System.out.println(2 != 2 || 3 != 3);
		
		
		// ! - NOT
		System.out.println(!(12 == 12));
		System.out.println(!(12 != 12));

	}

}
