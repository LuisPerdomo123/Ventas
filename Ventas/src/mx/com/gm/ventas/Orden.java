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
        
            productos[contadorOrdenes++] = producto;
        }
        else{
        
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
}
