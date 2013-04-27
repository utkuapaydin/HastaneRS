/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Utku
 */
@Entity
@Table(name = "hastane_departman", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"HDep_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HastaneDepartman.findAll", query = "SELECT h FROM HastaneDepartman h"),
    @NamedQuery(name = "HastaneDepartman.findByHDepID", query = "SELECT h FROM HastaneDepartman h WHERE h.hDepID = :hDepID"),
    @NamedQuery(name = "HastaneDepartman.findByHasId", query = "SELECT h FROM HastaneDepartman h WHERE h.hasId = :hasId"),
    @NamedQuery(name = "HastaneDepartman.findByDepID", query = "SELECT h FROM HastaneDepartman h WHERE h.depID = :depID"),
    @NamedQuery(name = "HastaneDepartman.findByHDepOlusturan", query = "SELECT h FROM HastaneDepartman h WHERE h.hDepOlusturan = :hDepOlusturan"),
    @NamedQuery(name = "HastaneDepartman.findByHDepOlusZamani", query = "SELECT h FROM HastaneDepartman h WHERE h.hDepOlusZamani = :hDepOlusZamani")})
public class HastaneDepartman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HDep_ID", nullable = false)
    private Integer hDepID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HAS_ID", nullable = false)
    private int hasId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dep_ID", nullable = false)
    private int depID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "HDep_Olusturan", nullable = false, length = 11)
    private String hDepOlusturan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HDep_OlusZamani", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date hDepOlusZamani;

    public HastaneDepartman() {
    }

    public HastaneDepartman(Integer hDepID) {
        this.hDepID = hDepID;
    }

    public HastaneDepartman(Integer hDepID, int hasId, int depID, String hDepOlusturan, Date hDepOlusZamani) {
        this.hDepID = hDepID;
        this.hasId = hasId;
        this.depID = depID;
        this.hDepOlusturan = hDepOlusturan;
        this.hDepOlusZamani = hDepOlusZamani;
    }

    public Integer getHDepID() {
        return hDepID;
    }

    public void setHDepID(Integer hDepID) {
        this.hDepID = hDepID;
    }

    public int getHasId() {
        return hasId;
    }

    public void setHasId(int hasId) {
        this.hasId = hasId;
    }

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }

    public String getHDepOlusturan() {
        return hDepOlusturan;
    }

    public void setHDepOlusturan(String hDepOlusturan) {
        this.hDepOlusturan = hDepOlusturan;
    }

    public Date getHDepOlusZamani() {
        return hDepOlusZamani;
    }

    public void setHDepOlusZamani(Date hDepOlusZamani) {
        this.hDepOlusZamani = hDepOlusZamani;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hDepID != null ? hDepID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HastaneDepartman)) {
            return false;
        }
        HastaneDepartman other = (HastaneDepartman) object;
        if ((this.hDepID == null && other.hDepID != null) || (this.hDepID != null && !this.hDepID.equals(other.hDepID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.HastaneDepartman[ hDepID=" + hDepID + " ]";
    }
    
}
