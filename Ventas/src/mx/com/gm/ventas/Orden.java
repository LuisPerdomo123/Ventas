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
    
    
    
}
