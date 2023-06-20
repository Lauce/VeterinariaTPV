package entity;



public class Ticket {
	private static int contador = 0;
	private int id;
	private double total;
	private String datos;

	public Ticket(Venta venta) {
		contador++;
		this.id = contador;
		this.total = venta.sumaTotal();
		this.datos = venta.toString();
	}

	public void imprimirTicket(Venta venta) {
		
		System.out.println(this.id);
		System.out.println("-----------------------\n" + this.datos);
		System.out.println("\nCod\tDescripcion\tCantidad\tPrecio\n");
		venta.listarVendidos();
		
		System.out.println("________________________________________________");
        System.out.println("Total                                     " + this.total);
	}

}
