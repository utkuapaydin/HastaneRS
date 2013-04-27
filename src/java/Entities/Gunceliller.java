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
    @NamedQuery(name = "Gunceliller.findAll", query = "SELECT g FROM Gunceliller g"),
    @NamedQuery(name = "Gunceliller.findByPlaka", query = "SELECT g FROM Gunceliller g WHERE g.plaka = :plaka"),
    @NamedQuery(name = "Gunceliller.findByIl", query = "SELECT g FROM Gunceliller g WHERE g.il = :il"),
    @NamedQuery(name = "Gunceliller.findBySiralama", query = "SELECT g FROM Gunceliller g WHERE g.siralama = :siralama"),
    @NamedQuery(name = "Gunceliller.findById", query = "SELECT g FROM Gunceliller g WHERE g.id = :id"),
    @NamedQuery(name = "Gunceliller.findByKod", query = "SELECT g FROM Gunceliller g WHERE g.kod = :kod")})
public class Gunceliller implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short plaka;
    @Size(max = 100)
    @Column(length = 100)
    private String il;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int siralama;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int kod;

    public Gunceliller() {
    }

    public Gunceliller(Integer id) {
        this.id = id;
    }

    public Gunceliller(Integer id, short plaka, int siralama, int kod) {
        this.id = id;
        this.plaka = plaka;
        this.siralama = siralama;
        this.kod = kod;
    }

    public short getPlaka() {
        return plaka;
    }

    public void setPlaka(short plaka) {
        this.plaka = plaka;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public int getSiralama() {
        return siralama;
    }

    public void setSiralama(int siralama) {
        this.siralama = siralama;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gunceliller)) {
            return false;
        }
        Gunceliller other = (Gunceliller) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Gunceliller[ id=" + id + " ]";
    }
    
}
