package questao02;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint test1 = new MyPoint();
		test1.setX(2);
		test1.setY(1);
		MyPoint test2 = new MyPoint(2,1);
		
		System.out.println(test1.equals(test2));
		test2.setXY(1, 2);
		System.out.println(test1.equals(test2));
		System.out.println(test2);
		double valor = test2.distance(2, 2);
		System.out.println(valor);

	}

}
