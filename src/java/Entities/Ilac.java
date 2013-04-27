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
@Table(name = "defilac", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"I_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ilac.findAll", query = "SELECT i FROM Ilac i"),
    @NamedQuery(name = "Ilac.findByIId", query = "SELECT i FROM Ilac i WHERE i.iId = :iId"),
    @NamedQuery(name = "Ilac.findByIIsmi", query = "SELECT i FROM Ilac i WHERE i.iIsmi = :iIsmi")})
public class Ilac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "I_ID", nullable = false)
    private Integer iId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "I_Ismi", nullable = false, length = 45)
    private String iIsmi;

    public Ilac() {
    }

    public Ilac(Integer iId) {
        this.iId = iId;
    }

    public Ilac(Integer iId, String iIsmi) {
        this.iId = iId;
        this.iIsmi = iIsmi;
    }

    public Integer getIId() {
        return iId;
    }

    public void setIId(Integer iId) {
        this.iId = iId;
    }

    public String getIIsmi() {
        return iIsmi;
    }

    public void setIIsmi(String iIsmi) {
        this.iIsmi = iIsmi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iId != null ? iId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ilac)) {
            return false;
        }
        Ilac other = (Ilac) object;
        if ((this.iId == null && other.iId != null) || (this.iId != null && !this.iId.equals(other.iId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Ilac[ iId=" + iId + " ]";
    }
    
}
