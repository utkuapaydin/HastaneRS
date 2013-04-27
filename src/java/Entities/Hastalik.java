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
@Table(name = "defhastalik", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Has_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hastalik.findAll", query = "SELECT h FROM Hastalik h"),
    @NamedQuery(name = "Hastalik.findByHasID", query = "SELECT h FROM Hastalik h WHERE h.hasID = :hasID"),
    @NamedQuery(name = "Hastalik.findByHasIsmi", query = "SELECT h FROM Hastalik h WHERE h.hasIsmi = :hasIsmi"),
    @NamedQuery(name = "Hastalik.findByHasOncelik", query = "SELECT h FROM Hastalik h WHERE h.hasOncelik = :hasOncelik")})
public class Hastalik implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Has_ID", nullable = false)
    private Integer hasID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Has_Ismi", nullable = false, length = 150)
    private String hasIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Has_Oncelik", nullable = false)
    private int hasOncelik;

    public Hastalik() {
    }

    public Hastalik(Integer hasID) {
        this.hasID = hasID;
    }

    public Hastalik(Integer hasID, String hasIsmi, int hasOncelik) {
        this.hasID = hasID;
        this.hasIsmi = hasIsmi;
        this.hasOncelik = hasOncelik;
    }

    public Integer getHasID() {
        return hasID;
    }

    public void setHasID(Integer hasID) {
        this.hasID = hasID;
    }

    public String getHasIsmi() {
        return hasIsmi;
    }

    public void setHasIsmi(String hasIsmi) {
        this.hasIsmi = hasIsmi;
    }

    public int getHasOncelik() {
        return hasOncelik;
    }

    public void setHasOncelik(int hasOncelik) {
        this.hasOncelik = hasOncelik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hasID != null ? hasID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hastalik)) {
            return false;
        }
        Hastalik other = (Hastalik) object;
        if ((this.hasID == null && other.hasID != null) || (this.hasID != null && !this.hasID.equals(other.hasID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Hastalik[ hasID=" + hasID + " ]";
    }
    
}
