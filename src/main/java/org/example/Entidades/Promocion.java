package org.example.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder

public class Promocion {
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Articulo> articulos = new HashSet<>();
    private Set<Imagen> promoImagen = new HashSet<>();
}