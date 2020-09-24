package Entities;

import Entities.Cars;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T15:32:18")
@StaticMetamodel(Colors.class)
public class Colors_ { 

    public static volatile CollectionAttribute<Colors, Cars> carsCollection;
    public static volatile SingularAttribute<Colors, String> nameColor;
    public static volatile SingularAttribute<Colors, Integer> idColor;

}