package entity;

public class Persona {
	private int dni;
    private String nombre;
    private String apellido;
    
    public Persona(String apellido,String nombre,int dni) {
    	this.dni = dni;
    	this.apellido = apellido;
    	this.nombre = nombre;
    }
    
    public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String mostrarDatos() {
    	return nombre + " " + apellido;
    }
}
