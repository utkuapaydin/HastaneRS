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
@Table(name = "defhastane", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Has_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hastane.findAll", query = "SELECT h FROM Hastane h"),
    @NamedQuery(name = "Hastane.findByHasID", query = "SELECT h FROM Hastane h WHERE h.hasID = :hasID"),
    @NamedQuery(name = "Hastane.findByHasIsmi", query = "SELECT h FROM Hastane h WHERE h.hasIsmi = :hasIsmi"),
    @NamedQuery(name = "Hastane.findByHasAdres", query = "SELECT h FROM Hastane h WHERE h.hasAdres = :hasAdres"),
    @NamedQuery(name = "Hastane.findByHTc", query = "SELECT h FROM Hastane h WHERE h.hTc = :hTc"),
    @NamedQuery(name = "Hastane.findByHasRezSuresi", query = "SELECT h FROM Hastane h WHERE h.hasRezSuresi = :hasRezSuresi"),
    @NamedQuery(name = "Hastane.findByHasOglenBas", query = "SELECT h FROM Hastane h WHERE h.hasOglenBas = :hasOglenBas"),
    @NamedQuery(name = "Hastane.findByHasOglenBit", query = "SELECT h FROM Hastane h WHERE h.hasOglenBit = :hasOglenBit"),
    @NamedQuery(name = "Hastane.findByHasMesaiBas", query = "SELECT h FROM Hastane h WHERE h.hasMesaiBas = :hasMesaiBas"),
    @NamedQuery(name = "Hastane.findByHasMesaiBit", query = "SELECT h FROM Hastane h WHERE h.hasMesaiBit = :hasMesaiBit")})
public class Hastane implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Has_ID", nullable = false)
    private Integer hasID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "Has_Ismi", nullable = false, length = 300)
    private String hasIsmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Has_Adres", nullable = false)
    private int hasAdres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "H_TC", nullable = false, length = 11)
    private String hTc;
    @Column(name = "Has_RezSuresi")
    private Integer hasRezSuresi;
    @Column(name = "Has_OglenBas")
    @Temporal(TemporalType.TIME)
    private Date hasOglenBas;
    @Column(name = "Has_OglenBit")
    @Temporal(TemporalType.TIME)
    private Date hasOglenBit;
    @Column(name = "Has_MesaiBas")
    @Temporal(TemporalType.TIME)
    private Date hasMesaiBas;
    @Column(name = "Has_MesaiBit")
    @Temporal(TemporalType.TIME)
    private Date hasMesaiBit;

    public Hastane() {
    }

    public Hastane(Integer hasID) {
        this.hasID = hasID;
    }

    public Hastane(Integer hasID, String hasIsmi, int hasAdres, String hTc) {
        this.hasID = hasID;
        this.hasIsmi = hasIsmi;
        this.hasAdres = hasAdres;
        this.hTc = hTc;
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

    public int getHasAdres() {
        return hasAdres;
    }

    public void setHasAdres(int hasAdres) {
        this.hasAdres = hasAdres;
    }

    public String getHTc() {
        return hTc;
    }

    public void setHTc(String hTc) {
        this.hTc = hTc;
    }

    public Integer getHasRezSuresi() {
        return hasRezSuresi;
    }

    public void setHasRezSuresi(Integer hasRezSuresi) {
        this.hasRezSuresi = hasRezSuresi;
    }

    public Date getHasOglenBas() {
        return hasOglenBas;
    }

    public void setHasOglenBas(Date hasOglenBas) {
        this.hasOglenBas = hasOglenBas;
    }

    public Date getHasOglenBit() {
        return hasOglenBit;
    }

    public void setHasOglenBit(Date hasOglenBit) {
        this.hasOglenBit = hasOglenBit;
    }

    public Date getHasMesaiBas() {
        return hasMesaiBas;
    }

    public void setHasMesaiBas(Date hasMesaiBas) {
        this.hasMesaiBas = hasMesaiBas;
    }

    public Date getHasMesaiBit() {
        return hasMesaiBit;
    }

    public void setHasMesaiBit(Date hasMesaiBit) {
        this.hasMesaiBit = hasMesaiBit;
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
        if (!(object instanceof Hastane)) {
            return false;
        }
        Hastane other = (Hastane) object;
        if ((this.hasID == null && other.hasID != null) || (this.hasID != null && !this.hasID.equals(other.hasID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Hastane[ hasID=" + hasID + " ]";
    }
    
}
