package Cta;
import java.util.Date;
import java.util.GregorianCalendar;
public class Cuenta {
	private int id = 0;
	private double saldo;
	private double interesAnual;
	private Date fechaCreacion;
	
	public Cuenta() {}

	public Cuenta(int id, double saldo, double interesAnual, Date fechaCreacion) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
		this.fechaCreacion = fechaCreacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public double getInteresMensual(){
		return saldo * id * 12 / 100 * 365;
	}
	
	public void retiro(double retiro){
		saldo -= retiro;
	}
	
	public void deposito(double deposito){
		saldo += deposito;
	}
public static void main(String[] args) {
	
	Cuenta c = new Cuenta(1122, 2000, 4.5, new GregorianCalendar(1993, 31, 03).getTime());
	c.retiro(2500);
	c.deposito(3000);
	System.out.println("El balance es : " +c.getSaldo());
	System.out.println("El Interes Mensual es : " +c.getInteresMensual());
	System.out.println("La Fecha De Creacion es : " +c.getFechaCreacion());
	

}

}

