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
@Table(name = "pedidostaxi", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pedidostaxi.findAll", query = "SELECT p FROM Pedidostaxi p"),
    @NamedQuery(name = "Pedidostaxi.findByCodpedido", query = "SELECT p FROM Pedidostaxi p WHERE p.codpedido = :codpedido"),
    @NamedQuery(name = "Pedidostaxi.findByCodfunc", query = "SELECT p FROM Pedidostaxi p WHERE p.coddiariafunc.codfunc.codfunc = :codfunc"),
    @NamedQuery(name = "Pedidostaxi.findByCoddiariafunc", query = "SELECT p FROM Pedidostaxi p WHERE p.coddiariafunc = :coddiariafunc"),
    @NamedQuery(name = "Pedidostaxi.findByCodcliente", query = "SELECT p FROM Pedidostaxi p WHERE p.codcliente = :codcliente"),
    @NamedQuery(name = "Pedidostaxi.findByReferencia", query = "SELECT p FROM Pedidostaxi p WHERE p.referencia = :referencia"),
    @NamedQuery(name = "Pedidostaxi.findByEnderecoatual", query = "SELECT p FROM Pedidostaxi p WHERE p.enderecoatual = :enderecoatual"),
    @NamedQuery(name = "Pedidostaxi.findByCidadeatual", query = "SELECT p FROM Pedidostaxi p WHERE p.cidadeatual = :cidadeatual"),
    @NamedQuery(name = "Pedidostaxi.findByBairroatual", query = "SELECT p FROM Pedidostaxi p WHERE p.bairroatual = :bairroatual"),
    @NamedQuery(name = "Pedidostaxi.findByCidadedestino", query = "SELECT p FROM Pedidostaxi p WHERE p.cidadedestino = :cidadedestino"),
    @NamedQuery(name = "Pedidostaxi.findByEnderecodestino", query = "SELECT p FROM Pedidostaxi p WHERE p.enderecodestino = :enderecodestino"),
    @NamedQuery(name = "Pedidostaxi.findByNumerocasadestino", query = "SELECT p FROM Pedidostaxi p WHERE p.numerocasadestino = :numerocasadestino"),
    @NamedQuery(name = "Pedidostaxi.findByBairrodestino", query = "SELECT p FROM Pedidostaxi p WHERE p.bairrodestino = :bairrodestino"),
    @NamedQuery(name = "Pedidostaxi.findByDatapedido", query = "SELECT p FROM Pedidostaxi p WHERE p.datapedido = :datapedido"),
    @NamedQuery(name = "Pedidostaxi.findByHorafinalizacao", query = "SELECT p FROM Pedidostaxi p WHERE p.horafinalizacao = :horafinalizacao"),
    @NamedQuery(name = "Pedidostaxi.findByHorapedido", query = "SELECT p FROM Pedidostaxi p WHERE p.horapedido = :horapedido"),
    @NamedQuery(name = "Pedidostaxi.findByDistanciacorrida", query = "SELECT p FROM Pedidostaxi p WHERE p.distanciacorrida = :distanciacorrida"),
    @NamedQuery(name = "Pedidostaxi.findByPrecocorrida", query = "SELECT p FROM Pedidostaxi p WHERE p.precocorrida = :precocorrida"),
    @NamedQuery(name = "Pedidostaxi.findBySituacao", query = "SELECT p FROM Pedidostaxi p WHERE p.situacao = :situacao"),
    @NamedQuery(name = "Pedidostaxi.findBetweendatapedido", query = "SELECT p FROM Pedidostaxi p WHERE p.datapedido BETWEEN :dataini AND :datafim"),
    @NamedQuery(name = "Pedidostaxi.findLucrosData", query = "SELECT p FROM Pedidostaxi p WHERE p.precocorrida > 0 AND p.datapedido BETWEEN :dataini AND :datafim")
})
public class Pedidostaxi implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODPEDIDO")
    private Integer codpedido;
    @JoinColumn(name = "CODDIARIAFUNC",referencedColumnName="CODDIARIAFUNC")
    @ManyToOne
    private Diariafunc coddiariafunc;
    @JoinColumn(name = "CODCLIENTE",referencedColumnName="CODCLIENTE")
    @ManyToOne
    private Cliente codcliente;
    @Column(name = "REFERENCIA")
    private String referencia;
    @Column(name = "ENDERECOATUAL")
    private String enderecoatual;
    @Column(name = "CIDADEATUAL")
    private String cidadeatual;
    @Column(name = "BAIRROATUAL")
    private String bairroatual;
    @Column(name = "CIDADEDESTINO")
    private String cidadedestino;
    @Column(name = "ENDERECODESTINO")
    private String enderecodestino;
    @Column(name = "NUMEROCASADESTINO")
    private String numerocasadestino;
    @Column(name = "BAIRRODESTINO")
    private String bairrodestino;
    @Column(name = "DATAPEDIDO")
    @Temporal(TemporalType.DATE)
    private Date datapedido;
    @Column(name = "HORAFINALIZACAO")
    @Temporal(TemporalType.TIME)
    private Date horafinalizacao;
    @Column(name = "HORAPEDIDO")
    @Temporal(TemporalType.TIME)
    private Date horapedido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DISTANCIACORRIDA")
    private Double distanciacorrida;
    @Column(name = "PRECOCORRIDA")
    private Double precocorrida;
    @Column(name = "SITUACAO")
    private Character situacao;
    

    public Pedidostaxi() {
    }

    public Pedidostaxi(Integer codpedido) {
        this.codpedido = codpedido;
    }

    public Integer getCodpedido() {
        return codpedido;
    }

    public void setCodpedido(Integer codpedido) {
        Integer oldCodpedido = this.codpedido;
        this.codpedido = codpedido;
        changeSupport.firePropertyChange("codpedido", oldCodpedido, codpedido);
    }

    public Diariafunc getCoddiariafunc() {
        return coddiariafunc;
    }

    public void setCoddiariafunc(Diariafunc coddiariafunc) {
        Diariafunc oldCoddiariafunc = this.coddiariafunc;
        this.coddiariafunc = coddiariafunc;
        changeSupport.firePropertyChange("coddiariafunc", oldCoddiariafunc, coddiariafunc);
    }

    public Cliente getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Cliente codcliente) {
        Cliente oldCodcliente = this.codcliente;
        this.codcliente = codcliente;
        changeSupport.firePropertyChange("codcliente", oldCodcliente, codcliente);
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        String oldReferencia = this.referencia;
        this.referencia = referencia;
        changeSupport.firePropertyChange("referencia", oldReferencia, referencia);
    }

    public String getEnderecoatual() {
        return enderecoatual;
    }

    public void setEnderecoatual(String enderecoatual) {
        String oldEnderecoatual = this.enderecoatual;
        this.enderecoatual = enderecoatual;
        changeSupport.firePropertyChange("enderecoatual", oldEnderecoatual, enderecoatual);
    }

    public String getCidadeatual() {
        return cidadeatual;
    }

    public void setCidadeatual(String cidadeatual) {
        String oldCidadeatual = this.cidadeatual;
        this.cidadeatual = cidadeatual;
        changeSupport.firePropertyChange("cidadeatual", oldCidadeatual, cidadeatual);
    }

    public String getBairroatual() {
        return bairroatual;
    }

    public void setBairroatual(String bairroatual) {
        String oldBairroatual = this.bairroatual;
        this.bairroatual = bairroatual;
        changeSupport.firePropertyChange("bairroatual", oldBairroatual, bairroatual);
    }

    public String getCidadedestino() {
        return cidadedestino;
    }

    public void setCidadedestino(String cidadedestino) {
        String oldCidadedestino = this.cidadedestino;
        this.cidadedestino = cidadedestino;
        changeSupport.firePropertyChange("cidadedestino", oldCidadedestino, cidadedestino);
    }

    public String getEnderecodestino() {
        return enderecodestino;
    }

    public void setEnderecodestino(String enderecodestino) {
        String oldEnderecodestino = this.enderecodestino;
        this.enderecodestino = enderecodestino;
        changeSupport.firePropertyChange("enderecodestino", oldEnderecodestino, enderecodestino);
    }

    public String getNumerocasadestino() {
        return numerocasadestino;
    }

    public void setNumerocasadestino(String numerocasadestino) {
        String oldNumerocasadestino = this.numerocasadestino;
        this.numerocasadestino = numerocasadestino;
        changeSupport.firePropertyChange("numerocasadestino", oldNumerocasadestino, numerocasadestino);
    }

    public String getBairrodestino() {
        return bairrodestino;
    }

    public void setBairrodestino(String bairrodestino) {
        String oldBairrodestino = this.bairrodestino;
        this.bairrodestino = bairrodestino;
        changeSupport.firePropertyChange("bairrodestino", oldBairrodestino, bairrodestino);
    }

    public Date getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(Date datapedido) {
        Date oldDatapedido = this.datapedido;
        this.datapedido = datapedido;
        changeSupport.firePropertyChange("datapedido", oldDatapedido, datapedido);
    }

    public Date getHorafinalizacao() {
        return horafinalizacao;
    }

    public void setHorafinalizacao(Date horafinalizacao) {
        Date oldHorafinalizacao = this.horafinalizacao;
        this.horafinalizacao = horafinalizacao;
        changeSupport.firePropertyChange("horafinalizacao", oldHorafinalizacao, horafinalizacao);
    }

    public Date getHorapedido() {
        return horapedido;
    }

    public void setHorapedido(Date horapedido) {
        Date oldHorapedido = this.horapedido;
        this.horapedido = horapedido;
        changeSupport.firePropertyChange("horapedido", oldHorapedido, horapedido);
    }

    public Double getDistanciacorrida() {
        return distanciacorrida;
    }

    public void setDistanciacorrida(Double distanciacorrida) {
        Double oldDistanciacorrida = this.distanciacorrida;
        this.distanciacorrida = distanciacorrida;
        changeSupport.firePropertyChange("distanciacorrida", oldDistanciacorrida, distanciacorrida);
    }

    public Double getPrecocorrida() {
        return precocorrida;
    }

    public void setPrecocorrida(Double precocorrida) {
        Double oldPrecocorrida = this.precocorrida;
        this.precocorrida = precocorrida;
        changeSupport.firePropertyChange("precocorrida", oldPrecocorrida, precocorrida);
    }
    
     public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        Character oldSituacao = this.situacao;
        this.situacao = situacao;
        changeSupport.firePropertyChange("situacao", oldSituacao, situacao);
    }

        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpedido != null ? codpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidostaxi)) {
            return false;
        }
        Pedidostaxi other = (Pedidostaxi) object;
        if ((this.codpedido == null && other.codpedido != null) || (this.codpedido != null && !this.codpedido.equals(other.codpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Pedidostaxi[ codpedido=" + codpedido + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
