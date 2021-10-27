/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Metodos_Ventas extends Ventas
{
   public static int CantidadArticulo;
   public static Double PrecioArticulo;
   
   public Metodos_Ventas(String Pago_con, String Articulo, int CantidadArticulo, Double PrecioArticulo)
   {
    super(Pago_con, Articulo);
    this.CantidadArticulo = CantidadArticulo;
    this.PrecioArticulo = PrecioArticulo;
   }
   
   public Metodos_Ventas(){}
   public static int getCantidadArticulo() {return CantidadArticulo;}
   public static Double getPrecioArticulo() {return PrecioArticulo;}
     
}
