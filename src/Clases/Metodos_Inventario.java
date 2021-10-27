/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Metodos_Inventario {
    public static void buscar(JTable tabla1,JTable tabla2, JTextField cod) {
      int nf, nc, con=0;
      String ref;
      DefaultTableModel tb2;
      
      nf = tabla1.getRowCount();
      nc = tabla1.getColumnCount();
      tb2 = (DefaultTableModel)tabla2.getModel();
      
      ref = cod.getText();
      String dat[][] = new String[nf][nc];
      String most[] = new String[nc];
         for (int f = 0; f < nf; f++) {
             for (int c = 0; c < nc; c++) {
                 dat[f][c] = (String)tabla1.getValueAt(f, c);
             }
         }
         
         for (int f = 0; f < nf; f++) {
             for (int c = 0; c < nc; c++) {
                 if (dat[f][2].equals(ref)){
                     most[c] = dat[f][c];
                     con++;
                 }
                 
             }
         }
          tb2.setRowCount(1);
         tb2.setColumnCount(nc);
             
         for (int j = 0; j < nc; j++) {
                 tabla2.setValueAt(most[j], 0, j);
             }
         }
    public static void estanual (JTable tabla1) {
      int nf, nc;
      double acum = 0, total;
      nf = tabla1.getRowCount();
      nc = tabla1.getColumnCount();
      String dat[][] = new String [nf][nc];
        for (int f = 0; f < nf; f++) {
            for (int c = 0; c < nc; c++) {
                dat[f][c] = (String)tabla1.getValueAt(f,c);
            }
        }
        for (int f = 0; f < nf; f++) {
              acum = acum + Double.parseDouble(dat[f][4]);  
            }
        
    total = acum * 12;
        JOptionPane.showMessageDialog(null,"El ingreso anual es "+total);
    }
    
}
