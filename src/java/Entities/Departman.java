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
@Table(name = "defdepartman", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Dep_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departman.findAll", query = "SELECT d FROM Departman d"),
    @NamedQuery(name = "Departman.findByDepID", query = "SELECT d FROM Departman d WHERE d.depID = :depID"),
    @NamedQuery(name = "Departman.findByDepIsmi", query = "SELECT d FROM Departman d WHERE d.depIsmi = :depIsmi")})
public class Departman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Dep_ID", nullable = false)
    private Integer depID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Dep_Ismi", nullable = false, length = 200)
    private String depIsmi;

    public Departman() {
    }

    public Departman(Integer depID) {
        this.depID = depID;
    }

    public Departman(Integer depID, String depIsmi) {
        this.depID = depID;
        this.depIsmi = depIsmi;
    }

    public Integer getDepID() {
        return depID;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }

    public String getDepIsmi() {
        return depIsmi;
    }

    public void setDepIsmi(String depIsmi) {
        this.depIsmi = depIsmi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depID != null ? depID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departman)) {
            return false;
        }
        Departman other = (Departman) object;
        if ((this.depID == null && other.depID != null) || (this.depID != null && !this.depID.equals(other.depID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Departman[ depID=" + depID + " ]";
    }
    
}
