/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;

import utng.modelo.Rol;

/**
 *
 * @author adri_
 */
public class RolDAO extends DAO<Rol>{
    public RolDAO(){
        super(new Rol());
    }
    
    protected Rol getOneById(Rol rol) throws HibernateException {
        return super.getOneById(rol.getIdRol()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
