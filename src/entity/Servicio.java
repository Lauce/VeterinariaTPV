package entity;

public class Servicio {
	
	 	//tipo enum
	    private String nombreServicio;
	    private double precio;
	    private String reporte;
	    private int cantidadServicio;
	    private int codigoServicio;


	public double getPrecioServicio() {
		return this.precio;
	}

	public int getCantidadServicio() {
		return this.cantidadServicio;
	}

	public void mostrarServicio(){
        System.out.print(
               "\n-----------Servicio --------" +
               "\nCod: " + this.codigoServicio +
                "\nNombre Del Servicio: " + this.nombreServicio +
                "\nPrecio: " + this.precio +"$"+
                "\nReporte: " + this.reporte);
    }
	//Datos para ticket
    public String mostrarDatos() {
    	 return
                 "\n---------------------------------" +
                 "\nCod: " + this.codigoServicio +
                  "\nTipo Servicio: " + this.nombreServicio +
                  "\nPrecio: " + this.precio;
                 
    	
    }
}
