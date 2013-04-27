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
    @UniqueConstraint(columnNames = {"Yor_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yorumlar.findAll", query = "SELECT y FROM Yorumlar y"),
    @NamedQuery(name = "Yorumlar.findByYorID", query = "SELECT y FROM Yorumlar y WHERE y.yorID = :yorID"),
    @NamedQuery(name = "Yorumlar.findByYorDetay", query = "SELECT y FROM Yorumlar y WHERE y.yorDetay = :yorDetay"),
    @NamedQuery(name = "Yorumlar.findByYorZamani", query = "SELECT y FROM Yorumlar y WHERE y.yorZamani = :yorZamani"),
    @NamedQuery(name = "Yorumlar.findByYorDerecesi", query = "SELECT y FROM Yorumlar y WHERE y.yorDerecesi = :yorDerecesi"),
    @NamedQuery(name = "Yorumlar.findByYorRezervasyon", query = "SELECT y FROM Yorumlar y WHERE y.yorRezervasyon = :yorRezervasyon"),
    @NamedQuery(name = "Yorumlar.findByYorOnay", query = "SELECT y FROM Yorumlar y WHERE y.yorOnay = :yorOnay")})
public class Yorumlar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Yor_ID", nullable = false)
    private Integer yorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Yor_Detay", nullable = false, length = 255)
    private String yorDetay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Yor_Zamani", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorZamani;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Yor_Derecesi", nullable = false)
    private int yorDerecesi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Yor_Rezervasyon", nullable = false)
    private int yorRezervasyon;
    @Column(name = "Yor_Onay")
    private Boolean yorOnay;

    public Yorumlar() {
    }

    public Yorumlar(Integer yorID) {
        this.yorID = yorID;
    }

    public Yorumlar(Integer yorID, String yorDetay, Date yorZamani, int yorDerecesi, int yorRezervasyon) {
        this.yorID = yorID;
        this.yorDetay = yorDetay;
        this.yorZamani = yorZamani;
        this.yorDerecesi = yorDerecesi;
        this.yorRezervasyon = yorRezervasyon;
    }

    public Integer getYorID() {
        return yorID;
    }

    public void setYorID(Integer yorID) {
        this.yorID = yorID;
    }

    public String getYorDetay() {
        return yorDetay;
    }

    public void setYorDetay(String yorDetay) {
        this.yorDetay = yorDetay;
    }

    public Date getYorZamani() {
        return yorZamani;
    }

    public void setYorZamani(Date yorZamani) {
        this.yorZamani = yorZamani;
    }

    public int getYorDerecesi() {
        return yorDerecesi;
    }

    public void setYorDerecesi(int yorDerecesi) {
        this.yorDerecesi = yorDerecesi;
    }

    public int getYorRezervasyon() {
        return yorRezervasyon;
    }

    public void setYorRezervasyon(int yorRezervasyon) {
        this.yorRezervasyon = yorRezervasyon;
    }

    public Boolean getYorOnay() {
        return yorOnay;
    }

    public void setYorOnay(Boolean yorOnay) {
        this.yorOnay = yorOnay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yorID != null ? yorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yorumlar)) {
            return false;
        }
        Yorumlar other = (Yorumlar) object;
        if ((this.yorID == null && other.yorID != null) || (this.yorID != null && !this.yorID.equals(other.yorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Yorumlar[ yorID=" + yorID + " ]";
    }
    
}
