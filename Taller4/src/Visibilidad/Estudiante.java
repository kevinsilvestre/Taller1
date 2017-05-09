package Visibilidad;
import java.util.Scanner;
class Estudiante extends Persona{
	Scanner leer = new Scanner(System.in);
    String status;
    
    public Estudiante() {
        this.status = "";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    void status(){
        System.out.println("INGRESAR CURSO/ESTUDIANTE: ");
        status = leer.next();
    }
}


