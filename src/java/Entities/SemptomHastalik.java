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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Utku
 */
@Entity
@Table(name = "semptom_hastalik", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SH_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SemptomHastalik.findAll", query = "SELECT s FROM SemptomHastalik s"),
    @NamedQuery(name = "SemptomHastalik.findByShId", query = "SELECT s FROM SemptomHastalik s WHERE s.shId = :shId"),
    @NamedQuery(name = "SemptomHastalik.findByHasID", query = "SELECT s FROM SemptomHastalik s WHERE s.hasID = :hasID"),
    @NamedQuery(name = "SemptomHastalik.findBySempID", query = "SELECT s FROM SemptomHastalik s WHERE s.sempID = :sempID")})
public class SemptomHastalik implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SH_ID", nullable = false)
    private Integer shId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Has_ID", nullable = false)
    private int hasID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Semp_ID", nullable = false)
    private int sempID;

    public SemptomHastalik() {
    }

    public SemptomHastalik(Integer shId) {
        this.shId = shId;
    }

    public SemptomHastalik(Integer shId, int hasID, int sempID) {
        this.shId = shId;
        this.hasID = hasID;
        this.sempID = sempID;
    }

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public int getHasID() {
        return hasID;
    }

    public void setHasID(int hasID) {
        this.hasID = hasID;
    }

    public int getSempID() {
        return sempID;
    }

    public void setSempID(int sempID) {
        this.sempID = sempID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shId != null ? shId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SemptomHastalik)) {
            return false;
        }
        SemptomHastalik other = (SemptomHastalik) object;
        if ((this.shId == null && other.shId != null) || (this.shId != null && !this.shId.equals(other.shId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.SemptomHastalik[ shId=" + shId + " ]";
    }
    
}
