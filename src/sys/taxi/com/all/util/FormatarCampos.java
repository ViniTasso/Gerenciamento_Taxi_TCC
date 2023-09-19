/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.all.util;



import javax.swing.JFormattedTextField;

/**
 *
 * @author VGCT
 */
public class FormatarCampos {
    public void gainedMascara(JFormattedTextField field, String mascara/* , String guardaConteudo */) {
        //field será o objeto que ira receber a mascara.
        //mascara será a mascara utilizada no campo. ex "(##)####-####"
        //guardaConteudo sera uma variavel que guardara o conteudo dos jtext's.
        try {
            field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(mascara)));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        //field.setText(guardaConteudo);
    }

    public void lostMascara(JFormattedTextField field, String mascaraVazia, String semMascara/* , String tamanhoCampo,String guardaConteudo */) {
        //field será o objeto que ira receber a mascara.
        //mascaraVazia sera a mascara do campo sem nenhum valor. ex "(  )    -    "
        //semMascara sera a mascara do campo, que ira setar nenhuma mascara. ex "##########"
        //tamanhoCampo sera a variavel que tera o tamanho do campo alvo em "Espaços". ex "          "
        //guardaConteudo sera uma variavel que guardara o conteudo dos jtext's.
        if (mascaraVazia.equals(field.getText())) {
            try {
                field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(semMascara)));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        }
         /*  if(field.getText().equals(tamanhoCampo)){
                guardaConteudo = field.getText();
            }*/
        
    }
}
