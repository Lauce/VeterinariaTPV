package entity;

public class Vendedor extends Persona {

	public Vendedor(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
	}

	public String datosVendedor() {
		return getNombre() + " " + getApellido();
	}
	

	public Cliente registrarCliente(String nombre, String apellido, int dni, int telefono, int celular,
			String direccion, String mail) {
		Cliente cliente = new Cliente(nombre, apellido, dni, telefono, celular, direccion, mail);
		return cliente;
	}

	public Venta vender(Cliente cliente) {
		Venta venta = new Venta(this, cliente);
		return venta;
	}
	
}
