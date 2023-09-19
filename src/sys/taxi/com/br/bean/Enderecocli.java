/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.br.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author VGCT
 */
@Entity
@Table(name = "enderecocli", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Enderecocli.findAll", query = "SELECT e FROM Enderecocli e"),
    @NamedQuery(name = "Enderecocli.findByCodenderecocli", query = "SELECT e FROM Enderecocli e WHERE e.codenderecocli = :codenderecocli"),
    @NamedQuery(name = "Enderecocli.findByCepcli", query = "SELECT e FROM Enderecocli e WHERE e.cepcli = :cepcli"),
    @NamedQuery(name = "Enderecocli.findByUfcli", query = "SELECT e FROM Enderecocli e WHERE e.ufcli = :ufcli"),
    @NamedQuery(name = "Enderecocli.findByCidadecli", query = "SELECT e FROM Enderecocli e WHERE e.cidadecli = :cidadecli"),
    @NamedQuery(name = "Enderecocli.findByBairrocli", query = "SELECT e FROM Enderecocli e WHERE e.bairrocli = :bairrocli"),
    @NamedQuery(name = "Enderecocli.findByEnderecocli", query = "SELECT e FROM Enderecocli e WHERE e.enderecocli = :enderecocli"),
    @NamedQuery(name = "Enderecocli.findByNumerocasacli", query = "SELECT e FROM Enderecocli e WHERE e.numerocasacli = :numerocasacli"),
    @NamedQuery(name = "Enderecocli.findByComplementocli", query = "SELECT e FROM Enderecocli e WHERE e.complementocli = :complementocli"),
    @NamedQuery(name = "Enderecocli.findByCodigocliente", query = "SELECT e FROM Enderecocli e WHERE e.codigocliente = :codigocliente")
})
public class Enderecocli implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODENDERECOCLI")
    private Integer codenderecocli;
    @Column(name = "CEPCLI")
    private String cepcli;
    @Column(name = "UFCLI")
    private String ufcli;
    @Column(name = "CIDADECLI")
    private String cidadecli;
    @Column(name = "BAIRROCLI")
    private String bairrocli;
    @Column(name = "ENDERECOCLI")
    private String enderecocli;
    @Column(name = "NUMEROCASACLI")
    private String numerocasacli;
    @Column(name = "COMPLEMENTOCLI")
    private String complementocli;
    @JoinColumn(name = "CODCLIENTE", referencedColumnName = "CODCLIENTE")
    @ManyToOne
    private Cliente codcliente;
    @Column(name = "CODIGOCLIENTE")
    private Integer codigocliente;

    public Enderecocli() {
    }

    public Enderecocli(Integer codenderecocli) {
        this.codenderecocli = codenderecocli;
    }

    public Integer getCodenderecocli() {
        return codenderecocli;
    }

    public void setCodenderecocli(Integer codenderecocli) {
        Integer oldCodenderecocli = this.codenderecocli;
        this.codenderecocli = codenderecocli;
        changeSupport.firePropertyChange("codenderecocli", oldCodenderecocli, codenderecocli);
    }

    public String getCepcli() {
        return cepcli;
    }

    public void setCepcli(String cepcli) {
        String oldCepcli = this.cepcli;
        this.cepcli = cepcli;
        changeSupport.firePropertyChange("cepcli", oldCepcli, cepcli);
    }

    public String getUfcli() {
        return ufcli;
    }

    public void setUfcli(String ufcli) {
        String oldUfcli = this.ufcli;
        this.ufcli = ufcli;
        changeSupport.firePropertyChange("ufcli", oldUfcli, ufcli);
    }

    public String getCidadecli() {
        return cidadecli;
    }

    public void setCidadecli(String cidadecli) {
        String oldCidadecli = this.cidadecli;
        this.cidadecli = cidadecli;
        changeSupport.firePropertyChange("cidadecli", oldCidadecli, cidadecli);
    }

    public String getBairrocli() {
        return bairrocli;
    }

    public void setBairrocli(String bairrocli) {
        String oldBairrocli = this.bairrocli;
        this.bairrocli = bairrocli;
        changeSupport.firePropertyChange("bairrocli", oldBairrocli, bairrocli);
    }

    public String getEnderecocli() {
        return enderecocli;
    }

    public void setEnderecocli(String enderecocli) {
        String oldEnderecocli = this.enderecocli;
        this.enderecocli = enderecocli;
        changeSupport.firePropertyChange("enderecocli", oldEnderecocli, enderecocli);
    }

    public String getNumerocasacli() {
        return numerocasacli;
    }

    public void setNumerocasacli(String numerocasacli) {
        String oldNumerocasacli = this.numerocasacli;
        this.numerocasacli = numerocasacli;
        changeSupport.firePropertyChange("numerocasacli", oldNumerocasacli, numerocasacli);
    }

    public String getComplementocli() {
        return complementocli;
    }

    public void setComplementocli(String complementocli) {
        String oldComplementocli = this.complementocli;
        this.complementocli = complementocli;
        changeSupport.firePropertyChange("complementocli", oldComplementocli, complementocli);
    }

    public Cliente getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Cliente codcliente) {
        Cliente oldCodcliente = this.codcliente;
        this.codcliente = codcliente;
        changeSupport.firePropertyChange("codcliente", oldCodcliente, codcliente);
    }
    
    public Integer getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(Integer codigocliente) {
        Integer oldCodigocliente = this.codigocliente;
        this.codigocliente = codigocliente;
        changeSupport.firePropertyChange("codcliente", oldCodigocliente, codigocliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codenderecocli != null ? codenderecocli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enderecocli)) {
            return false;
        }
        Enderecocli other = (Enderecocli) object;
        if ((this.codenderecocli == null && other.codenderecocli != null) || (this.codenderecocli != null && !this.codenderecocli.equals(other.codenderecocli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Enderecocli[ codenderecocli=" + codenderecocli + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
