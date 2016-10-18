/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;

import utng.modelo.Modulo;

/**
 *
 * @author adri_
 */
public class ModuloDAO extends DAO<Modulo>{
    public ModuloDAO(){
        super(new Modulo());
    }

    protected Modulo getOneById(Modulo modulo) throws HibernateException {
        return super.getOneById(modulo.getIdModulo()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
