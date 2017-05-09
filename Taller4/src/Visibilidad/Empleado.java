package Visibilidad;
import java.util.Date;
class Empleado extends Persona{
	float salario;
    Date fecha_ent;

    public Empleado(float salario, Date fecha_ent){
        this.salario = salario;
        this.fecha_ent = fecha_ent;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getFecha_ent() {
        return fecha_ent;
    }

    public void setFecha_ent(Date fecha_ent) {
        this.fecha_ent = fecha_ent;
    }
}


