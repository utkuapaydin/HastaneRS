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
@Table(name = "defmahalle", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Mah_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahalle.findAll", query = "SELECT m FROM Mahalle m"),
    @NamedQuery(name = "Mahalle.findByMahID", query = "SELECT m FROM Mahalle m WHERE m.mahID = :mahID"),
    @NamedQuery(name = "Mahalle.findByMahIsmi", query = "SELECT m FROM Mahalle m WHERE m.mahIsmi = :mahIsmi"),
    @NamedQuery(name = "Mahalle.findBySemID", query = "SELECT m FROM Mahalle m WHERE m.semID = :semID")})
public class Mahalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Mah_ID", nullable = false)
    private Integer mahID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Mah_Ismi", nullable = false, length = 100)
    private String mahIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sem_ID", nullable = false)
    private int semID;

    public Mahalle() {
    }

    public Mahalle(Integer mahID) {
        this.mahID = mahID;
    }

    public Mahalle(Integer mahID, String mahIsmi, int semID) {
        this.mahID = mahID;
        this.mahIsmi = mahIsmi;
        this.semID = semID;
    }

    public Integer getMahID() {
        return mahID;
    }

    public void setMahID(Integer mahID) {
        this.mahID = mahID;
    }

    public String getMahIsmi() {
        return mahIsmi;
    }

    public void setMahIsmi(String mahIsmi) {
        this.mahIsmi = mahIsmi;
    }

    public int getSemID() {
        return semID;
    }

    public void setSemID(int semID) {
        this.semID = semID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mahID != null ? mahID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahalle)) {
            return false;
        }
        Mahalle other = (Mahalle) object;
        if ((this.mahID == null && other.mahID != null) || (this.mahID != null && !this.mahID.equals(other.mahID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Mahalle[ mahID=" + mahID + " ]";
    }
    
}
