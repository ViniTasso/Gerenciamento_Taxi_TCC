/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.br.util;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author VGCT
 */

public class guardaInformacoes {
    static  String tipoUsuario = "Q";
    protected void informacaoUsuario(){
       
    }
    
    public String tipoLogin;

    /**
     * Get the value of tipoLogin
     *
     * @return the value of tipoLogin
     */
    public String getTipoLogin() {
        return tipoLogin;
    }

    /**
     * Set the value of tipoLogin
     *
     * @param tipoLogin new value of tipoLogin
     */
    public void setTipoLogin(String tipoLogin) {
        this.tipoLogin = tipoLogin;
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

}
