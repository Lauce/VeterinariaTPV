package entity;

public class Cliente extends Persona {

	int telefono;
	int celular;
	String direccion;
	String mail;

	public Cliente(String nombre, String apellido, int dni, int telefono, int celular, String direccion, String mail) {
		super(apellido, nombre, dni);
		this.telefono = telefono;
		this.celular = celular;
		this.direccion = direccion;
		this.mail = mail;

	}

	@Override
	public String toString() {
		return "Nombre y apellido: " + getNombre() + " " + getApellido() + "\ndni: " + getDni() + "\ntel: " + telefono
				+ "  -  cel: " + celular + "\ndireccion: " + direccion + "\nmail: " + mail;
	}

}
