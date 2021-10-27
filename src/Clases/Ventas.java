/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Ventas 
{
    private static String Pago_con;
    private static String Articulo;

    public Ventas(String Pago_con, String Articulo) 
    {
     this.Pago_con = Pago_con;
     this.Articulo = Articulo;
    }
    
    public Ventas(){}
    public static String getPago_con() {return Pago_con;}
    public static String getArticulo() {return Articulo;}
    
}
