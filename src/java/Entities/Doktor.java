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
@Table(name = "defdoktor", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"D_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doktor.findAll", query = "SELECT d FROM Doktor d"),
    @NamedQuery(name = "Doktor.findByDId", query = "SELECT d FROM Doktor d WHERE d.dId = :dId"),
    @NamedQuery(name = "Doktor.findByDHesabi", query = "SELECT d FROM Doktor d WHERE d.dHesabi = :dHesabi"),
    @NamedQuery(name = "Doktor.findByDUnvan", query = "SELECT d FROM Doktor d WHERE d.dUnvan = :dUnvan"),
    @NamedQuery(name = "Doktor.findByHDepID", query = "SELECT d FROM Doktor d WHERE d.hDepID = :hDepID")})
public class Doktor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "D_ID", nullable = false)
    private Integer dId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "D_Hesabi", nullable = false)
    private int dHesabi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "D_Unvan", nullable = false, length = 150)
    private String dUnvan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HDep_ID", nullable = false)
    private int hDepID;

    public Doktor() {
    }

    public Doktor(Integer dId) {
        this.dId = dId;
    }

    public Doktor(Integer dId, int dHesabi, String dUnvan, int hDepID) {
        this.dId = dId;
        this.dHesabi = dHesabi;
        this.dUnvan = dUnvan;
        this.hDepID = hDepID;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public int getDHesabi() {
        return dHesabi;
    }

    public void setDHesabi(int dHesabi) {
        this.dHesabi = dHesabi;
    }

    public String getDUnvan() {
        return dUnvan;
    }

    public void setDUnvan(String dUnvan) {
        this.dUnvan = dUnvan;
    }

    public int getHDepID() {
        return hDepID;
    }

    public void setHDepID(int hDepID) {
        this.hDepID = hDepID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dId != null ? dId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doktor)) {
            return false;
        }
        Doktor other = (Doktor) object;
        if ((this.dId == null && other.dId != null) || (this.dId != null && !this.dId.equals(other.dId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Doktor[ dId=" + dId + " ]";
    }
    
}
