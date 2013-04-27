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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Utku
 */
@Entity
@Table(name = "hastalik_departman", catalog = "HRS", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"HD_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HastalikDepartman.findAll", query = "SELECT h FROM HastalikDepartman h"),
    @NamedQuery(name = "HastalikDepartman.findByHdId", query = "SELECT h FROM HastalikDepartman h WHERE h.hdId = :hdId"),
    @NamedQuery(name = "HastalikDepartman.findByDepID", query = "SELECT h FROM HastalikDepartman h WHERE h.depID = :depID"),
    @NamedQuery(name = "HastalikDepartman.findByHasID", query = "SELECT h FROM HastalikDepartman h WHERE h.hasID = :hasID")})
public class HastalikDepartman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HD_ID", nullable = false)
    private Integer hdId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dep_ID", nullable = false)
    private int depID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Has_ID", nullable = false)
    private int hasID;

    public HastalikDepartman() {
    }

    public HastalikDepartman(Integer hdId) {
        this.hdId = hdId;
    }

    public HastalikDepartman(Integer hdId, int depID, int hasID) {
        this.hdId = hdId;
        this.depID = depID;
        this.hasID = hasID;
    }

    public Integer getHdId() {
        return hdId;
    }

    public void setHdId(Integer hdId) {
        this.hdId = hdId;
    }

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }

    public int getHasID() {
        return hasID;
    }

    public void setHasID(int hasID) {
        this.hasID = hasID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hdId != null ? hdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HastalikDepartman)) {
            return false;
        }
        HastalikDepartman other = (HastalikDepartman) object;
        if ((this.hdId == null && other.hdId != null) || (this.hdId != null && !this.hdId.equals(other.hdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.HastalikDepartman[ hdId=" + hdId + " ]";
    }
    
}
