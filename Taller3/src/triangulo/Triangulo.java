package triangulo;

public class Triangulo extends ObjetoGeometrico {
	private double lado1;
	private double lado2;
	private double lado3;
	private double base;
	private double altura;
	
	public Triangulo() {
		this.lado1 = 1.0;
		this.lado2 = 1.0;
		this.lado3 = 1.0;
	}
	
	public Triangulo(double lado1, double lado2, double lado3, double base, double altura) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.base = base;
		this.altura = altura;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea() {
		return (base * altura) / 2;
	}
	public double getPerimetro() {
		return lado1 + lado2 + lado3;
	}

}


