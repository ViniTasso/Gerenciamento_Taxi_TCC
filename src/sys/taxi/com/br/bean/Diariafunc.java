/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.br.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
@Table(name = "diariafunc", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Diariafunc.findAll", query = "SELECT d FROM Diariafunc d"),
    @NamedQuery(name = "Diariafunc.findByCoddiariafunc", query = "SELECT d FROM Diariafunc d WHERE d.coddiariafunc = :coddiariafunc"),
    @NamedQuery(name = "Diariafunc.findByCodfunc", query = "SELECT d FROM Diariafunc d WHERE d.codfunc = :codfunc"),
    @NamedQuery(name = "Diariafunc.findByCodveiculo", query = "SELECT d FROM Diariafunc d WHERE d.codveiculo = :codveiculo"),
    @NamedQuery(name = "Diariafunc.findByDatatrabalho", query = "SELECT d FROM Diariafunc d WHERE d.datatrabalho = :datatrabalho"),
    @NamedQuery(name = "Diariafunc.findByHorainicio", query = "SELECT d FROM Diariafunc d WHERE d.horainicio = :horainicio"),
    @NamedQuery(name = "Diariafunc.findByHoratermino", query = "SELECT d FROM Diariafunc d WHERE d.horatermino = :horatermino"),
    @NamedQuery(name = "Diariafunc.findBySituacaodiaria", query = "SELECT d FROM Diariafunc d WHERE d.situacaodiaria = :situacaodiaria"),
    @NamedQuery(name = "Diariafunc.findByLocalcorrida", query = "SELECT d FROM Diariafunc d WHERE d.localcorrida = :localcorrida"),
    @NamedQuery(name = "Diariafunc.findBySituacaocorrida", query = "SELECT d FROM Diariafunc d WHERE d.situacaocorrida = :situacaocorrida"),
    @NamedQuery(name = "Diariafunc.findBetweenDataTrabalho", query = "SELECT d FROM Diariafunc d WHERE d.datatrabalho BETWEEN :dataIni AND :dataFim"),
    @NamedQuery(name = "Diariafunc.findLocalData", query = "SELECT d FROM Diariafunc d WHERE d.datatrabalho = :dataIni AND d.localcorrida = :localatual"),
    @NamedQuery(name = "Diariafunc.findByDiariaCorrida", query = "SELECT d FROM Diariafunc d WHERE d.situacaodiaria = :situacaodiaria AND d.situacaocorrida = :situacaocorrida"),
    @NamedQuery(name = "Diariafunc.findByDiariaCorridaLocal", query = "SELECT d FROM Diariafunc d WHERE d.situacaodiaria = :situacaodiaria AND d.situacaocorrida = :situacaocorrida AND d.localcorrida = :localcorrida"),
    @NamedQuery(name = "Diariafunc.findBySoVeiculo", query = "SELECT d FROM Diariafunc d WHERE d.codveiculo.tipovei = :tipoveiculo AND d.situacaodiaria = :situacaodiaria AND d.situacaocorrida = :situacaocorrida"),
    @NamedQuery(name = "Diariafunc.findByVeiculoRegiao", query = "SELECT d FROM Diariafunc d WHERE d.codveiculo.tipovei = :tipoveiculo AND d.situacaodiaria = :situacaodiaria AND d.situacaocorrida = :situacaocorrida AND d.localcorrida = :localcorrida"),
    @NamedQuery(name = "Diariafunc.findBySituacaodiariaLocal", query = "SELECT d FROM Diariafunc d WHERE d.situacaodiaria = :situacaodiaria AND d.localcorrida = :localcorrida")
})
public class Diariafunc implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODDIARIAFUNC")
    private Integer coddiariafunc;
    @JoinColumn(name = "CODFUNC", referencedColumnName="CODFUNC")
    @ManyToOne
    private Funcionario codfunc;
    @JoinColumn(name = "CODVEICULO", referencedColumnName="CODVEICULO")
    @ManyToOne
    private Veiculo codveiculo;
    @Column(name = "DATATRABALHO")
    @Temporal(TemporalType.DATE)
    private Date datatrabalho;
    @Column(name = "HORAINICIO")
    @Temporal(TemporalType.TIME)
    private Date horainicio;
    @Column(name = "HORATERMINO")
    @Temporal(TemporalType.TIME)
    private Date horatermino;
    @Column(name = "SITUACAODIARIA")
    private Character situacaodiaria;
    @Column(name = "SITUACAOCORRIDA")
    private Character situacaocorrida;
    @OneToMany(mappedBy = "coddiariafunc")
    private List<Vistoriadiaria> vistoriadiariaList;
    @Column(name = "LOCALCORRIDA")
    private String localcorrida;

    public Diariafunc() {
    }

    public Diariafunc(Integer coddiariafunc) {
        this.coddiariafunc = coddiariafunc;
    }

    public Integer getCoddiariafunc() {
        return coddiariafunc;
    }

    public void setCoddiariafunc(Integer coddiariafunc) {
        Integer oldCoddiariafunc = this.coddiariafunc;
        this.coddiariafunc = coddiariafunc;
        changeSupport.firePropertyChange("coddiariafunc", oldCoddiariafunc, coddiariafunc);
    }

    public Funcionario getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(Funcionario codfunc) {
        Funcionario oldCodfunc = this.codfunc;
        this.codfunc = codfunc;
        changeSupport.firePropertyChange("codfunc", oldCodfunc, codfunc);
    }

    public Veiculo getCodveiculo() {
        return codveiculo;
    }

    public void setCodveiculo(Veiculo codveiculo) {
        Veiculo oldCodveiculo = this.codveiculo;
        this.codveiculo = codveiculo;
        changeSupport.firePropertyChange("codveiculo", oldCodveiculo, codveiculo);
    }

    public Date getDatatrabalho() {
        return datatrabalho;
    }

    public void setDatatrabalho(Date datatrabalho) {
        Date oldDatatrabalho = this.datatrabalho;
        this.datatrabalho = datatrabalho;
        changeSupport.firePropertyChange("datatrabalho", oldDatatrabalho, datatrabalho);
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        Date oldHorainicio = this.horainicio;
        this.horainicio = horainicio;
        changeSupport.firePropertyChange("horainicio", oldHorainicio, horainicio);
    }

    public Date getHoratermino() {
        return horatermino;
    }

    public void setHoratermino(Date horatermino) {
        Date oldHoratermino = this.horatermino;
        this.horatermino = horatermino;
        changeSupport.firePropertyChange("horatermino", oldHoratermino, horatermino);
    }

    public Character getSituacaoDiaria() {
        return situacaodiaria;
    }

    public void setSituacaoDiaria(Character situacaodiaria) {
        Character oldSituacao = this.situacaodiaria;
        this.situacaodiaria = situacaodiaria;
        changeSupport.firePropertyChange("situacaodiaria", oldSituacao, situacaodiaria);
    }

    public Character getSituacaoCorrida() {
        return situacaodiaria;
    }

    public void setSituacaoCorrida(Character situacaocorrida) {
        Character oldSituacaocorrida = this.situacaocorrida;
        this.situacaocorrida = situacaocorrida;
        changeSupport.firePropertyChange("situacaocorrida", oldSituacaocorrida, situacaocorrida);
    }
    
    public List<Vistoriadiaria> getVistoriadiariaList() {
        return vistoriadiariaList;
    }

    public void setVistoriadiariaList(List<Vistoriadiaria> vistoriadiariaList) {
        this.vistoriadiariaList = vistoriadiariaList;
    }
    
     public String getLocalcorrida() {
        return localcorrida;
    }

    public void setLocalcorrida(String localcorrida) {
        String oldLocalcorrida = this.localcorrida;
        this.localcorrida = localcorrida;
        changeSupport.firePropertyChange("localcorrida", oldLocalcorrida, localcorrida);
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddiariafunc != null ? coddiariafunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diariafunc)) {
            return false;
        }
        Diariafunc other = (Diariafunc) object;
        if ((this.coddiariafunc == null && other.coddiariafunc != null) || (this.coddiariafunc != null && !this.coddiariafunc.equals(other.coddiariafunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Diariafunc[ coddiariafunc=" + coddiariafunc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
