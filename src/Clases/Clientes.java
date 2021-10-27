/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Clientes 
{
    private static String NombreCompleto;
    private static String Apellido;

    public Clientes(String Nombre, String Apellido) 
    {
      this.NombreCompleto = Nombre;
      this.Apellido = Apellido;
    }
    public Clientes (){}
    public String getNombre(){return NombreCompleto;}
    public String getApellido(){return Apellido;}
}
