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
@Table(catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Adr_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adres.findAll", query = "SELECT a FROM Adres a"),
    @NamedQuery(name = "Adres.findByAdrID", query = "SELECT a FROM Adres a WHERE a.adrID = :adrID"),
    @NamedQuery(name = "Adres.findByAdrSehir", query = "SELECT a FROM Adres a WHERE a.adrSehir = :adrSehir"),
    @NamedQuery(name = "Adres.findByAdrIlce", query = "SELECT a FROM Adres a WHERE a.adrIlce = :adrIlce"),
    @NamedQuery(name = "Adres.findByAdrMahalle", query = "SELECT a FROM Adres a WHERE a.adrMahalle = :adrMahalle"),
    @NamedQuery(name = "Adres.findByAdrDetay", query = "SELECT a FROM Adres a WHERE a.adrDetay = :adrDetay"),
    @NamedQuery(name = "Adres.findByAdrAktif", query = "SELECT a FROM Adres a WHERE a.adrAktif = :adrAktif")})
public class Adres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Adr_ID", nullable = false)
    private Integer adrID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Adr_Sehir", nullable = false)
    private int adrSehir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Adr_Ilce", nullable = false)
    private int adrIlce;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Adr_Mahalle", nullable = false)
    private int adrMahalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Adr_Detay", nullable = false, length = 255)
    private String adrDetay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Adr_Aktif", nullable = false)
    private boolean adrAktif;

    public Adres() {
    }

    public Adres(Integer adrID) {
        this.adrID = adrID;
    }

    public Adres(Integer adrID, int adrSehir, int adrIlce, int adrMahalle, String adrDetay, boolean adrAktif) {
        this.adrID = adrID;
        this.adrSehir = adrSehir;
        this.adrIlce = adrIlce;
        this.adrMahalle = adrMahalle;
        this.adrDetay = adrDetay;
        this.adrAktif = adrAktif;
    }

    public Integer getAdrID() {
        return adrID;
    }

    public void setAdrID(Integer adrID) {
        this.adrID = adrID;
    }

    public int getAdrSehir() {
        return adrSehir;
    }

    public void setAdrSehir(int adrSehir) {
        this.adrSehir = adrSehir;
    }

    public int getAdrIlce() {
        return adrIlce;
    }

    public void setAdrIlce(int adrIlce) {
        this.adrIlce = adrIlce;
    }

    public int getAdrMahalle() {
        return adrMahalle;
    }

    public void setAdrMahalle(int adrMahalle) {
        this.adrMahalle = adrMahalle;
    }

    public String getAdrDetay() {
        return adrDetay;
    }

    public void setAdrDetay(String adrDetay) {
        this.adrDetay = adrDetay;
    }

    public boolean getAdrAktif() {
        return adrAktif;
    }

    public void setAdrAktif(boolean adrAktif) {
        this.adrAktif = adrAktif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adrID != null ? adrID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adres)) {
            return false;
        }
        Adres other = (Adres) object;
        if ((this.adrID == null && other.adrID != null) || (this.adrID != null && !this.adrID.equals(other.adrID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Adres[ adrID=" + adrID + " ]";
    }
    
}
