/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Colors;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nataly
 */
@Stateless
public class ColorsFacade extends AbstractFacade<Colors> {

    @PersistenceContext(unitName = "CarsDirectoryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColorsFacade() {
        super(Colors.class);
    }
    
}
