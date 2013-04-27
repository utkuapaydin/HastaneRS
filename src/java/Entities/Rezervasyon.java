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
@Table(catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"R_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rezervasyon.findAll", query = "SELECT r FROM Rezervasyon r"),
    @NamedQuery(name = "Rezervasyon.findByRId", query = "SELECT r FROM Rezervasyon r WHERE r.rId = :rId"),
    @NamedQuery(name = "Rezervasyon.findByDId", query = "SELECT r FROM Rezervasyon r WHERE r.dId = :dId"),
    @NamedQuery(name = "Rezervasyon.findByHTc", query = "SELECT r FROM Rezervasyon r WHERE r.hTc = :hTc"),
    @NamedQuery(name = "Rezervasyon.findByRNo", query = "SELECT r FROM Rezervasyon r WHERE r.rNo = :rNo"),
    @NamedQuery(name = "Rezervasyon.findByROlasiHastalik", query = "SELECT r FROM Rezervasyon r WHERE r.rOlasiHastalik = :rOlasiHastalik"),
    @NamedQuery(name = "Rezervasyon.findByROlusturmaZamani", query = "SELECT r FROM Rezervasyon r WHERE r.rOlusturmaZamani = :rOlusturmaZamani")})
public class Rezervasyon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "R_ID", nullable = false)
    private Integer rId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "D_ID", nullable = false)
    private int dId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "H_TC", nullable = false, length = 11)
    private String hTc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "R_No", nullable = false)
    private int rNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "R_OlasiHastalik", nullable = false)
    private int rOlasiHastalik;
    @Basic(optional = false)
    @NotNull
    @Column(name = "R_OlusturmaZamani", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date rOlusturmaZamani;

    public Rezervasyon() {
    }

    public Rezervasyon(Integer rId) {
        this.rId = rId;
    }

    public Rezervasyon(Integer rId, int dId, String hTc, int rNo, int rOlasiHastalik, Date rOlusturmaZamani) {
        this.rId = rId;
        this.dId = dId;
        this.hTc = hTc;
        this.rNo = rNo;
        this.rOlasiHastalik = rOlasiHastalik;
        this.rOlusturmaZamani = rOlusturmaZamani;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public int getDId() {
        return dId;
    }

    public void setDId(int dId) {
        this.dId = dId;
    }

    public String getHTc() {
        return hTc;
    }

    public void setHTc(String hTc) {
        this.hTc = hTc;
    }

    public int getRNo() {
        return rNo;
    }

    public void setRNo(int rNo) {
        this.rNo = rNo;
    }

    public int getROlasiHastalik() {
        return rOlasiHastalik;
    }

    public void setROlasiHastalik(int rOlasiHastalik) {
        this.rOlasiHastalik = rOlasiHastalik;
    }

    public Date getROlusturmaZamani() {
        return rOlusturmaZamani;
    }

    public void setROlusturmaZamani(Date rOlusturmaZamani) {
        this.rOlusturmaZamani = rOlusturmaZamani;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rId != null ? rId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rezervasyon)) {
            return false;
        }
        Rezervasyon other = (Rezervasyon) object;
        if ((this.rId == null && other.rId != null) || (this.rId != null && !this.rId.equals(other.rId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Rezervasyon[ rId=" + rId + " ]";
    }
    
}
