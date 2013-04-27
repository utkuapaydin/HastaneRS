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
@Table(name = "defsemptom", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Semp_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semptom.findAll", query = "SELECT s FROM Semptom s"),
    @NamedQuery(name = "Semptom.findBySempID", query = "SELECT s FROM Semptom s WHERE s.sempID = :sempID"),
    @NamedQuery(name = "Semptom.findBySempIsmi", query = "SELECT s FROM Semptom s WHERE s.sempIsmi = :sempIsmi"),
    @NamedQuery(name = "Semptom.findBySempGroup", query = "SELECT s FROM Semptom s WHERE s.sempGroup = :sempGroup")})
public class Semptom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Semp_ID", nullable = false)
    private Integer sempID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Semp_Ismi", nullable = false, length = 150)
    private String sempIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Semp_Group", nullable = false)
    private int sempGroup;

    public Semptom() {
    }

    public Semptom(Integer sempID) {
        this.sempID = sempID;
    }

    public Semptom(Integer sempID, String sempIsmi, int sempGroup) {
        this.sempID = sempID;
        this.sempIsmi = sempIsmi;
        this.sempGroup = sempGroup;
    }

    public Integer getSempID() {
        return sempID;
    }

    public void setSempID(Integer sempID) {
        this.sempID = sempID;
    }

    public String getSempIsmi() {
        return sempIsmi;
    }

    public void setSempIsmi(String sempIsmi) {
        this.sempIsmi = sempIsmi;
    }

    public int getSempGroup() {
        return sempGroup;
    }

    public void setSempGroup(int sempGroup) {
        this.sempGroup = sempGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sempID != null ? sempID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semptom)) {
            return false;
        }
        Semptom other = (Semptom) object;
        if ((this.sempID == null && other.sempID != null) || (this.sempID != null && !this.sempID.equals(other.sempID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Semptom[ sempID=" + sempID + " ]";
    }
    
}
