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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Utku
 */
@Entity
@Table(catalog = "HRS", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guncelilceler.findAll", query = "SELECT g FROM Guncelilceler g"),
    @NamedQuery(name = "Guncelilceler.findByIlceID", query = "SELECT g FROM Guncelilceler g WHERE g.ilceID = :ilceID"),
    @NamedQuery(name = "Guncelilceler.findByIlID", query = "SELECT g FROM Guncelilceler g WHERE g.ilID = :ilID"),
    @NamedQuery(name = "Guncelilceler.findByIlce", query = "SELECT g FROM Guncelilceler g WHERE g.ilce = :ilce"),
    @NamedQuery(name = "Guncelilceler.findByOylesine", query = "SELECT g FROM Guncelilceler g WHERE g.oylesine = :oylesine")})
public class Guncelilceler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ilce_ID", nullable = false)
    private Integer ilceID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "il_ID", nullable = false)
    private int ilID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(nullable = false, length = 60)
    private String ilce;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(nullable = false, length = 55)
    private String oylesine;

    public Guncelilceler() {
    }

    public Guncelilceler(Integer ilceID) {
        this.ilceID = ilceID;
    }

    public Guncelilceler(Integer ilceID, int ilID, String ilce, String oylesine) {
        this.ilceID = ilceID;
        this.ilID = ilID;
        this.ilce = ilce;
        this.oylesine = oylesine;
    }

    public Integer getIlceID() {
        return ilceID;
    }

    public void setIlceID(Integer ilceID) {
        this.ilceID = ilceID;
    }

    public int getIlID() {
        return ilID;
    }

    public void setIlID(int ilID) {
        this.ilID = ilID;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getOylesine() {
        return oylesine;
    }

    public void setOylesine(String oylesine) {
        this.oylesine = oylesine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilceID != null ? ilceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guncelilceler)) {
            return false;
        }
        Guncelilceler other = (Guncelilceler) object;
        if ((this.ilceID == null && other.ilceID != null) || (this.ilceID != null && !this.ilceID.equals(other.ilceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Guncelilceler[ ilceID=" + ilceID + " ]";
    }
    
}
