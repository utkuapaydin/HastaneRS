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
@Table(name = "defasi", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"A_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asi.findAll", query = "SELECT a FROM Asi a"),
    @NamedQuery(name = "Asi.findByAId", query = "SELECT a FROM Asi a WHERE a.aId = :aId"),
    @NamedQuery(name = "Asi.findByAIsmi", query = "SELECT a FROM Asi a WHERE a.aIsmi = :aIsmi")})
public class Asi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "A_ID", nullable = false)
    private Integer aId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "A_Ismi", nullable = false, length = 60)
    private String aIsmi;

    public Asi() {
    }

    public Asi(Integer aId) {
        this.aId = aId;
    }

    public Asi(Integer aId, String aIsmi) {
        this.aId = aId;
        this.aIsmi = aIsmi;
    }

    public Integer getAId() {
        return aId;
    }

    public void setAId(Integer aId) {
        this.aId = aId;
    }

    public String getAIsmi() {
        return aIsmi;
    }

    public void setAIsmi(String aIsmi) {
        this.aIsmi = aIsmi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aId != null ? aId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asi)) {
            return false;
        }
        Asi other = (Asi) object;
        if ((this.aId == null && other.aId != null) || (this.aId != null && !this.aId.equals(other.aId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Asi[ aId=" + aId + " ]";
    }
    
}
