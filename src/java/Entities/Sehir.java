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
@Table(name = "defsehir", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"S_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sehir.findAll", query = "SELECT s FROM Sehir s"),
    @NamedQuery(name = "Sehir.findBySId", query = "SELECT s FROM Sehir s WHERE s.sId = :sId"),
    @NamedQuery(name = "Sehir.findBySIsmi", query = "SELECT s FROM Sehir s WHERE s.sIsmi = :sIsmi"),
    @NamedQuery(name = "Sehir.findBySKodu", query = "SELECT s FROM Sehir s WHERE s.sKodu = :sKodu"),
    @NamedQuery(name = "Sehir.findBySSiralama", query = "SELECT s FROM Sehir s WHERE s.sSiralama = :sSiralama")})
public class Sehir implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "S_ID", nullable = false)
    private Integer sId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "S_Ismi", nullable = false, length = 100)
    private String sIsmi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "S_Kodu", nullable = false, length = 3)
    private String sKodu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "S_Siralama", nullable = false, length = 45)
    private String sSiralama;

    public Sehir() {
    }

    public Sehir(Integer sId) {
        this.sId = sId;
    }

    public Sehir(Integer sId, String sIsmi, String sKodu, String sSiralama) {
        this.sId = sId;
        this.sIsmi = sIsmi;
        this.sKodu = sKodu;
        this.sSiralama = sSiralama;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getSIsmi() {
        return sIsmi;
    }

    public void setSIsmi(String sIsmi) {
        this.sIsmi = sIsmi;
    }

    public String getSKodu() {
        return sKodu;
    }

    public void setSKodu(String sKodu) {
        this.sKodu = sKodu;
    }

    public String getSSiralama() {
        return sSiralama;
    }

    public void setSSiralama(String sSiralama) {
        this.sSiralama = sSiralama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sehir)) {
            return false;
        }
        Sehir other = (Sehir) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Sehir[ sId=" + sId + " ]";
    }
    
}
