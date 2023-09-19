/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.all.test;

/*
Definitive Guide to Swing for Java 2, Second Edition
By John Zukowski     
ISBN: 1-893115-78-X
Publisher: APress
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class RendererSample {

  public static void main(String args[]) {
    Object rows[][] = { { "one", "ichi - \u4E00" },
        { "two", "ni - \u4E8C" }, { "three", "san - \u4E09" },
        { "four", "shi - \u56DB" }, { "five", "go - \u4E94" },
        { "six", "roku - \u516D" }, { "seven", "shichi - \u4E03" },
        { "eight", "hachi - \u516B" }, { "nine", "kyu - \u4E5D" },
        { "ten", "ju - \u5341" } };
    Object headers[] = { "English", "Japanese" };
    JFrame frame = new JFrame("Renderer Sample");
    JTable table = new JTable(rows, headers);
    TableCellRenderer renderer = new EvenOddRenderer();
    table.setDefaultRenderer(Object.class, renderer);
    JScrollPane scrollPane = new JScrollPane(table);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}

class EvenOddRenderer implements TableCellRenderer {

  public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column);
    ((JLabel) renderer).setOpaque(true);
    Color foreground, background;
    if (isSelected) {
      foreground = Color.yellow;
      background = Color.green;
    } else {
      if (row % 2 == 0) {
        foreground = Color.blue;
        background = Color.white;
      } else {
        foreground = Color.white;
        background = Color.blue;
      }
    }
    renderer.setForeground(foreground);
    renderer.setBackground(background);
    return renderer;
  }
}
