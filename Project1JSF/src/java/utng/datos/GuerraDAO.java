/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;

import utng.modelo.Guerra;

/**
 *
 * @author Adriana Gonzalez
 */
public class GuerraDAO extends DAO<Guerra>{

    public GuerraDAO() {
        super(new Guerra());
    }

    public Guerra getOneById(Guerra guerra) throws HibernateException {
        return super.getOneById(guerra.getIdGuerra()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
