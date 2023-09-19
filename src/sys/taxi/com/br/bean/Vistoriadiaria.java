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
@Table(name = "vistoriadiaria", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vistoriadiaria.findAll", query = "SELECT v FROM Vistoriadiaria v"),
    @NamedQuery(name = "Vistoriadiaria.findByCodvistoria", query = "SELECT v FROM Vistoriadiaria v WHERE v.codvistoria = :codvistoria"),
    @NamedQuery(name = "Vistoriadiaria.findByLocalvistoria", query = "SELECT v FROM Vistoriadiaria v WHERE v.localvistoria = :localvistoria"),
    @NamedQuery(name = "Vistoriadiaria.findByDescricao", query = "SELECT v FROM Vistoriadiaria v WHERE v.descricao = :descricao"),
    @NamedQuery(name = "Vistoriadiaria.findByExtras", query = "SELECT v FROM Vistoriadiaria v WHERE v.extras = :extras"),
    @NamedQuery(name = "Vistoriadiaria.findByObservacao", query = "SELECT v FROM Vistoriadiaria v WHERE v.observacao = :observacao"),
    @NamedQuery(name = "Vistoriadiaria.findByAutomovel", query = "SELECT v FROM Vistoriadiaria v WHERE v.automovel = :automovel")})
public class Vistoriadiaria implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODVISTORIA")
    private Integer codvistoria;
    @Column(name = "LOCALVISTORIA")
    private String localvistoria;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "EXTRAS")
    private String extras;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @JoinColumn(name = "CODDIARIAFUNC", referencedColumnName = "CODDIARIAFUNC")
    @ManyToOne
    private Diariafunc coddiariafunc;
    @Column(name = "AUTOMOVEL")
    private String automovel;

    public Vistoriadiaria() {
    }

    public Vistoriadiaria(Integer codvistoria) {
        this.codvistoria = codvistoria;
    }

    public Integer getCodvistoria() {
        return codvistoria;
    }

    public void setCodvistoria(Integer codvistoria) {
        Integer oldCodvistoria = this.codvistoria;
        this.codvistoria = codvistoria;
        changeSupport.firePropertyChange("codvistoria", oldCodvistoria, codvistoria);
    }

    public String getLocalvistoria() {
        return localvistoria;
    }

    public void setLocalvistoria(String localvistoria) {
        String oldLocalvistoria = this.localvistoria;
        this.localvistoria = localvistoria;
        changeSupport.firePropertyChange("localvistoria", oldLocalvistoria, localvistoria);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        String oldExtras = this.extras;
        this.extras = extras;
        changeSupport.firePropertyChange("extras", oldExtras, extras);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public Diariafunc getCoddiariafunc() {
        return coddiariafunc;
    }

    public void setCoddiariafunc(Diariafunc coddiariafunc) {
        Diariafunc oldCoddiariafunc = this.coddiariafunc;
        this.coddiariafunc = coddiariafunc;
        changeSupport.firePropertyChange("coddiariafunc", oldCoddiariafunc, coddiariafunc);
    }
    
     public String getAutomovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        String oldAutomovel = this.automovel;
        this.automovel = automovel;
        changeSupport.firePropertyChange("automovel", oldAutomovel, automovel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codvistoria != null ? codvistoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vistoriadiaria)) {
            return false;
        }
        Vistoriadiaria other = (Vistoriadiaria) object;
        if ((this.codvistoria == null && other.codvistoria != null) || (this.codvistoria != null && !this.codvistoria.equals(other.codvistoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Vistoriadiaria[ codvistoria=" + codvistoria + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
