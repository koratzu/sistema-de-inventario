/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class  Metodos_Clientes  extends Clientes
{
    private static int IDCliente;
    private static String Telefono;
    private static String Deudas;

    public Metodos_Clientes (String Nombre, String Apellido, int IDCliente, String Telefono, String Deudas) 
    {
        super(Nombre,Apellido);
        this.IDCliente = IDCliente;
        this.Telefono = Telefono;
        this.Deudas = Deudas;
    }

    public Metodos_Clientes() {}
    public int getIdCliente(){return IDCliente;}
    public String getTelefono(){return Telefono;} 
    public String getPrecio(){return Deudas;}    
    
}
