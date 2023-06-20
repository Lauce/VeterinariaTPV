package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Venta {
	private Vendedor vendedor;
	private String dateTime;
	private Cliente cliente;
	ArrayList<Producto> listaProd = new ArrayList<>();
	ArrayList<Servicio> listaServ = new ArrayList<>();

	public Venta(Vendedor vendedor, Cliente cliente) {

		this.vendedor = vendedor;
		this.cliente = cliente;
		this.dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss").format(LocalDateTime.now());
	}

	public String getFecha() {

		return dateTime;
	}

	/// metodos para pasar a service

	public void agregarProducto(Producto p) {
		this.listaProd.add(p);

	}

	public void agregarServicio(Servicio s) {
		this.listaServ.add(s);
	}

	public double sumaTotal() {
		double sumaPrecio = 0;
		if (listaProd.size() > 0) {
			for (Producto producto : listaProd)

				sumaPrecio += producto.getPrecioProducto() * producto.getCantidadProducto();
		}

		if (listaServ.size() > 0) {
			for (Servicio servicio : listaServ)

				sumaPrecio += servicio.getPrecioServicio() * servicio.getCantidadServicio();
		}
		
		return sumaPrecio;

	}

	public void listarVendidos() {

		if (listaProd.size() > 0) {
			for (Producto producto : listaProd)
				System.out.println(producto.mostrarProducto());

		}
		if (listaServ.size() > 0) {
			for (Servicio serv : listaServ)
				System.out.println(serv.mostrarDatos());
		}

	}

	@Override
	public String toString() {
		return "Vendedor:" + vendedor.datosVendedor() + "\nFecha: " + dateTime + "\nCliente: "
				+ cliente.toString();
	}

	public Ticket crearTicket(Venta v) { 
		v.sumaTotal();

		return new Ticket(v);

	}

}
