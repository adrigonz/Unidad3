/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Adriana Gonzalez
 */
@Entity
@Table (name="guerra")
public class Guerra implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_guerra")
    private Long idGuerra;
    @Column(name = "nombre_guerra", length = 50)
    private String nombreGuerra;
    @Column(name = "lugar_guerra", length = 50)
    private String lugarGuerra;
    @Column(name = "descripcion_guerra", length = 100)
    private String descripcionGuerra;

    public Guerra() {
        this.idGuerra = 0L;
    }

    public Long getIdGuerra() {
        return idGuerra;
    }

    public void setIdGuerra(Long idGuerra) {
        this.idGuerra = idGuerra;
    }

    public String getNombreGuerra() {
        return nombreGuerra;
    }

    public void setNombreGuerra(String nombreGuerra) {
        this.nombreGuerra = nombreGuerra;
    }

    public String getLugarGuerra() {
        return lugarGuerra;
    }

    public void setLugarGuerra(String lugarGuerra) {
        this.lugarGuerra = lugarGuerra;
    }

    public String getDescripcionGuerra() {
        return descripcionGuerra;
    }

    public void setDescripcionGuerra(String descripcionGuerra) {
        this.descripcionGuerra = descripcionGuerra;
    }    
}
