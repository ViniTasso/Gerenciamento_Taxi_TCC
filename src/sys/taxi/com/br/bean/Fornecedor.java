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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author VGCT
 */
@Entity
@Table(name = "fornecedor", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByCodforn", query = "SELECT f FROM Fornecedor f WHERE f.codforn = :codforn"),
    @NamedQuery(name = "Fornecedor.findByNomeforn", query = "SELECT f FROM Fornecedor f WHERE f.nomeforn = :nomeforn"),
    @NamedQuery(name = "Fornecedor.findByCpfforn", query = "SELECT f FROM Fornecedor f WHERE f.cpfforn = :cpfforn"),
    @NamedQuery(name = "Fornecedor.findByRgforn", query = "SELECT f FROM Fornecedor f WHERE f.rgforn = :rgforn"),
    @NamedQuery(name = "Fornecedor.findByOrganizacaoforn", query = "SELECT f FROM Fornecedor f WHERE f.organizacaoforn = :organizacaoforn"),
    @NamedQuery(name = "Fornecedor.findByCnpjforn", query = "SELECT f FROM Fornecedor f WHERE f.cnpjforn = :cnpjforn"),
    @NamedQuery(name = "Fornecedor.findByTipoforn", query = "SELECT f FROM Fornecedor f WHERE f.tipoforn = :tipoforn"),
    @NamedQuery(name = "Fornecedor.findByEnderecoforn", query = "SELECT f FROM Fornecedor f WHERE f.enderecoforn = :enderecoforn"),
    @NamedQuery(name = "Fornecedor.findByBairroforn", query = "SELECT f FROM Fornecedor f WHERE f.bairroforn = :bairroforn"),
    @NamedQuery(name = "Fornecedor.findByCidadeforn", query = "SELECT f FROM Fornecedor f WHERE f.cidadeforn = :cidadeforn"),
    @NamedQuery(name = "Fornecedor.findByUfforn", query = "SELECT f FROM Fornecedor f WHERE f.ufforn = :ufforn"),
    @NamedQuery(name = "Fornecedor.findByCepforn", query = "SELECT f FROM Fornecedor f WHERE f.cepforn = :cepforn"),
    @NamedQuery(name = "Fornecedor.findByEmailforn", query = "SELECT f FROM Fornecedor f WHERE f.emailforn = :emailforn"),
    @NamedQuery(name = "Fornecedor.findBySiteforn", query = "SELECT f FROM Fornecedor f WHERE f.siteforn = :siteforn"),
    @NamedQuery(name = "Fornecedor.findByTelefoneforn", query = "SELECT f FROM Fornecedor f WHERE f.telefoneforn = :telefoneforn"),
    @NamedQuery(name = "Fornecedor.findByCelularforn", query = "SELECT f FROM Fornecedor f WHERE f.celularforn = :celularforn"),
    @NamedQuery(name = "Fornecedor.findByFaxforn", query = "SELECT f FROM Fornecedor f WHERE f.faxforn = :faxforn"),
    @NamedQuery(name = "Fornecedor.findByContatoforn", query = "SELECT f FROM Fornecedor f WHERE f.contatoforn = :contatoforn")})
public class Fornecedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODFORN")
    private Integer codforn;
    @Column(name = "NOMEFORN")
    private String nomeforn;
    @Column(name = "CPFFORN")
    private String cpfforn;
    @Column(name = "RGFORN")
    private String rgforn;
    @Column(name = "ORGANIZACAOFORN")
    private String organizacaoforn;
    @Column(name = "CNPJFORN")
    private String cnpjforn;
    @Column(name = "TIPOFORN")
    private Character tipoforn;
    @Column(name = "ENDERECOFORN")
    private String enderecoforn;
    @Column(name = "BAIRROFORN")
    private String bairroforn;
    @Column(name = "CIDADEFORN")
    private String cidadeforn;
    @Column(name = "UFFORN")
    private String ufforn;
    @Column(name = "CEPFORN")
    private String cepforn;
    @Column(name = "EMAILFORN")
    private String emailforn;
    @Column(name = "SITEFORN")
    private String siteforn;
    @Column(name = "TELEFONEFORN")
    private String telefoneforn;
    @Column(name = "CELULARFORN")
    private String celularforn;
    @Column(name = "FAXFORN")
    private String faxforn;
    @Column(name = "CONTATOFORN")
    private String contatoforn;
    

    public Fornecedor() {
    }

    public Fornecedor(Integer codforn) {
        this.codforn = codforn;
    }

    public Integer getCodforn() {
        return codforn;
    }

    public void setCodforn(Integer codforn) {
        Integer oldCodforn = this.codforn;
        this.codforn = codforn;
        changeSupport.firePropertyChange("codforn", oldCodforn, codforn);
    }

    public String getNomeforn() {
        return nomeforn;
    }

    public void setNomeforn(String nomeforn) {
        String oldNomeforn = this.nomeforn;
        this.nomeforn = nomeforn;
        changeSupport.firePropertyChange("nomeforn", oldNomeforn, nomeforn);
    }

    public String getCpfforn() {
        return cpfforn;
    }

    public void setCpfforn(String cpfforn) {
        String oldCpfforn = this.cpfforn;
        this.cpfforn = cpfforn;
        changeSupport.firePropertyChange("cpfforn", oldCpfforn, cpfforn);
    }

    public String getRgforn() {
        return rgforn;
    }

    public void setRgforn(String rgforn) {
        String oldRgforn = this.rgforn;
        this.rgforn = rgforn;
        changeSupport.firePropertyChange("rgforn", oldRgforn, rgforn);
    }

    public String getOrganizacaoforn() {
        return organizacaoforn;
    }

    public void setOrganizacaoforn(String organizacaoforn) {
        String oldOrganizacaoforn = this.organizacaoforn;
        this.organizacaoforn = organizacaoforn;
        changeSupport.firePropertyChange("organizacaoforn", oldOrganizacaoforn, organizacaoforn);
    }

    public String getCnpjforn() {
        return cnpjforn;
    }

    public void setCnpjforn(String cnpjforn) {
        String oldCnpjforn = this.cnpjforn;
        this.cnpjforn = cnpjforn;
        changeSupport.firePropertyChange("cnpjforn", oldCnpjforn, cnpjforn);
    }

    public Character getTipoforn() {
        return tipoforn;
    }

    public void setTipoforn(Character tipoforn) {
        Character oldTipoforn = this.tipoforn;
        this.tipoforn = tipoforn;
        changeSupport.firePropertyChange("tipoforn", oldTipoforn, tipoforn);
    }

    public String getEnderecoforn() {
        return enderecoforn;
    }

    public void setEnderecoforn(String enderecoforn) {
        String oldEnderecoforn = this.enderecoforn;
        this.enderecoforn = enderecoforn;
        changeSupport.firePropertyChange("enderecoforn", oldEnderecoforn, enderecoforn);
    }

    public String getBairroforn() {
        return bairroforn;
    }

    public void setBairroforn(String bairroforn) {
        String oldBairroforn = this.bairroforn;
        this.bairroforn = bairroforn;
        changeSupport.firePropertyChange("bairroforn", oldBairroforn, bairroforn);
    }

    public String getCidadeforn() {
        return cidadeforn;
    }

    public void setCidadeforn(String cidadeforn) {
        String oldCidadeforn = this.cidadeforn;
        this.cidadeforn = cidadeforn;
        changeSupport.firePropertyChange("cidadeforn", oldCidadeforn, cidadeforn);
    }

    public String getUfforn() {
        return ufforn;
    }

    public void setUfforn(String ufforn) {
        String oldUfforn = this.ufforn;
        this.ufforn = ufforn;
        changeSupport.firePropertyChange("ufforn", oldUfforn, ufforn);
    }

    public String getCepforn() {
        return cepforn;
    }

    public void setCepforn(String cepforn) {
        String oldCepforn = this.cepforn;
        this.cepforn = cepforn;
        changeSupport.firePropertyChange("cepforn", oldCepforn, cepforn);
    }

    public String getEmailforn() {
        return emailforn;
    }

    public void setEmailforn(String emailforn) {
        String oldEmailforn = this.emailforn;
        this.emailforn = emailforn;
        changeSupport.firePropertyChange("emailforn", oldEmailforn, emailforn);
    }

    public String getSiteforn() {
        return siteforn;
    }

    public void setSiteforn(String siteforn) {
        String oldSiteforn = this.siteforn;
        this.siteforn = siteforn;
        changeSupport.firePropertyChange("siteforn", oldSiteforn, siteforn);
    }

    public String getTelefoneforn() {
        return telefoneforn;
    }

    public void setTelefoneforn(String telefoneforn) {
        String oldTelefoneforn = this.telefoneforn;
        this.telefoneforn = telefoneforn;
        changeSupport.firePropertyChange("telefoneforn", oldTelefoneforn, telefoneforn);
    }

    public String getCelularforn() {
        return celularforn;
    }

    public void setCelularforn(String celularforn) {
        String oldCelularforn = this.celularforn;
        this.celularforn = celularforn;
        changeSupport.firePropertyChange("celularforn", oldCelularforn, celularforn);
    }

    public String getFaxforn() {
        return faxforn;
    }

    public void setFaxforn(String faxforn) {
        String oldFaxforn = this.faxforn;
        this.faxforn = faxforn;
        changeSupport.firePropertyChange("faxforn", oldFaxforn, faxforn);
    }

    public String getContatoforn() {
        return contatoforn;
    }

    public void setContatoforn(String contatoforn) {
        String oldContatoforn = this.contatoforn;
        this.contatoforn = contatoforn;
        changeSupport.firePropertyChange("contatoforn", oldContatoforn, contatoforn);
    }
    
    


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codforn != null ? codforn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codforn == null && other.codforn != null) || (this.codforn != null && !this.codforn.equals(other.codforn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Fornecedor[ codforn=" + codforn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
