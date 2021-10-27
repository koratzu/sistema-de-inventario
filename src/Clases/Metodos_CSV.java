/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Metodos_CSV {
    public static DefaultTableModel modelo_de_csv(File archivo) throws FileNotFoundException, IOException
    {
        File fichero = new File("src\\csv\\INVENTARIO PORTAL DEL PARDO.csv");
        boolean headers=true; // Encabezados de Jtable
        FileReader documento=new FileReader(fichero); // Archivo a Leer
        BufferedReader input=new BufferedReader(documento); // Abrir Archivo
        String Linea; // Lectura de Lineas
        String Campo=""; // Lectura de Campos
        int tam;
        int aux;
        DefaultTableModel modelo=new DefaultTableModel(); //creacion de Modelo
        
        ArrayList <String> columnas= new ArrayList<String>(); //Vector de Columnas
        ArrayList<String> contenidofila=new ArrayList<String>(); //Vector del Contenido de filas
        while((Linea=input.readLine())!=null)
        {
           contenidofila.clear(); // Limpiar contenido de Fila
           tam=Linea.length(); // Tamaño de Linea
           aux=0;
           char cadena[]=new char[tam]; 
           cadena=Linea.toCharArray();
            for (int i = 0; i < tam; i++)
            {
                if(cadena[i]==';')
                {
                    Campo=Linea.substring(aux,i);
                    aux=i+1;
                
                    if(headers)
                    {
                        columnas.add(Campo);
                    }
                        else
                        {
                            contenidofila.add(Campo);
                        }
                }    
                            else if(i==(tam-1))
                            {
                                Campo=Linea.substring(aux,i+1);
                                    if(headers)
                                    {
                                        columnas.add(Campo);
                                        for (int j = 0; j < columnas.size(); j++)
                                        {
                                          modelo.addColumn(columnas.get(j));
                                            
                                        }
                                    }
                                    else
                                    {
                                        contenidofila.add(Campo);
                                        modelo.addRow(contenidofila.toArray());
                                    }
                                    headers=false;
                            }
                
            }
           
        }
        input.close();
        return modelo;
    }
    public static String  crearcsv (JTable tabla) throws IOException {
        int s, nf, nc;
        String nom = "";
        final String sigi = "\n";
        char limite = ';';
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();
        String a[][] = new String[nf][nc];
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                a[i][j] = String.valueOf(tabla.getValueAt(i, j));
            }
        }
        nom = JOptionPane.showInputDialog("nombre del archivo .csv");
        BufferedWriter salid;
        File prin = new File("src\\csv\\"+nom+".csv");
        if (prin.exists()){
            s = JOptionPane.showConfirmDialog(null,"El archiivo ya existe quiere suscribirlo","¿Pregunta?",JOptionPane.YES_NO_OPTION);
            if(s == 0){
              File borr = new File("src\\csv\\"+nom+".csv");
              borr.delete();
            }else{
                nom =JOptionPane.showInputDialog("Ingrese otro  nombre para el csv");  
            }
        }
        File da = new File("src\\csv\\"+nom+".csv");
        salid = new BufferedWriter(new FileWriter(da));
        salid.write("Numero de factura");
        salid.write(limite);
        salid.write("Codigo de referencia");
        salid.write(limite);
        salid.write("Articulo");
        salid.write(limite);
        salid.write("Cantidad");
        salid.write(limite);
        salid.write("Precio");
        salid.write(limite);
        salid.write("Total");
        salid.write(sigi);
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if(a[0].length-1 == j){
                salid.write(a[i][j]);
                salid.write(sigi);
                }else{
                salid.write(a[i][j]);
                salid.write(limite);
                }
            }
 
        }
        JOptionPane.showMessageDialog(null, "El archivo csv ya esta creado");
        salid.close();
        return nom;
    }
    
     public static void editar (String nom, JTable tblcsv) throws IOException {
        int nf, nc;
        final String sigi = "\n";
        char limite = ';';
        BufferedWriter camb;
        nf = tblcsv.getRowCount();
        nc = tblcsv.getColumnCount();
        String a[][] = new String[nf][nc];
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                a[i][j] = String.valueOf(tblcsv.getValueAt(i, j));
            }
        }
        File prin = new File("src\\csv\\"+nom+".csv");
        camb = new BufferedWriter(new FileWriter(prin));
        camb.write("Numero de factura");
        camb.write(limite);
        camb.write("Codigo de referencia");
        camb.write(limite);
        camb.write("Articulo");
        camb.write(limite);
        camb.write("Cantidad");
        camb.write(limite);
        camb.write("Precio");
        camb.write(limite);
        camb.write("Total");
        camb.write(sigi);
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if(a[0].length-1 == j){
                camb.write(a[i][j]);
                camb.write(sigi);
                }else{
                camb.write(a[i][j]);
                camb.write(limite);
                }
            }
        }
        camb.close();
        JOptionPane.showMessageDialog(null,"Se han guardados los cambios");
    }    
}
