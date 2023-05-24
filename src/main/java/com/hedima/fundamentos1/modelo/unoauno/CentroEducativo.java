package com.hedima.fundamentos1.modelo.unoauno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "centros educactivos")
public class CentrosEducativos {

    @Id
    @GeneratedValue(strategy = GenerationType)
    private int idCentro;
    @Column(length = 30, nullable = false)
    private String nombreCentro;
    @Column(length = 80, nullable = false)
    private String direccion;
    private int plazas;


}
