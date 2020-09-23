/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nataly
 */
@Entity
@Table(name = "car_models")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarModels.findAll", query = "SELECT c FROM CarModels c"),
    @NamedQuery(name = "CarModels.findByIdModel", query = "SELECT c FROM CarModels c WHERE c.idModel = :idModel"),
    @NamedQuery(name = "CarModels.findByNameModel", query = "SELECT c FROM CarModels c WHERE c.nameModel = :nameModel")})
public class CarModels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_model")
    private Integer idModel;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "name_model")
    private String nameModel;
    
    @OneToMany(mappedBy = "modelId")
    private Collection<Cars> carsCollection;

    public CarModels() {
    }

    public CarModels(Integer idModel) {
        this.idModel = idModel;
    }

    public CarModels(Integer idModel, String nameModel) {
        this.idModel = idModel;
        this.nameModel = nameModel;
    }

    public Integer getIdModel() {
        return idModel;
    }

    public void setIdModel(Integer idModel) {
        this.idModel = idModel;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    @XmlTransient
    public Collection<Cars> getCarsCollection() {
        return carsCollection;
    }

    public void setCarsCollection(Collection<Cars> carsCollection) {
        this.carsCollection = carsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModel != null ? idModel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarModels)) {
            return false;
        }
        CarModels other = (CarModels) object;
        if ((this.idModel == null && other.idModel != null) || (this.idModel != null && !this.idModel.equals(other.idModel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nameModel;
    }
    
}
