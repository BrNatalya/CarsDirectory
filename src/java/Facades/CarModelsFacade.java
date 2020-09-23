/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.CarModels;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nataly
 */
@Stateless
public class CarModelsFacade extends AbstractFacade<CarModels> {

    @PersistenceContext(unitName = "CarsDirectoryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarModelsFacade() {
        super(CarModels.class);
    }
    
}
