/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.all.renderer;

/**
 *
 * @author VGCT
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sys.taxi.com.br.bean.Veiculo;

/**
 *
 * @author VGCT
 */
public class UnidadeListCellRendererVeiculo extends DefaultListCellRenderer {
    
    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected,boolean cellHasFocus) {
            super.getListCellRendererComponent(list,value,index, isSelected,cellHasFocus);
//Sistema deve ser substituido pelo bean que vc desejar utilizar
//e getNome() deve ser substituído pelo campo do bean que sera utilizado
    if (value instanceof Veiculo) {
        Veiculo v = (Veiculo) value;
        setText(v.getNomevei());
    }
return this;}
}