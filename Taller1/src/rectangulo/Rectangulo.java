package rectangulo;

public class Rectangulo {
	private double ancho;
    private double altura;
    

   public Rectangulo() {
       this.ancho = 4.50d;
       this.altura = 4.25d;
   }

   public Rectangulo(double ancho, double altura) {
       this.ancho = ancho;
       this.altura = altura;
   }
   
   public double getArea(){
       return ancho * altura;
   }
   
    public double getPerimetro(){
       return (ancho + altura) * 2;
   }
   
   public static void main(String [] args){
       Rectangulo recta = new Rectangulo(2.00d,25.00d);
       System.out.println("EL AREA DE UN RECTANGULO ES: "+recta.getArea());
       System.out.println("EL PERIMETRO DE UN RECTANGULO ES: "+recta.getPerimetro());
       System.out.println();
       Rectangulo recta1 = new Rectangulo(5.7d,27.4d);
      System.out.println("EL AREA DE UN RECTANGULO ES: "+recta1.getArea());
       System.out.println("EL PERIMETRO DE UN RECTANGULO ES: "+recta1.getPerimetro());
   }
}

