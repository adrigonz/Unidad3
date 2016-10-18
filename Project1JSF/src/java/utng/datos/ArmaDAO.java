/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Arma;

/**
 *
 * @author adri_
 */
public class ArmaDAO extends DAO<Arma>{

    public ArmaDAO() {
        super(new Arma());
    }
    public Arma getOneById(Arma arma) throws HibernateException {
        return super.getOneById(arma.getIdArma());
    }
    
}
