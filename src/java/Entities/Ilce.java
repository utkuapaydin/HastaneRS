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
@Table(name = "defilce", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ILD_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ilce.findAll", query = "SELECT i FROM Ilce i"),
    @NamedQuery(name = "Ilce.findByIldId", query = "SELECT i FROM Ilce i WHERE i.ildId = :ildId"),
    @NamedQuery(name = "Ilce.findByILCIsmi", query = "SELECT i FROM Ilce i WHERE i.iLCIsmi = :iLCIsmi"),
    @NamedQuery(name = "Ilce.findBySId", query = "SELECT i FROM Ilce i WHERE i.sId = :sId")})
public class Ilce implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ILD_ID", nullable = false)
    private Integer ildId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ILC_Ismi", nullable = false, length = 100)
    private String iLCIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "S_ID", nullable = false)
    private int sId;

    public Ilce() {
    }

    public Ilce(Integer ildId) {
        this.ildId = ildId;
    }

    public Ilce(Integer ildId, String iLCIsmi, int sId) {
        this.ildId = ildId;
        this.iLCIsmi = iLCIsmi;
        this.sId = sId;
    }

    public Integer getIldId() {
        return ildId;
    }

    public void setIldId(Integer ildId) {
        this.ildId = ildId;
    }

    public String getILCIsmi() {
        return iLCIsmi;
    }

    public void setILCIsmi(String iLCIsmi) {
        this.iLCIsmi = iLCIsmi;
    }

    public int getSId() {
        return sId;
    }

    public void setSId(int sId) {
        this.sId = sId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ildId != null ? ildId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ilce)) {
            return false;
        }
        Ilce other = (Ilce) object;
        if ((this.ildId == null && other.ildId != null) || (this.ildId != null && !this.ildId.equals(other.ildId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Ilce[ ildId=" + ildId + " ]";
    }
    
}
