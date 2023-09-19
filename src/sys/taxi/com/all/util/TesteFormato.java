/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.all.util;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;



/**
 *
 * @author VGCT
 */
public class TesteFormato {
    
    public void testeNulo (JFormattedTextField campo)
    {
        System.out.println(campo.getText());
        System.out.println(campo.getText().charAt(campo.getText().length() - 1));
        String str = ""+campo.getText().charAt(campo.getText().length() - 1);
    if(str.equals(" "))
    {
            JOptionPane.showMessageDialog(null, "O campo precisa estar completamente preenchido!");
    }
    }
    
    }
