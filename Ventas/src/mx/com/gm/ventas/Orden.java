/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.ventas;

/**
 *
 * @author lepo9
 */
public class Orden {
    private int idOreden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProducto;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
    
        this.idOreden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
    
        if(this.contadorProducto < Orden.MAX_PRODUCTOS){
        
            this.productos[this.contadorOrdenes++] = producto;
        }
        else{
        
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
    
        double total = 0;
        for (int i = 0; i < this.contadorProducto; i++) {
//            Producto producto = this.productos[i];
//            total += producto.getPrecio();//total = total + producto.getPrecio()
            total += this.productos[i].getPrecio();
        }
        
        return total;
    }
    
    public void mostrarOrden(){
    
        System.out.println("Id Orden: " + this.idOreden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $"+totalOrden);
        System.out.println("Productos de las Orden: ");
        for (int i = 0; i < this.contadorProducto; i++) {
            System.out.println(this.productos[i]);
        }
        
    }
    
}
