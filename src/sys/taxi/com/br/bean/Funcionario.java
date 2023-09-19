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
@Table(name = "funcionario", catalog = "taxi", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByCodfunc", query = "SELECT f FROM Funcionario f WHERE f.codfunc = :codfunc"),
    @NamedQuery(name = "Funcionario.findByNomefunc", query = "SELECT f FROM Funcionario f WHERE f.nomefunc = :nomefunc"),
    @NamedQuery(name = "Funcionario.findByCpffunc", query = "SELECT f FROM Funcionario f WHERE f.cpffunc = :cpffunc"),
    @NamedQuery(name = "Funcionario.findByCnhfunc", query = "SELECT f FROM Funcionario f WHERE f.cnhfunc = :cnhfunc"),
    @NamedQuery(name = "Funcionario.findByLetracnhfunc", query = "SELECT f FROM Funcionario f WHERE f.letracnhfunc = :letracnhfunc"),
    @NamedQuery(name = "Funcionario.findByCepfunc", query = "SELECT f FROM Funcionario f WHERE f.cepfunc = :cepfunc"),
    @NamedQuery(name = "Funcionario.findByUffunc", query = "SELECT f FROM Funcionario f WHERE f.uffunc = :uffunc"),
    @NamedQuery(name = "Funcionario.findByCidadefunc", query = "SELECT f FROM Funcionario f WHERE f.cidadefunc = :cidadefunc"),
    @NamedQuery(name = "Funcionario.findByBairrofunc", query = "SELECT f FROM Funcionario f WHERE f.bairrofunc = :bairrofunc"),
    @NamedQuery(name = "Funcionario.findByEnderecofunc", query = "SELECT f FROM Funcionario f WHERE f.enderecofunc = :enderecofunc"),
    @NamedQuery(name = "Funcionario.findByNumerocasafunc", query = "SELECT f FROM Funcionario f WHERE f.numerocasafunc = :numerocasafunc"),
    @NamedQuery(name = "Funcionario.findByComplementofunc", query = "SELECT f FROM Funcionario f WHERE f.complementofunc = :complementofunc"),
    @NamedQuery(name = "Funcionario.findByTelefonefunc", query = "SELECT f FROM Funcionario f WHERE f.telefonefunc = :telefonefunc"),
    @NamedQuery(name = "Funcionario.findByCelularfunc", query = "SELECT f FROM Funcionario f WHERE f.celularfunc = :celularfunc"),
    @NamedQuery(name = "Funcionario.findByEmailfunc", query = "SELECT f FROM Funcionario f WHERE f.emailfunc = :emailfunc"),
    @NamedQuery(name = "Funcionario.findByDatanasfunc", query = "SELECT f FROM Funcionario f WHERE f.datanasfunc = :datanasfunc"),
    @NamedQuery(name = "Funcionario.findByDataadmicaofunc", query = "SELECT f FROM Funcionario f WHERE f.dataadmicaofunc = :dataadmicaofunc"),
    @NamedQuery(name = "Funcionario.findByCasado", query = "SELECT f FROM Funcionario f WHERE f.casado = :casado"),
    @NamedQuery(name = "Funcionario.findByFilhos", query = "SELECT f FROM Funcionario f WHERE f.filhos = :filhos"),
    @NamedQuery(name = "Funcionario.findByPerforn", query = "SELECT f FROM Funcionario f WHERE f.perforn = :perforn"),
    @NamedQuery(name = "Funcionario.findByPercli", query = "SELECT f FROM Funcionario f WHERE f.percli = :percli"),
    @NamedQuery(name = "Funcionario.findByPervei", query = "SELECT f FROM Funcionario f WHERE f.pervei = :pervei"),
    @NamedQuery(name = "Funcionario.findByPerped", query = "SELECT f FROM Funcionario f WHERE f.perped = :perped"),
    @NamedQuery(name = "Funcionario.findByPerdia", query = "SELECT f FROM Funcionario f WHERE f.perdia = :perdia"),
    @NamedQuery(name = "Funcionario.findByPerrel", query = "SELECT f FROM Funcionario f WHERE f.perrel = :perrel"),
    @NamedQuery(name = "Funcionario.findByNumerofilhosfunc", query = "SELECT f FROM Funcionario f WHERE f.numerofilhosfunc = :numerofilhosfunc"),
    @NamedQuery(name = "Funcionario.findByCtpsfunc", query = "SELECT f FROM Funcionario f WHERE f.ctpsfunc = :ctpsfunc"),
    @NamedQuery(name = "Funcionario.findBySeriectpsfunc", query = "SELECT f FROM Funcionario f WHERE f.seriectpsfunc = :seriectpsfunc"),
    @NamedQuery(name = "Funcionario.findByFoto", query = "SELECT f FROM Funcionario f WHERE f.foto = :foto"),
    @NamedQuery(name = "Funcionario.findByUsuario", query = "SELECT f FROM Funcionario f WHERE f.usuariofunc = :usuariofunc"),
    @NamedQuery(name = "Funcionario.findBySenha", query = "SELECT f FROM Funcionario f WHERE f.senhafunc = :senhafunc"),
    @NamedQuery(name = "Funcionario.findByTipopermicao", query = "SELECT f FROM Funcionario f WHERE f.tipopermicao = :tipopermicao"),
    @NamedQuery(name = "Funcionario.findByLoginAcesso", query = "SELECT f FROM Funcionario f WHERE f.usuariofunc = :usuariofunc AND f.senhafunc = :senhafunc")})
public class Funcionario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODFUNC")
    private Integer codfunc;
    @Column(name = "NOMEFUNC")
    private String nomefunc;
    @Column(name = "CPFFUNC")
    private String cpffunc;
    @Column(name = "CNHFUNC")
    private String cnhfunc;
    @Column(name = "LETRACNHFUNC")
    private String letracnhfunc;
    @Column(name = "CEPFUNC")
    private String cepfunc;
    @Column(name = "UFFUNC")
    private String uffunc;
    @Column(name = "CIDADEFUNC")
    private String cidadefunc;
    @Column(name = "BAIRROFUNC")
    private String bairrofunc;
    @Column(name = "ENDERECOFUNC")
    private String enderecofunc;
    @Column(name = "NUMEROCASAFUNC")
    private String numerocasafunc;
    @Column(name = "COMPLEMENTOFUNC")
    private String complementofunc;
    @Column(name = "TELEFONEFUNC")
    private String telefonefunc;
    @Column(name = "CELULARFUNC")
    private String celularfunc;
    @Column(name = "EMAILFUNC")
    private String emailfunc;
    @Column(name = "DATANASFUNC")
    @Temporal(TemporalType.DATE)
    private Date datanasfunc;
    @Column(name = "DATAADMICAOFUNC")
    @Temporal(TemporalType.DATE)
    private Date dataadmicaofunc;
    @Column(name = "CASADO")
    private Character casado;
    @Column(name = "FILHOS")
    private Character filhos;
    @Column(name = "NUMEROFILHOSFUNC")
    private String numerofilhosfunc;
    @Column(name = "CTPSFUNC")
    private String ctpsfunc;
    @Column(name = "SERIECTPSFUNC")
    private String seriectpsfunc;
    @Column(name = "FOTO")
    private Character foto;
    @Column(name = "USUARIOFUNC")
    private String usuariofunc;
    @Column(name = "SENHAFUNC")
    private String senhafunc;
    @Column(name = "TIPOPERMICAO")
    private String tipopermicao;
    @Column(name = "PERFORN")
    private String perforn;
    @Column(name = "PERCLI")
    private String percli;
    @Column(name = "PERVEI")
    private String pervei;
    @Column(name = "PERPED")
    private String perped;
    @Column(name = "PERDIA")
    private String perdia;
    @Column(name = "PERREL")
    private String perrel;

    public Funcionario() {
    }

    public Funcionario(Integer codfunc) {
        this.codfunc = codfunc;
    }

    public Integer getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(Integer codfunc) {
        Integer oldCodfunc = this.codfunc;
        this.codfunc = codfunc;
        changeSupport.firePropertyChange("codfunc", oldCodfunc, codfunc);
    }

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        String oldNomefunc = this.nomefunc;
        this.nomefunc = nomefunc;
        changeSupport.firePropertyChange("nomefunc", oldNomefunc, nomefunc);
    }

    public String getCpffunc() {
        return cpffunc;
    }

    public void setCpffunc(String cpffunc) {
        String oldCpffunc = this.cpffunc;
        this.cpffunc = cpffunc;
        changeSupport.firePropertyChange("cpffunc", oldCpffunc, cpffunc);
    }

    public String getCnhfunc() {
        return cnhfunc;
    }

    public void setCnhfunc(String cnhfunc) {
        String oldCnhfunc = this.cnhfunc;
        this.cnhfunc = cnhfunc;
        changeSupport.firePropertyChange("cnhfunc", oldCnhfunc, cnhfunc);
    }

    public String getLetracnhfunc() {
        return letracnhfunc;
    }

    public void setLetracnhfunc(String letracnhfunc) {
        String oldLetracnhfunc = this.letracnhfunc;
        this.letracnhfunc = letracnhfunc;
        changeSupport.firePropertyChange("letracnhfunc", oldLetracnhfunc, letracnhfunc);
    }

    public String getCepfunc() {
        return cepfunc;
    }

    public void setCepfunc(String cepfunc) {
        String oldCepfunc = this.cepfunc;
        this.cepfunc = cepfunc;
        changeSupport.firePropertyChange("cepfunc", oldCepfunc, cepfunc);
    }

    public String getUffunc() {
        return uffunc;
    }

    public void setUffunc(String uffunc) {
        String oldUffunc = this.uffunc;
        this.uffunc = uffunc;
        changeSupport.firePropertyChange("uffunc", oldUffunc, uffunc);
    }

    public String getCidadefunc() {
        return cidadefunc;
    }

    public void setCidadefunc(String cidadefunc) {
        String oldCidadefunc = this.cidadefunc;
        this.cidadefunc = cidadefunc;
        changeSupport.firePropertyChange("cidadefunc", oldCidadefunc, cidadefunc);
    }

    public String getBairrofunc() {
        return bairrofunc;
    }

    public void setBairrofunc(String bairrofunc) {
        String oldBairrofunc = this.bairrofunc;
        this.bairrofunc = bairrofunc;
        changeSupport.firePropertyChange("bairrofunc", oldBairrofunc, bairrofunc);
    }

    public String getEnderecofunc() {
        return enderecofunc;
    }

    public void setEnderecofunc(String enderecofunc) {
        String oldEnderecofunc = this.enderecofunc;
        this.enderecofunc = enderecofunc;
        changeSupport.firePropertyChange("enderecofunc", oldEnderecofunc, enderecofunc);
    }

    public String getNumerocasafunc() {
        return numerocasafunc;
    }

    public void setNumerocasafunc(String numerocasafunc) {
        String oldNumerocasafunc = this.numerocasafunc;
        this.numerocasafunc = numerocasafunc;
        changeSupport.firePropertyChange("numerocasafunc", oldNumerocasafunc, numerocasafunc);
    }

    public String getComplementofunc() {
        return complementofunc;
    }

    public void setComplementofunc(String complementofunc) {
        String oldComplementofunc = this.complementofunc;
        this.complementofunc = complementofunc;
        changeSupport.firePropertyChange("complementofunc", oldComplementofunc, complementofunc);
    }

    public String getTelefonefunc() {
        return telefonefunc;
    }

    public void setTelefonefunc(String telefonefunc) {
        String oldTelefonefunc = this.telefonefunc;
        this.telefonefunc = telefonefunc;
        changeSupport.firePropertyChange("telefonefunc", oldTelefonefunc, telefonefunc);
    }

    public String getCelularfunc() {
        return celularfunc;
    }

    public void setCelularfunc(String celularfunc) {
        String oldCelularfunc = this.celularfunc;
        this.celularfunc = celularfunc;
        changeSupport.firePropertyChange("celularfunc", oldCelularfunc, celularfunc);
    }

    public String getEmailfunc() {
        return emailfunc;
    }

    public void setEmailfunc(String emailfunc) {
        String oldEmailfunc = this.emailfunc;
        this.emailfunc = emailfunc;
        changeSupport.firePropertyChange("emailfunc", oldEmailfunc, emailfunc);
    }

    public Date getDatanasfunc() {
        return datanasfunc;
    }

    public void setDatanasfunc(Date datanasfunc) {
        Date oldDatanasfunc = this.datanasfunc;
        this.datanasfunc = datanasfunc;
        changeSupport.firePropertyChange("datanasfunc", oldDatanasfunc, datanasfunc);
    }

    public Date getDataadmicaofunc() {
        return dataadmicaofunc;
    }

    public void setDataadmicaofunc(Date dataadmicaofunc) {
        Date oldDataadmicaofunc = this.dataadmicaofunc;
        this.dataadmicaofunc = dataadmicaofunc;
        changeSupport.firePropertyChange("dataadmicaofunc", oldDataadmicaofunc, dataadmicaofunc);
    }

    public Character getCasado() {
        return casado;
    }

    public void setCasado(Character casado) {
        Character oldCasado = this.casado;
        this.casado = casado;
        changeSupport.firePropertyChange("casado", oldCasado, casado);
    }

    public Character getFilhos() {
        return filhos;
    }

    public void setFilhos(Character filhos) {
        Character oldFilhos = this.filhos;
        this.filhos = filhos;
        changeSupport.firePropertyChange("filhos", oldFilhos, filhos);
    }

    public String getNumerofilhosfunc() {
        return numerofilhosfunc;
    }

    public void setNumerofilhosfunc(String numerofilhosfunc) {
        String oldNumerofilhosfunc = this.numerofilhosfunc;
        this.numerofilhosfunc = numerofilhosfunc;
        changeSupport.firePropertyChange("numerofilhosfunc", oldNumerofilhosfunc, numerofilhosfunc);
    }

    public String getCtpsfunc() {
        return ctpsfunc;
    }

    public void setCtpsfunc(String ctpsfunc) {
        String oldCtpsfunc = this.ctpsfunc;
        this.ctpsfunc = ctpsfunc;
        changeSupport.firePropertyChange("ctpsfunc", oldCtpsfunc, ctpsfunc);
    }

    public String getSeriectpsfunc() {
        return seriectpsfunc;
    }

    public void setSeriectpsfunc(String seriectpsfunc) {
        String oldSeriectpsfunc = this.seriectpsfunc;
        this.seriectpsfunc = seriectpsfunc;
        changeSupport.firePropertyChange("seriectpsfunc", oldSeriectpsfunc, seriectpsfunc);
    }

    public Character getFoto() {
        return foto;
    }

    public void setFoto(Character foto) {
        Character oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }
    
    public String getUsuario() {
        return usuariofunc;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuariofunc;
        this.usuariofunc = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getSenha() {
        return senhafunc;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senhafunc;
        this.senhafunc = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }
    
        public String getPermicao() {
        return tipopermicao;
    }

    public void setPermicao(String tipopermicao) {
        String oldTipopermicao = this.tipopermicao;
        this.tipopermicao = tipopermicao;
        changeSupport.firePropertyChange("tipopermicao", oldTipopermicao, tipopermicao);
    }
    

    public String getPerforn() {
        return perforn;
    }

    public void setPerforn(String perforn) {
        String oldPerforn = this.perforn;
        this.perforn = perforn;
        changeSupport.firePropertyChange("perforn", oldPerforn, perforn);
    }

    public String getPercli() {
        return percli;
    }

    public void setPercli(String percli) {
        String oldPercli = this.percli;
        this.percli = percli;
        changeSupport.firePropertyChange("percli", oldPercli, percli);
    }

    public String getPervei() {
        return pervei;
    }

    public void setPervei(String pervei) {
        String oldPervei = this.pervei;
        this.pervei = pervei;
        changeSupport.firePropertyChange("pervei", oldPervei, pervei);
    }

    public String getPerped() {
        return perped;
    }

    public void setPerped(String perped) {
        String oldPerped = this.perped;
        this.perped = perped;
        changeSupport.firePropertyChange("perped", oldPerped, perped);
    }

    public String getPerdia() {
        return perdia;
    }

    public void setPerdia(String perdia) {
        String oldPerdia = this.perdia;
        this.perdia = perdia;
        changeSupport.firePropertyChange("perdia", oldPerdia, perdia);
    }

    public String getPerrel() {
        return perrel;
    }

    public void setPerrel(String perrel) {
        String oldPerrel = this.perrel;
        this.perrel = perrel;
        changeSupport.firePropertyChange("perrel", oldPerrel, perrel);
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codfunc != null ? codfunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.codfunc == null && other.codfunc != null) || (this.codfunc != null && !this.codfunc.equals(other.codfunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sys.taxi.com.br.view.Funcionario[ codfunc=" + codfunc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
