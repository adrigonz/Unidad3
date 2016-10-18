/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.GuerraDAO;
import utng.modelo.Guerra;

/**
 *
 * @author Adriana Gonzalez
 */
@ManagedBean
@SessionScoped
public class GuerraBean implements Serializable{
    
    private List<Guerra> guerras;
    private Guerra guerra;
    /**
     * Creates a new instance of GuerraBean
     */
    public GuerraBean() {
    }

    public List<Guerra> getGuerras() {
        return guerras;
    }

    public void setGuerras(List<Guerra> guerras) {
        this.guerras = guerras;
    }

    public Guerra getGuerra() {
        return guerra;
    }

    public void setGuerra(Guerra guerra) {
        this.guerra = guerra;
    }
    
    public String listar(){
        GuerraDAO dao = new GuerraDAO();
        try {
            guerras=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guerras";
    }
    
    public String eliminar(){
        GuerraDAO dao = new GuerraDAO();
        try {
            dao.delete(guerra);
            guerras=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        guerra = new Guerra();
        return "Iniciar";
    }
    
    public String guardar(){
        GuerraDAO dao = new GuerraDAO();
        try {
            if(guerra.getIdGuerra()!= 0){
                dao.update(guerra);
            }else{
                dao.insert(guerra);
            }
            guerras=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
        return "Cancelar";
    }
    
    public String editar(Guerra guerra){
        this.guerra = guerra;
        return "Editar";
    }
}
