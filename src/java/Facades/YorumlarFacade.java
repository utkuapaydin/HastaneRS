/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Yorumlar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Utku
 */
@Stateless
public class YorumlarFacade extends AbstractFacade<Yorumlar> {
    @PersistenceContext(unitName = "HastaneRSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public YorumlarFacade() {
        super(Yorumlar.class);
    }
    
}
