package oops;
public class day9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.getArea(23, 15);
	}
}
interface Polygon {
	public void getArea(int length , int breadth);
}

class Rectangle implements Polygon {
	@Override
	public void getArea(int length, int breadth) {
		System.out.println(length * breadth);
	}
}











