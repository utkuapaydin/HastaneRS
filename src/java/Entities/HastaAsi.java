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
@Table(name = "hasta_asi", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"HA_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HastaAsi.findAll", query = "SELECT h FROM HastaAsi h"),
    @NamedQuery(name = "HastaAsi.findByHaId", query = "SELECT h FROM HastaAsi h WHERE h.haId = :haId"),
    @NamedQuery(name = "HastaAsi.findByHTc", query = "SELECT h FROM HastaAsi h WHERE h.hTc = :hTc"),
    @NamedQuery(name = "HastaAsi.findByAId", query = "SELECT h FROM HastaAsi h WHERE h.aId = :aId"),
    @NamedQuery(name = "HastaAsi.findByHAZamani", query = "SELECT h FROM HastaAsi h WHERE h.hAZamani = :hAZamani")})
public class HastaAsi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HA_ID", nullable = false)
    private Integer haId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "H_TC", nullable = false, length = 11)
    private String hTc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "A_ID", nullable = false)
    private int aId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HA_Zamani", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date hAZamani;

    public HastaAsi() {
    }

    public HastaAsi(Integer haId) {
        this.haId = haId;
    }

    public HastaAsi(Integer haId, String hTc, int aId, Date hAZamani) {
        this.haId = haId;
        this.hTc = hTc;
        this.aId = aId;
        this.hAZamani = hAZamani;
    }

    public Integer getHaId() {
        return haId;
    }

    public void setHaId(Integer haId) {
        this.haId = haId;
    }

    public String getHTc() {
        return hTc;
    }

    public void setHTc(String hTc) {
        this.hTc = hTc;
    }

    public int getAId() {
        return aId;
    }

    public void setAId(int aId) {
        this.aId = aId;
    }

    public Date getHAZamani() {
        return hAZamani;
    }

    public void setHAZamani(Date hAZamani) {
        this.hAZamani = hAZamani;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (haId != null ? haId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HastaAsi)) {
            return false;
        }
        HastaAsi other = (HastaAsi) object;
        if ((this.haId == null && other.haId != null) || (this.haId != null && !this.haId.equals(other.haId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.HastaAsi[ haId=" + haId + " ]";
    }
    
}
