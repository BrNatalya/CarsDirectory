package Entities;

import Entities.CarModels;
import Entities.Colors;
import Entities.Countries;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-21T23:35:06")
@StaticMetamodel(Cars.class)
public class Cars_ { 

    public static volatile SingularAttribute<Cars, CarModels> modelId;
    public static volatile SingularAttribute<Cars, Colors> colorId;
    public static volatile SingularAttribute<Cars, Integer> idCars;
    public static volatile SingularAttribute<Cars, String> registrNumber;
    public static volatile SingularAttribute<Cars, Countries> countryId;
    public static volatile SingularAttribute<Cars, String> yearManufact;

}