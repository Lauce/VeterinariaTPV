package entity;

public class Producto {
	// private String tipoProducto;
	private int codigoProducto;
	private String descripcion;
	private float precioProducto;
	private int cantidadProducto;

	public Producto(int codigoProducto, String descripcion, float precioProducto, int cantidadProducto) {

		this.codigoProducto = codigoProducto;
		this.descripcion = descripcion;
		this.precioProducto = precioProducto;
		this.cantidadProducto = cantidadProducto;
		
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPrecioProducto() {
		return precioProducto;
	}

	public double sumarPrecio() {
		double total = 0;
		return total;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String mostrarProducto() {
		return this.codigoProducto + "        " + this.descripcion +  "             " + this.getCantidadProducto()
				+ "              " + this.precioProducto;

	}

}
