package basicjava;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Why ???
		// datatye [] arrayName
		// 2 ways to define the array

		// fixed length
		// program 1

		int numbers[] = new int[5];
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		numbers[3] = 44;
		numbers[4] = 55;
		int numbers2[] = { 11, 22, 33, 44, 55, 66 };
		int[] numbers3 = { 77, 88, 99, 100, 200 };

		// program 2
		// Array stores the value by index

		// access the value
		System.out.println(numbers[0]);

		// updating the value;
		numbers[0] = 222;
		System.out.println(numbers[0]);

		// program 3
		// To find the length of array
		String[] names = { "chinmay", "shirish", "poorva", "ram" };
		int q1 = names.length;
		System.out.println(q1);

		// for loop
		for (int i = 0; i < names.length; i++) {
			// System.out.println(i);
			System.out.println(names[i]);
		}

		// while loop
		int q2 = 0;
		while (q2 < names.length) {
			System.out.println(names[q2]);
			q2++;
		}

		// for each loop
		for (String name : names) {
			System.out.println(name);
		}

		// program 4
		// 2D array

		String states[][] = {

				{ "pune", "nagpur", "wardha" }, { "indore", "bhopal", "ujjain" }, { "jaipur", "udaipur", "jaisalmer" }

		};

		// for loop
		for (int i = 0; i < states.length; i++) {
			String[] arr = states[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}

		}
		// while loop

		int q3 = 0;
		while (q3 < states.length) {
			String arr[] = states[q3];
			int q4 = 0;
			while (q4 < arr.length) {
				System.out.println(arr[q4]);
				q4++;
			}
			q3++;

		}

		// for each

		for (String[] cities : states) {
			for (String city : cities) {
				System.out.println(city);
			}
		}

		int numbersB[][] = new int[3][3];

		numbersB[0][0] = 11;
		numbersB[0][1] = 12;
		numbersB[0][2] = 13;

		numbersB[1][0] = 14;
		numbersB[1][1] = 15;
		numbersB[1][2] = 16;

		numbersB[2][0] = 17;
		numbersB[2][1] = 18;
		numbersB[2][2] = 19;

		// for loop ()

		// while loop()

		// forEach()

		int numbersC[][] = new int[2][2];

		numbersC[0][0] = 22;
		numbersC[0][1] = 33;

		numbersC[1][0] = 44;
		numbersC[1][1] = 55;

		int numbersD[][] = {

				{ 22, 33 }, { 44, 55 }

		};

		System.out.println(numbersD[0][0]);
		System.out.println(numbersD[0][1]);
		System.out.println(numbersD[1][0]);
		System.out.println(numbersD[1][1]);

		for (int i = 0; i < numbersD.length; i++) {
			int arr[] = numbersD[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}

		int y = 0;

		while (y < numbersD.length) {
			int arr2[] = numbersD[y];
			int y2 = 0;

			while (y2 < arr2.length) {
				System.out.println(arr2[y2]);
				y2++;
			}

			y++;
		}

		for (int[] arr : numbersD) {
			for (int a : arr) {
				System.out.println(a);
			}
		}

		int numbersE[][][] = {

				{ { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } },

				{ { 111, 222, 333 }, { 444, 555, 666 }, { 777, 888, 999 } },

				{ { 1111, 2222, 3333 }, { 4444, 5555, 6666 }, { 7777, 8888, 9999 } }

		};

		System.out.println(numbersE[1][1][2]);
		System.out.println(numbersE[2][2][2]);

		for (int i = 0; i < numbersE.length; i++) {
			int arr[][] = numbersE[i];
			for (int j = 0; j < arr.length; j++) {
				int arrS[] = arr[j];
				for (int k = 0; k < arrS.length; k++) {
					System.out.println(arrS[k]);
				}

			}
		}

		int q11 = 0;
		while (q11 < numbersE.length) {
			int arr[][] = numbersE[q11];
			int q22 = 0;
			while (q22 < arr.length) {
				int arrB[] = arr[q22];
				int q33 = 0;
					while(q33 < arrB.length) {
						System.out.println(arrB[q33]);
						q33++;
					}
				q22++;
			}
			q11++;
		}

		for(int arrB [][]:numbersE) {
			for( int arrC[]:arrB) {
				for(int a :arrC) {
					System.out.println(a);
				}
			}
		}
		
		
	}

	
}
