/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.all.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author VGCT
 */
//este codigo cria uma inner-class que implemente TableCellRender:

    class Colorir extends JLabel implements   
       TableCellRenderer{  
  public Colorir(){  
    setOpaque(true);  
  }  
    
  public Component getTableCellRendererComponent(  
     JTable table,   
     Object value, boolean isSelected, boolean hasFocus,  
        int row, int column){  
      
     if(row == table.getRowCount()){  
       setBackground(Color.YELLOW);   
     }  
     else{  
       setBackground(table.getBackground());          
     }       
              
     return this;         
  }  
    
  public void validate() {}  
  public void revalidate() {}  
  protected void firePropertyChange(String propertyName,  
     Object oldValue, Object newValue) {}  
  public void firePropertyChange(String propertyName,  
     boolean oldValue, boolean newValue) {}    
    
}

/*
Após a criação de sua tabela (JTable tabela = new JTable()), eu faria: 
 
 este codigo faz com que a linha selecionada seja pintada de amarelo ( que foi a cor escolhida no codigo acima.)
 * 
TableCellRenderer tcr = new Colorir();  
TableColumn column =  tabela.getColumnModel().getColumn(1); // Apenas para a coluna 1.  
column.setCellRenderer(tcr);  
*/