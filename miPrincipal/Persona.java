package miPrincipal;

public class Persona {
    private String dni;
    private String nombre;
    private Fecha fechaNacimiento;
    
    public Persona() {
        dni = "";
        nombre = "";
        fechaNacimiento = new Fecha();

    }
    public Persona(String Dni, String Nombre, String FechaNacimiento) {
        this.dni = Dni;
        this.nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        fechaNacimiento = fechaNacimiento;
    }



    
    //coloca aquí el código faltante
    
}
