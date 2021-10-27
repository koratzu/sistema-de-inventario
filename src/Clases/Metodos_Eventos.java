/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class Metodos_Eventos 
{
    public void LetrasKeyPress(KeyEvent evento)
            {
                char letra = evento.getKeyChar();
                if ((letra < 'a' || letra > 'z') && (letra <'A' || letra > 'Z') 
                        && (letra != (char)KeyEvent.VK_BACK_SPACE) && (letra != (char) KeyEvent.VK_SPACE) )
                {
                   evento.consume();
                }
            }
    public void NumerosKeyPress(KeyEvent evento_numerico)
    {
      char numero = evento_numerico.getKeyChar();
      if ((numero < '0' || numero > '9')  && (numero != (char)KeyEvent.VK_BACK_SPACE))
      {
           evento_numerico.consume();
      }
    }
    public void NumeroDecimalesKeyPress(KeyEvent evento_decimal, JTextField textos)
    {
        char decimal = evento_decimal.getKeyChar();
        if ((decimal < '0' || decimal  > '9') && textos.getText().contains(".") && (decimal != (char) KeyEvent.VK_BACK_SPACE))
        {
           evento_decimal.consume();
        }
    }
}
