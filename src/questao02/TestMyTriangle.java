package questao02;

public class TestMyTriangle {

	public static void main(String[] args) {
		MyTriangle triangulo1 = new MyTriangle(2,2,2,2,2,2);
		MyPoint ponto1 = new MyPoint(1,2);
		MyPoint ponto2 = new MyPoint(2,1);
		MyPoint ponto3 = new MyPoint(2,2);
		MyTriangle triangulo2 = new MyTriangle(ponto1, ponto2, ponto3);
		
		System.out.println(triangulo1.equals(triangulo2));
		System.out.println(triangulo1.getPerimeter());
		System.out.println(triangulo1.printType());
		System.out.println(triangulo2.printType());
		
		
	
	}

}
