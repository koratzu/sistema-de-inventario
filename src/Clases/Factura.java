
package Clases;

public class Factura 
{
   private static String referencia;
   private static String articulo;
   public Factura(String referencia, String articulo)
   {
       this.referencia = referencia;
       this.articulo = articulo;
       
   }
   public Factura() { }
   public String getReferencia(){return referencia;}
   public String getArticulo() {return articulo;}
   
}
