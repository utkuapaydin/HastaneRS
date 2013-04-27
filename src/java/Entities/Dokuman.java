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
    @UniqueConstraint(columnNames = {"Dok_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dokuman.findAll", query = "SELECT d FROM Dokuman d"),
    @NamedQuery(name = "Dokuman.findByDokID", query = "SELECT d FROM Dokuman d WHERE d.dokID = :dokID"),
    @NamedQuery(name = "Dokuman.findByDokTip", query = "SELECT d FROM Dokuman d WHERE d.dokTip = :dokTip"),
    @NamedQuery(name = "Dokuman.findByDokIsmi", query = "SELECT d FROM Dokuman d WHERE d.dokIsmi = :dokIsmi"),
    @NamedQuery(name = "Dokuman.findByDokSahibi", query = "SELECT d FROM Dokuman d WHERE d.dokSahibi = :dokSahibi"),
    @NamedQuery(name = "Dokuman.findByDokOlusZamani", query = "SELECT d FROM Dokuman d WHERE d.dokOlusZamani = :dokOlusZamani")})
public class Dokuman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Dok_ID", nullable = false)
    private Integer dokID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dok_Tip", nullable = false)
    private int dokTip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Dok_Ismi", nullable = false, length = 255)
    private String dokIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dok_Sahibi", nullable = false)
    private int dokSahibi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dok_OlusZamani", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dokOlusZamani;

    public Dokuman() {
    }

    public Dokuman(Integer dokID) {
        this.dokID = dokID;
    }

    public Dokuman(Integer dokID, int dokTip, String dokIsmi, int dokSahibi, Date dokOlusZamani) {
        this.dokID = dokID;
        this.dokTip = dokTip;
        this.dokIsmi = dokIsmi;
        this.dokSahibi = dokSahibi;
        this.dokOlusZamani = dokOlusZamani;
    }

    public Integer getDokID() {
        return dokID;
    }

    public void setDokID(Integer dokID) {
        this.dokID = dokID;
    }

    public int getDokTip() {
        return dokTip;
    }

    public void setDokTip(int dokTip) {
        this.dokTip = dokTip;
    }

    public String getDokIsmi() {
        return dokIsmi;
    }

    public void setDokIsmi(String dokIsmi) {
        this.dokIsmi = dokIsmi;
    }

    public int getDokSahibi() {
        return dokSahibi;
    }

    public void setDokSahibi(int dokSahibi) {
        this.dokSahibi = dokSahibi;
    }

    public Date getDokOlusZamani() {
        return dokOlusZamani;
    }

    public void setDokOlusZamani(Date dokOlusZamani) {
        this.dokOlusZamani = dokOlusZamani;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dokID != null ? dokID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dokuman)) {
            return false;
        }
        Dokuman other = (Dokuman) object;
        if ((this.dokID == null && other.dokID != null) || (this.dokID != null && !this.dokID.equals(other.dokID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Dokuman[ dokID=" + dokID + " ]";
    }
    
}
