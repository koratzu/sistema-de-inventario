
package Clases;

public class Metodos_Factura extends Factura
{
   private static int NumeroFactura;
   private static String Fecha;
   private static Double Precio;
   private static int Cantidad;
   public Metodos_Factura(int NumeroFactura, String Fecha, Double Precio, int Cantidad, String articulo, String referencia)
   {
       super(referencia,articulo);
       this.NumeroFactura = NumeroFactura;
       this.Fecha = Fecha;
       this.Precio = Precio;
       this.Cantidad = Cantidad;
   }
   public Metodos_Factura(){}
   public int getNumeroFactura(){return NumeroFactura;}
   public String getFecha(){return Fecha;}
   public Double getPrecio(){return Precio;}
   public int getCantidad(){return Cantidad;}
   
}
