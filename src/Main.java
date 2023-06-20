import entity.Cliente;
import entity.Producto;
import entity.Ticket;
import entity.Vendedor;
import entity.Venta;

public class Main {

	public static void main(String[] args) {
		// productos cargados para prueba

		Producto p = new Producto(23, "pelota", 200, 1);
		Producto pa = new Producto(89, "pipeta", 1500, 1);
		Producto pas = new Producto(90, "Hueso", 800, 1);

		// Instancia de Vendedor cargado para prueba

		Vendedor ven = new Vendedor("Gomez", "Paolo", 39898230);

		// Vendedor registra un cliente

		Cliente c = ven.registrarCliente("Juan Manuel", "Vecchinoo", 32091232, 42969921, 1154326908, "Alem 1567",
				"jlopez@gmail.com");

		// Vendedor crea una venta

	Venta v = ven.vender(c);
	
	// venta agrega productos
	v.agregarProducto(p);
	v.agregarProducto(pa);
	v.agregarProducto(pas);

	
	
	// venta emite un ticket 
	Ticket t = v.crearTicket(v);
	
	t.imprimirTicket(v);
	//t.imprimirTicket();
 
//	System.out.println(ven.toString());	
//	System.out.println("-------------------------");
//	
//	System.out.println(c.toString());
	
	
	}

}
