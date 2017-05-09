package triangulo;
public class Main {
public static void main(String[] args) {
		
		Triangulo a = new Triangulo(1, 1.5, 1, 4, 5);
		ObjetoGeometrico ob;
		ob = a;
		System.out.println("El Area Del Triangulo es : " + ob.getArea());
		System.out.println("El Perimetro Del Triangulo es : " + ob.getPerimetro());
     }
}

