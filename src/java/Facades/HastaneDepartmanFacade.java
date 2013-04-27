/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.HastaneDepartman;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Utku
 */
@Stateless
public class HastaneDepartmanFacade extends AbstractFacade<HastaneDepartman> {
    @PersistenceContext(unitName = "HastaneRSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HastaneDepartmanFacade() {
        super(HastaneDepartman.class);
    }
    
}
