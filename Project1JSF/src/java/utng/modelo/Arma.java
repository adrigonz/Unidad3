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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Adrina Gonzalez
 */
@Entity
@Table (name="arma")
public class Arma implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arma")
    private Long idArma;
    @Column(name = "nombre_arma", length = 50)
    private String nombreArma;
    @Column(name = "tamanio_arma", length = 50)
    private String tamanioArma;
    @Column(name = "descripcion_arma", length = 100)
    private String descripcionArma;
    @ManyToOne
    @JoinColumn(name = "id_guerra")
    private Guerra guerra;

    public Arma(Long idArma, String nombreArma, String tamanioArma, String descripcionArma, Guerra guerra) {
        super();
        this.idArma = idArma;
        this.nombreArma = nombreArma;
        this.tamanioArma = tamanioArma;
        this.descripcionArma = descripcionArma;
        this.guerra = guerra;
    }

    public Arma() {
        this.idArma=0L;
    }

    public Long getIdArma() {
        return idArma;
    }

    public void setIdArma(Long idArma) {
        this.idArma = idArma;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public String getTamanioArma() {
        return tamanioArma;
    }

    public void setTamanioArma(String tamanioArma) {
        this.tamanioArma = tamanioArma;
    }

    public String getDescripcionArma() {
        return descripcionArma;
    }

    public void setDescripcionArma(String descripcionArma) {
        this.descripcionArma = descripcionArma;
    }

    public Guerra getGuerra() {
        return guerra;
    }

    public void setGuerra(Guerra guerra) {
        this.guerra = guerra;
    }
}
