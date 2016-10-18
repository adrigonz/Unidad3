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
import utng.datos.ArmaDAO;
import utng.datos.GuerraDAO;
import utng.modelo.Arma;
import utng.modelo.Guerra;

/**
 *
 * @author adri_
 */
@ManagedBean(name = "armaBean")
@SessionScoped
public class ArmaBean implements Serializable{
    private List<Arma> armas;
    private Arma arma;
    private List<Guerra> guerras;
    /**
     * Creates a new instance of ArmaBean
     */
    public ArmaBean() {
        arma = new Arma();
        arma.setGuerra(new Guerra());
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public List<Guerra> getGuerras() {
        return guerras;
    }

    public void setGuerras(List<Guerra> guerras) {
        this.guerras = guerras;
    }
    
    public String listar(){
        ArmaDAO dao = new ArmaDAO();
        try {
            armas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Armas";
    }
    
    public String eliminar(){
        ArmaDAO dao = new ArmaDAO();
        try {
            dao.delete(arma);
            armas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        arma = new Arma();
        arma.setGuerra(new Guerra());
        try {
            guerras= new GuerraDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        ArmaDAO dao = new ArmaDAO();
        try {
            if(arma.getIdArma()!= 0){
                dao.update(arma);
            }else{
                dao.insert(arma);
            }
            armas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
        return "Cancelar";
    }
    
    public String editar(Arma arma){
        this.arma = arma;
        try {
            guerras = new GuerraDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
    
}
