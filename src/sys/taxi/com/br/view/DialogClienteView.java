/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EnderecoClienteView.java
 *
 * Created on 15/01/2013, 17:18:40
 */
package sys.taxi.com.br.view;

/**
 *
 * @author VGCT
 */

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.SimpleDateFormat;
import sys.taxi.com.all.util.Data;
import sys.taxi.com.all.util.FormatarCampos;
import sys.taxi.com.br.bean.Cliente;



public class DialogClienteView extends javax.swing.JDialog {

    /** Creates new form EnderecoClienteView */
    public DialogClienteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        nomefuncField = new javax.swing.JTextField();
        nomefuncLabel = new javax.swing.JLabel();
        telefonefuncField = new javax.swing.JFormattedTextField();
        telefonefuncLabel = new javax.swing.JLabel();
        celularfuncLabel = new javax.swing.JLabel();
        celularfuncField = new javax.swing.JFormattedTextField();
        emailfuncLabel = new javax.swing.JLabel();
        emailfuncField = new javax.swing.JTextField();
        datanasfuncLabel = new javax.swing.JLabel();
        EDIDataNascimentoFunc = new javax.swing.JFormattedTextField();
        dataadmicaofuncLabel = new javax.swing.JLabel();
        EDIDataCadastroFunc = new javax.swing.JFormattedTextField();
        BOTDataAtual = new javax.swing.JButton();
        BOTCancelar = new javax.swing.JButton();
        BOTSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${dadoCliente.nomecli}"), nomefuncField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        nomefuncField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomefuncFieldActionPerformed(evt);
            }
        });

        nomefuncLabel.setText("Nome :");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${dadoCliente.telefonecli}"), telefonefuncField, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        telefonefuncField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonefuncFieldActionPerformed(evt);
            }
        });
        telefonefuncField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonefuncFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonefuncFieldFocusLost(evt);
            }
        });

        telefonefuncLabel.setText("Telefone :");

        celularfuncLabel.setText("Celular :");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${dadoCliente.celularcli}"), celularfuncField, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        celularfuncField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                celularfuncFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                celularfuncFieldFocusLost(evt);
            }
        });

        emailfuncLabel.setText("Email :");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${dadoCliente.emailcli}"), emailfuncField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        datanasfuncLabel.setText("Data Nascimento :");

        EDIDataNascimentoFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${dadoCliente.datanascli}"), EDIDataNascimentoFunc, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        dataadmicaofuncLabel.setText("Data Cadastro :");

        EDIDataCadastroFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${dadoCliente.datacadastrocli}"), EDIDataCadastroFunc, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        EDIDataCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIDataCadastroFuncActionPerformed(evt);
            }
        });

        BOTDataAtual.setToolTipText("Hoje.");
        BOTDataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTDataAtualActionPerformed(evt);
            }
        });

        BOTCancelar.setText("Cancelar");
        BOTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTCancelarActionPerformed(evt);
            }
        });

        BOTSalvar.setText("Salvar");
        BOTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonefuncLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datanasfuncLabel)
                            .addComponent(nomefuncLabel)
                            .addComponent(emailfuncLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailfuncField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomefuncField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EDIDataNascimentoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(telefonefuncField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(celularfuncLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(celularfuncField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dataadmicaofuncLabel)
                                            .addGap(14, 14, 14)
                                            .addComponent(EDIDataCadastroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BOTDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BOTCancelar)
                                            .addGap(18, 18, 18)
                                            .addComponent(BOTSalvar))))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomefuncField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomefuncLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datanasfuncLabel)
                        .addComponent(EDIDataNascimentoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataadmicaofuncLabel)
                        .addComponent(EDIDataCadastroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BOTDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonefuncLabel)
                    .addComponent(celularfuncLabel)
                    .addComponent(telefonefuncField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularfuncField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailfuncLabel)
                    .addComponent(emailfuncField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTCancelar)
                    .addComponent(BOTSalvar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void EDIDataCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIDataCadastroFuncActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_EDIDataCadastroFuncActionPerformed

private void BOTDataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTDataAtualActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Data mostraData = new Data();
        mostraData.leData();
    EDIDataCadastroFunc.setText(formato.format(mostraData.dataAtual));
}//GEN-LAST:event_BOTDataAtualActionPerformed

private void nomefuncFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomefuncFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_nomefuncFieldActionPerformed

private void BOTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTSalvarActionPerformed
setConfirmaCliente(true);
setVisible(false);
}//GEN-LAST:event_BOTSalvarActionPerformed

private void BOTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTCancelarActionPerformed
setConfirmaCliente(false);
setVisible(false);
}//GEN-LAST:event_BOTCancelarActionPerformed

private void telefonefuncFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonefuncFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_telefonefuncFieldActionPerformed

FormatarCampos formatarText = new FormatarCampos();

private void telefonefuncFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonefuncFieldFocusGained
    conteudoTelefone = telefonefuncField.getText();
    formatarText.gainedMascara(telefonefuncField, "(##)####-####");
    telefonefuncField.setText(conteudoTelefone);
}//GEN-LAST:event_telefonefuncFieldFocusGained
String conteudoTelefone;
private void telefonefuncFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonefuncFieldFocusLost
formatarText.lostMascara(telefonefuncField, "(  )    -    ", "##########");
conteudoTelefone = telefonefuncField.getText();
}//GEN-LAST:event_telefonefuncFieldFocusLost

private void celularfuncFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularfuncFieldFocusGained
    conteudoCelular = celularfuncField.getText();
    formatarText.gainedMascara(celularfuncField, "(##)####-####");
    celularfuncField.setText(conteudoCelular);
}//GEN-LAST:event_celularfuncFieldFocusGained
String conteudoCelular;
private void celularfuncFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularfuncFieldFocusLost
    formatarText.lostMascara(celularfuncField, "(  )    -    ", "##########");
    conteudoCelular = celularfuncField.getText();
}//GEN-LAST:event_celularfuncFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DialogClienteView dialog = new DialogClienteView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    protected Cliente dadoCliente;

    /**
     * Get the value of dadoCliente
     *
     * @return the value of dadoCliente
     */
    public Cliente getDadoCliente() {
        return dadoCliente;
    }

    /**
     * Set the value of dadoCliente
     *
     * @param dadoCliente new value of dadoCliente
     */
    public void setDadoCliente(Cliente dadoCliente) {
        Cliente oldRecord = this.dadoCliente;
        this.dadoCliente = dadoCliente;
        propertyChangeSupport.firePropertyChange("dadoCliente", oldRecord, dadoCliente);
    }
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    protected boolean ConfirmaCliente;

    /**
     * Get the value of ConfirmaCliente
     *
     * @return the value of ConfirmaCliente
     */
    public boolean isConfirmaCliente() {
        return ConfirmaCliente;
    }

    /**
     * Set the value of ConfirmaCliente
     *
     * @param ConfirmaCliente new value of ConfirmaCliente
     */
    public void setConfirmaCliente(boolean ConfirmaCliente) {
        this.ConfirmaCliente = ConfirmaCliente;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTCancelar;
    private javax.swing.JButton BOTDataAtual;
    private javax.swing.JButton BOTSalvar;
    private javax.swing.JFormattedTextField EDIDataCadastroFunc;
    private javax.swing.JFormattedTextField EDIDataNascimentoFunc;
    private javax.swing.JFormattedTextField celularfuncField;
    private javax.swing.JLabel celularfuncLabel;
    private javax.swing.JLabel dataadmicaofuncLabel;
    private javax.swing.JLabel datanasfuncLabel;
    private javax.swing.JTextField emailfuncField;
    private javax.swing.JLabel emailfuncLabel;
    private javax.swing.JTextField nomefuncField;
    private javax.swing.JLabel nomefuncLabel;
    private javax.swing.JFormattedTextField telefonefuncField;
    private javax.swing.JLabel telefonefuncLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    

}
