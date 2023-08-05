package basicjava;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int q1 = GreaterNum(1000,40,5); // 3
		
		switch(q1) {
		case 1:
			System.out.println("x is gretaer");
			break;
		case 2:
			System.out.println("y is greatest");
			break;
		case 3:
			System.out.println("z is greatest");
			break;
		}
	
		
	}
	
	public static int GreaterNum(int x , int y , int z) {
		if(x > y && x > z) {
			return 1;
		}
		else if(y > z && y > x) {
			return 2;
		}
		else {
			return 3;
		}
	}

}
