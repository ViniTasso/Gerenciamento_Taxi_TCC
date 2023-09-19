/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.br.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author VGCT
 */
@Entity
@Table(name = "veiculo", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findByCodveiculo", query = "SELECT v FROM Veiculo v WHERE v.codveiculo = :codveiculo"),
    @NamedQuery(name = "Veiculo.findByCodforn", query = "SELECT v FROM Veiculo v WHERE v.codforn = :codforn"),
    @NamedQuery(name = "Veiculo.findByPlacavei", query = "SELECT v FROM Veiculo v WHERE v.placavei = :placavei"),
    @NamedQuery(name = "Veiculo.findByMarcavei", query = "SELECT v FROM Veiculo v WHERE v.marcavei = :marcavei"),
    @NamedQuery(name = "Veiculo.findByNomevei", query = "SELECT v FROM Veiculo v WHERE v.nomevei = :nomevei"),
    @NamedQuery(name = "Veiculo.findByTipovei", query = "SELECT v FROM Veiculo v WHERE v.tipovei = :tipovei"),
    @NamedQuery(name = "Veiculo.findByCorvei", query = "SELECT v FROM Veiculo v WHERE v.corvei = :corvei"),
    @NamedQuery(name = "Veiculo.findByDataaquisicaovei", query = "SELECT v FROM Veiculo v WHERE v.dataaquisicaovei = :dataaquisicaovei"),
    @NamedQuery(name = "Veiculo.findByLicensiamento", query = "SELECT v FROM Veiculo v WHERE v.licensiamento = :licensiamento"),
    @NamedQuery(name = "Veiculo.findByDatavencimentogarantia", query = "SELECT v FROM Veiculo v WHERE v.datavencimentogarantia = :datavencimentogarantia"),
    @NamedQuery(name = "Veiculo.findByPrecoipva", query = "SELECT v FROM Veiculo v WHERE v.precoipva = :precoipva")})
public class Veiculo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODVEICULO")
    private Integer codveiculo;
    @JoinColumn(name = "CODFORN",referencedColumnName="CODFORN")
    @ManyToOne
    private Fornecedor codforn;
    @Column(name = "PLACAVEI")
    private String placavei;
    @Column(name = "MARCAVEI")
    private String marcavei;
    @Column(name = "NOMEVEI")
    private String nomevei;
    @Column(name = "TIPOVEI")
    private Character tipovei;
    @Column(name = "CORVEI")
    private String corvei;
    @Column(name = "DATAAQUISICAOVEI")
    @Temporal(TemporalType.DATE)
    private Date dataaquisicaovei;
    @Column(name = "LICENSIAMENTO")
    private String licensiamento;
    @Column(name = "DATAVENCIMENTOGARANTIA")
    @Temporal(TemporalType.DATE)
    private Date datavencimentogarantia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECOIPVA")
    private Double precoipva;

    public Veiculo() {
    }

    public Veiculo(Integer codveiculo) {
        this.codveiculo = codveiculo;
    }

    public Integer getCodveiculo() {
        return codveiculo;
    }

    public void setCodveiculo(Integer codveiculo) {
        Integer oldCodveiculo = this.codveiculo;
        this.codveiculo = codveiculo;
        changeSupport.firePropertyChange("codveiculo", oldCodveiculo, codveiculo);
    }

    public Fornecedor getCodforn() {
        return codforn;
    }

    public void setCodforn(Fornecedor codforn) {
        Fornecedor oldCodforn = this.codforn;
        this.codforn = codforn;
        changeSupport.firePropertyChange("codforn", oldCodforn, codforn);
    }

    public String getPlacavei() {
        return placavei;
    }

    public void setPlacavei(String placavei) {
        String oldPlacavei = this.placavei;
        this.placavei = placavei;
        changeSupport.firePropertyChange("placavei", oldPlacavei, placavei);
    }

    public String getMarcavei() {
        return marcavei;
    }

    public void setMarcavei(String marcavei) {
        String oldMarcavei = this.marcavei;
        this.marcavei = marcavei;
        changeSupport.firePropertyChange("marcavei", oldMarcavei, marcavei);
    }

    public String getNomevei() {
        return nomevei;
    }

    public void setNomevei(String nomevei) {
        String oldNomevei = this.nomevei;
        this.nomevei = nomevei;
        changeSupport.firePropertyChange("nomevei", oldNomevei, nomevei);
    }

    public Character getTipovei() {
        return tipovei;
    }

    public void setTipovei(Character tipovei) {
        Character oldTipovei = this.tipovei;
        this.tipovei = tipovei;
        changeSupport.firePropertyChange("tipovei", oldTipovei, tipovei);
    }

    public String getCorvei() {
        return corvei;
    }

    public void setCorvei(String corvei) {
        String oldCorvei = this.corvei;
        this.corvei = corvei;
        changeSupport.firePropertyChange("corvei", oldCorvei, corvei);
    }

    public Date getDataaquisicaovei() {
        return dataaquisicaovei;
    }

    public void setDataaquisicaovei(Date dataaquisicaovei) {
        Date oldDataaquisicaovei = this.dataaquisicaovei;
        this.dataaquisicaovei = dataaquisicaovei;
        changeSupport.firePropertyChange("dataaquisicaovei", oldDataaquisicaovei, dataaquisicaovei);
    }

    public String getLicensiamento() {
        return licensiamento;
    }

    public void setLicensiamento(String licensiamento) {
        String oldLicensiamento = this.licensiamento;
        this.licensiamento = licensiamento;
        changeSupport.firePropertyChange("licensiamento", oldLicensiamento, licensiamento);
    }

    public Date getDatavencimentogarantia() {
        return datavencimentogarantia;
    }

    public void setDatavencimentogarantia(Date datavencimentogarantia) {
        Date oldDatavencimentogarantia = this.datavencimentogarantia;
        this.datavencimentogarantia = datavencimentogarantia;
        changeSupport.firePropertyChange("datavencimentogarantia", oldDatavencimentogarantia, datavencimentogarantia);
    }

    public Double getPrecoipva() {
        return precoipva;
    }

    public void setPrecoipva(Double precoipva) {
        Double oldPrecoipva = this.precoipva;
        this.precoipva = precoipva;
        changeSupport.firePropertyChange("precoipva", oldPrecoipva, precoipva);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codveiculo != null ? codveiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.codveiculo == null && other.codveiculo != null) || (this.codveiculo != null && !this.codveiculo.equals(other.codveiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Veiculo[ codveiculo=" + codveiculo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
