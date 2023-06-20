package service;

import entity.Cliente;

public class VendedorService {

//    public void realizarVenta(){
//  	 Venta nuevaVenta = new Venta(this.nombre);
//}

public Cliente registrarCliente(int dni, String nombre, String apellido, int telefono, int celular, String direccion, String mail){
    Cliente nuevoCliente = new Cliente(mail, mail, celular, celular, celular, mail, mail);
    return nuevoCliente;
}
}
