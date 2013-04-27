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
@Table(name = "defhesap", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"H_TC"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hesap.findAll", query = "SELECT h FROM Hesap h"),
    @NamedQuery(name = "Hesap.findByHTc", query = "SELECT h FROM Hesap h WHERE h.hTc = :hTc"),
    @NamedQuery(name = "Hesap.findByHAdresi", query = "SELECT h FROM Hesap h WHERE h.hAdresi = :hAdresi"),
    @NamedQuery(name = "Hesap.findByHIsmi", query = "SELECT h FROM Hesap h WHERE h.hIsmi = :hIsmi"),
    @NamedQuery(name = "Hesap.findByHSoyismi", query = "SELECT h FROM Hesap h WHERE h.hSoyismi = :hSoyismi"),
    @NamedQuery(name = "Hesap.findByHSifre", query = "SELECT h FROM Hesap h WHERE h.hSifre = :hSifre"),
    @NamedQuery(name = "Hesap.findByHYetki", query = "SELECT h FROM Hesap h WHERE h.hYetki = :hYetki"),
    @NamedQuery(name = "Hesap.findByHEmail", query = "SELECT h FROM Hesap h WHERE h.hEmail = :hEmail"),
    @NamedQuery(name = "Hesap.findByHDogumtarihi", query = "SELECT h FROM Hesap h WHERE h.hDogumtarihi = :hDogumtarihi"),
    @NamedQuery(name = "Hesap.findByHIrk", query = "SELECT h FROM Hesap h WHERE h.hIrk = :hIrk"),
    @NamedQuery(name = "Hesap.findByHCinsiyet", query = "SELECT h FROM Hesap h WHERE h.hCinsiyet = :hCinsiyet")})
public class Hesap implements Serializable {
        
    private static boolean online = false;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "H_TC", nullable = false, length = 11)
    private String hTc;
    @Column(name = "H_Adresi")
    private Integer hAdresi;
    @Size(max = 90)
    @Column(name = "H_Ismi", length = 90)
    private String hIsmi;
    @Size(max = 90)
    @Column(name = "H_Soyismi", length = 90)
    private String hSoyismi;
    @Size(max = 150)
    @Column(name = "H_Sifre", length = 150)
    private String hSifre;
    @Column(name = "H_Yetki")
    private Integer hYetki;
    @Size(max = 150)
    @Column(name = "H_Email", length = 150)
    private String hEmail;
    @Column(name = "H_Dogumtarihi")
    @Temporal(TemporalType.DATE)
    private Date hDogumtarihi;
    @Size(max = 90)
    @Column(name = "H_Irk", length = 90)
    private String hIrk;
    @Column(name = "H_Cinsiyet")
    private Integer hCinsiyet;


    public Hesap() {
        online = false;
    }

    public Hesap(String hTc) {
        this.hTc = hTc;
    }

    public String getHTc() {
        return hTc;
    }

    public void setHTc(String hTc) {
        this.hTc = hTc;
    }

    public Integer getHAdresi() {
        return hAdresi;
    }

    public void setHAdresi(Integer hAdresi) {
        this.hAdresi = hAdresi;
    }

    public String getHIsmi() {
        return hIsmi;
    }

    public void setHIsmi(String hIsmi) {
        this.hIsmi = hIsmi;
    }

    public String getHSoyismi() {
        return hSoyismi;
    }

    public void setHSoyismi(String hSoyismi) {
        this.hSoyismi = hSoyismi;
    }

    public String getHSifre() {
        return hSifre;
    }

    public void setHSifre(String hSifre) {
        this.hSifre = hSifre;
    }

    public Integer getHYetki() {
        return hYetki;
    }

    public void setHYetki(Integer hYetki) {
        this.hYetki = hYetki;
    }

    public String getHEmail() {
        return hEmail;
    }

    public void setHEmail(String hEmail) {
        this.hEmail = hEmail;
    }

    public Date getHDogumtarihi() {
        return hDogumtarihi;
    }

    public void setHDogumtarihi(Date hDogumtarihi) {
        this.hDogumtarihi = hDogumtarihi;
    }

    public String getHIrk() {
        return hIrk;
    }

    public void setHIrk(String hIrk) {
        this.hIrk = hIrk;
    }

    public Integer getHCinsiyet() {
        return hCinsiyet;
    }

    public void setHCinsiyet(Integer hCinsiyet) {
        this.hCinsiyet = hCinsiyet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hTc != null ? hTc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hesap)) {
            return false;
        }
        Hesap other = (Hesap) object;
        if ((this.hTc == null && other.hTc != null) || (this.hTc != null && !this.hTc.equals(other.hTc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Hesap[ hTc=" + hTc + " ]";
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    
}
