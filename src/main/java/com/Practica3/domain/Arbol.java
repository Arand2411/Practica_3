
package com.Practica3.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private long id;
    private String rutaImagen;
    private String nombreComun;
    private String tipoFlor;
    private String durezaMadera;
    private int altura;
    private String region;
    private boolean activo;
    
    public Arbol(){

    }

    public Arbol(long id, String tipoFlor) {
        this.id = id;
        this.tipoFlor = tipoFlor;
    }
    
}


