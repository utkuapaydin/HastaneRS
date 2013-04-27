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
@Table(name = "defsemt", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Sem_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semt.findAll", query = "SELECT s FROM Semt s"),
    @NamedQuery(name = "Semt.findBySemID", query = "SELECT s FROM Semt s WHERE s.semID = :semID"),
    @NamedQuery(name = "Semt.findBySemIsmi", query = "SELECT s FROM Semt s WHERE s.semIsmi = :semIsmi"),
    @NamedQuery(name = "Semt.findByIlcId", query = "SELECT s FROM Semt s WHERE s.ilcId = :ilcId")})
public class Semt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Sem_ID", nullable = false)
    private Integer semID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Sem_Ismi", nullable = false, length = 100)
    private String semIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ILC_ID", nullable = false)
    private int ilcId;

    public Semt() {
    }

    public Semt(Integer semID) {
        this.semID = semID;
    }

    public Semt(Integer semID, String semIsmi, int ilcId) {
        this.semID = semID;
        this.semIsmi = semIsmi;
        this.ilcId = ilcId;
    }

    public Integer getSemID() {
        return semID;
    }

    public void setSemID(Integer semID) {
        this.semID = semID;
    }

    public String getSemIsmi() {
        return semIsmi;
    }

    public void setSemIsmi(String semIsmi) {
        this.semIsmi = semIsmi;
    }

    public int getIlcId() {
        return ilcId;
    }

    public void setIlcId(int ilcId) {
        this.ilcId = ilcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (semID != null ? semID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semt)) {
            return false;
        }
        Semt other = (Semt) object;
        if ((this.semID == null && other.semID != null) || (this.semID != null && !this.semID.equals(other.semID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Semt[ semID=" + semID + " ]";
    }
    
}
