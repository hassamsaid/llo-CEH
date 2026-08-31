public class Empleado {
    //Atributos
    private int id;
    private String nombre;
    private String tipo;
    private String cargo;
    private float salario;
    private String horario;
    private final boolean activo;
    private final boolean oculto;

    //constructor
    public Empleado(int id, String nombre, String tipo, String cargo, float salario, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.salario = salario;
        this.horario = horario;
        this.activo = true;
        this.oculto = false;

}
//getters y setters
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public float getSalario() {
    return salario;
}
public void setSalario(float salario) {
    this.salario = salario;
}
public String getHorario() {
    return horario;
}
public void setHorario(String horario) {
    this.horario = horario;
}

//representacion en texto
@Override
public String toString() {
return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", horario='" + horario + '\'' +
                ", activo=" + activo +
                ", oculto=" + oculto +
                '}';
    }
}