package questao02;

public class TestMyCircle {

	public static void main(String[] args) {
		MyCircle circ1 = new MyCircle(2, 2, 2);
		MyPoint point1 = new MyPoint(1,2);
		MyCircle circ2 = new MyCircle(point1, 4);
		
		System.out.println(circ1.getCenter());
		System.out.println(circ1.getArea());
		System.out.println(circ1.equals(circ2));
		
		circ2.setCenterXY(2, 2);
		circ2.setRadius(2);
		System.out.println(circ1.equals(circ2));
	}

}
