/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nataly
 */

@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c"),
    @NamedQuery(name = "Cars.findByIdCars", query = "SELECT c FROM Cars c WHERE c.idCars = :idCars"),
    @NamedQuery(name = "Cars.findByRegistrNumber", query = "SELECT c FROM Cars c WHERE c.registrNumber = :registrNumber"),
    @NamedQuery(name = "Cars.findByYearManufact", query = "SELECT c FROM Cars c WHERE c.yearManufact = :yearManufact")})
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cars")
    private Integer idCars;
    
       
    @Column(name = "registr_number")
    private String registrNumber;
    
    @Size(max = 4)
    @Column(name = "year_manufact")
    private String yearManufact;
    
    @JoinColumn(name = "model_id", referencedColumnName = "id_model")
    @ManyToOne
    private CarModels modelId;
    
    @JoinColumn(name = "color_id", referencedColumnName = "id_color")
    @ManyToOne
    private Colors colorId;
    
    @JoinColumn(name = "country_id", referencedColumnName = "id_country")
    @ManyToOne
    private Countries countryId;

    public Cars() {
    }

    public Cars(Integer idCars) {
        this.idCars = idCars;
    }

    public Integer getIdCars() {
    return idCars;
    }

    public void setIdCars(Integer idCars) {
        this.idCars = idCars;
    }

    public String getRegistrNumber() {
    return registrNumber;
    }

    public void setRegistrNumber(String registrNumber) {
        this.registrNumber = registrNumber;
    }

    public String getYearManufact() {
        return yearManufact;
    }

    public void setYearManufact(String yearManufact) {
        this.yearManufact = yearManufact;
    }

    public CarModels getModelId() {
        return modelId;
    }

    public void setModelId(CarModels modelId) {
        this.modelId = modelId;
    }

    public Colors getColorId() {
        return colorId;
    }

    public void setColorId(Colors colorId) {
        this.colorId = colorId;
    }

    public Countries getCountryId() {
        return countryId;
    }

    public void setCountryId(Countries countryId) {
        this.countryId = countryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCars != null ? idCars.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.idCars == null && other.idCars != null) || (this.idCars != null && !this.idCars.equals(other.idCars))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cars[ idCars=" + idCars + " ]";
    }
    
}
