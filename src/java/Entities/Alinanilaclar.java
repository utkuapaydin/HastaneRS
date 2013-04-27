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
    @UniqueConstraint(columnNames = {"AI_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alinanilaclar.findAll", query = "SELECT a FROM Alinanilaclar a"),
    @NamedQuery(name = "Alinanilaclar.findByAiId", query = "SELECT a FROM Alinanilaclar a WHERE a.aiId = :aiId"),
    @NamedQuery(name = "Alinanilaclar.findByIId", query = "SELECT a FROM Alinanilaclar a WHERE a.iId = :iId"),
    @NamedQuery(name = "Alinanilaclar.findByHTc", query = "SELECT a FROM Alinanilaclar a WHERE a.hTc = :hTc"),
    @NamedQuery(name = "Alinanilaclar.findByAIZamani", query = "SELECT a FROM Alinanilaclar a WHERE a.aIZamani = :aIZamani")})
public class Alinanilaclar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI_ID", nullable = false)
    private Integer aiId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "I_ID", nullable = false)
    private int iId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "H_TC", nullable = false, length = 11)
    private String hTc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AI_Zamani", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date aIZamani;

    public Alinanilaclar() {
    }

    public Alinanilaclar(Integer aiId) {
        this.aiId = aiId;
    }

    public Alinanilaclar(Integer aiId, int iId, String hTc, Date aIZamani) {
        this.aiId = aiId;
        this.iId = iId;
        this.hTc = hTc;
        this.aIZamani = aIZamani;
    }

    public Integer getAiId() {
        return aiId;
    }

    public void setAiId(Integer aiId) {
        this.aiId = aiId;
    }

    public int getIId() {
        return iId;
    }

    public void setIId(int iId) {
        this.iId = iId;
    }

    public String getHTc() {
        return hTc;
    }

    public void setHTc(String hTc) {
        this.hTc = hTc;
    }

    public Date getAIZamani() {
        return aIZamani;
    }

    public void setAIZamani(Date aIZamani) {
        this.aIZamani = aIZamani;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aiId != null ? aiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alinanilaclar)) {
            return false;
        }
        Alinanilaclar other = (Alinanilaclar) object;
        if ((this.aiId == null && other.aiId != null) || (this.aiId != null && !this.aiId.equals(other.aiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Alinanilaclar[ aiId=" + aiId + " ]";
    }
    
}
