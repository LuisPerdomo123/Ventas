/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.ventas;

/**
 *
 * @author lepo9
 */
public class Producto {

    private final int idProducto;//Se puede leer pero no modificar la variable
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {

        this.idProducto = ++Producto.contadorProductos;

    }

    public Producto(String nombre, double precio){
    
        this();//Se llama al contructor vacio de la clase. Inicializa la variable idProducto-
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    
    
}
