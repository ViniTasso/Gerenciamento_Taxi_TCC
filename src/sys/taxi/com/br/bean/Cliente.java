/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.br.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 *
 * @author VGCT
 */
@Entity
@Table(name = "cliente", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodcliente", query = "SELECT c FROM Cliente c WHERE c.codcliente = :codcliente"),
    @NamedQuery(name = "Cliente.findByNomecli", query = "SELECT c FROM Cliente c WHERE c.nomecli = :nomecli"),
    @NamedQuery(name = "Cliente.findByEmailcli", query = "SELECT c FROM Cliente c WHERE c.emailcli = :emailcli"),
    @NamedQuery(name = "Cliente.findByTelefonecli", query = "SELECT c FROM Cliente c WHERE c.telefonecli = :telefonecli"),
    @NamedQuery(name = "Cliente.findByCelularcli", query = "SELECT c FROM Cliente c WHERE c.celularcli = :celularcli"),
    @NamedQuery(name = "Cliente.findByDatanascli", query = "SELECT c FROM Cliente c WHERE c.datanascli = :datanascli"),
    @NamedQuery(name = "Cliente.findByDatacadastrocli", query = "SELECT c FROM Cliente c WHERE c.datacadastrocli = :datacadastrocli")})
public class Cliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @JoinColumn(name = "CODCLIENTE",referencedColumnName="CODCLIENTE")
    private Integer codcliente;
    @Column(name = "NOMECLI")
    private String nomecli;
    @Column(name = "EMAILCLI")
    private String emailcli;
    @Column(name = "TELEFONECLI")
    private String telefonecli;
    @Column(name = "CELULARCLI")
    private String celularcli;
    @Column(name = "DATANASCLI")
    @Temporal(TemporalType.DATE)
    private Date datanascli;
    @Column(name = "DATACADASTROCLI")
    @Temporal(TemporalType.DATE)
    private Date datacadastrocli;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codcliente")
    private Collection<Enderecocli> enderecocliCollection;

    public Cliente() {
    }

    public Cliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        Integer oldCodcliente = this.codcliente;
        this.codcliente = codcliente;
        changeSupport.firePropertyChange("codcliente", oldCodcliente, codcliente);
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        String oldNomecli = this.nomecli;
        this.nomecli = nomecli;
        changeSupport.firePropertyChange("nomecli", oldNomecli, nomecli);
    }

    public String getEmailcli() {
        return emailcli;
    }

    public void setEmailcli(String emailcli) {
        String oldEmailcli = this.emailcli;
        this.emailcli = emailcli;
        changeSupport.firePropertyChange("emailcli", oldEmailcli, emailcli);
    }

    public String getTelefonecli() {
        return telefonecli;
    }

    public void setTelefonecli(String telefonecli) {
        String oldTelefonecli = this.telefonecli;
        this.telefonecli = telefonecli;
        changeSupport.firePropertyChange("telefonecli", oldTelefonecli, telefonecli);
    }

    public String getCelularcli() {
        return celularcli;
    }

    public void setCelularcli(String celularcli) {
        String oldCelularcli = this.celularcli;
        this.celularcli = celularcli;
        changeSupport.firePropertyChange("celularcli", oldCelularcli, celularcli);
    }

    public Date getDatanascli() {
        return datanascli;
    }

    public void setDatanascli(Date datanascli) {
        Date oldDatanascli = this.datanascli;
        this.datanascli = datanascli;
        changeSupport.firePropertyChange("datanascli", oldDatanascli, datanascli);
    }

    public Date getDatacadastrocli() {
        return datacadastrocli;
    }

    public void setDatacadastrocli(Date datacadastrocli) {
        Date oldDatacadastrocli = this.datacadastrocli;
        this.datacadastrocli = datacadastrocli;
        changeSupport.firePropertyChange("datacadastrocli", oldDatacadastrocli, datacadastrocli);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcliente != null ? codcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codcliente == null && other.codcliente != null) || (this.codcliente != null && !this.codcliente.equals(other.codcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Cliente[ codcliente=" + codcliente + " ]";
    }

    public Collection<Enderecocli> getEnderecocliCollection() {
        return enderecocliCollection;
    }

    public void setEnderecocliCollection(Collection<Enderecocli> enderecocliCollection) {
        this.enderecocliCollection = enderecocliCollection;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
