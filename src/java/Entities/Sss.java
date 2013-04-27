/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Utku
 */
@Entity
@Table(name = "defsss", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SSS_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sss.findAll", query = "SELECT s FROM Sss s"),
    @NamedQuery(name = "Sss.findBySssId", query = "SELECT s FROM Sss s WHERE s.sssId = :sssId"),
    @NamedQuery(name = "Sss.findBySSSSoru", query = "SELECT s FROM Sss s WHERE s.sSSSoru = :sSSSoru"),
    @NamedQuery(name = "Sss.findBySSSCevap", query = "SELECT s FROM Sss s WHERE s.sSSCevap = :sSSCevap")})
public class Sss implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SSS_ID", nullable = false)
    private Integer sssId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "SSS_Soru", nullable = false, length = 1000)
    private String sSSSoru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "SSS_Cevap", nullable = false, length = 1000)
    private String sSSCevap;

    public Sss() {
    }

    public Sss(Integer sssId) {
        this.sssId = sssId;
    }

    public Sss(Integer sssId, String sSSSoru, String sSSCevap) {
        this.sssId = sssId;
        this.sSSSoru = sSSSoru;
        this.sSSCevap = sSSCevap;
    }

    public Integer getSssId() {
        return sssId;
    }

    public void setSssId(Integer sssId) {
        this.sssId = sssId;
    }

    public String getSSSSoru() {
        return sSSSoru;
    }

    public void setSSSSoru(String sSSSoru) {
        this.sSSSoru = sSSSoru;
    }

    public String getSSSCevap() {
        return sSSCevap;
    }

    public void setSSSCevap(String sSSCevap) {
        this.sSSCevap = sSSCevap;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sssId != null ? sssId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sss)) {
            return false;
        }
        Sss other = (Sss) object;
        if ((this.sssId == null && other.sssId != null) || (this.sssId != null && !this.sssId.equals(other.sssId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Sss[ sssId=" + sssId + " ]";
    }
    
}
