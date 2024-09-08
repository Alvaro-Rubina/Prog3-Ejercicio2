package org.example.entidades;

import lombok.*;


import java.awt.*;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Builder

public class Promocion {
    private Long id;
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<Articulo> articulos = new HashSet<Articulo>();
    private Set<Imagen> imagenes = new HashSet<Imagen>();
}



