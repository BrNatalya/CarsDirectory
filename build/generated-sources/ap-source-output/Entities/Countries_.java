package Entities;

import Entities.Cars;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T02:26:31")
@StaticMetamodel(Countries.class)
public class Countries_ { 

    public static volatile CollectionAttribute<Countries, Cars> carsCollection;
    public static volatile SingularAttribute<Countries, String> nameCountry;
    public static volatile SingularAttribute<Countries, Integer> idCountry;

}