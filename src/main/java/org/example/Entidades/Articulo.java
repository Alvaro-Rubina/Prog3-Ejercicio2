package org.example.Entidades;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder
public class Articulo {
    private Long id;
    private String denominacion;
    private double precioVenta;
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Imagen imagen;
    private UnidadMedida unidadMedida;
}
