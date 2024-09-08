package org.example;

import org.example.entidades.*;
import org.example.repositorio.InMemoryRepository;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Main {

    static InMemoryRepository<Articulo> repoArticulo = new InMemoryRepository<>();
    static InMemoryRepository<Imagen> repoImagen = new InMemoryRepository<>();
    static InMemoryRepository<Promocion> repoPromociones = new InMemoryRepository<>();

    public static void main(String[] args) {

        UnidadMedida Porciones8 = UnidadMedida.builder().denominacion("porciones").build();
        UnidadMedida Porciones4 = UnidadMedida.builder().denominacion("porciones").build();
        UnidadMedida Litro1 = UnidadMedida.builder().denominacion("litro").build();


        Imagen imagen1 = Imagen.builder().denominacion("Pizza Grande Hawaiana").build();
        Imagen imagen2 = Imagen.builder().denominacion("Pizza Grande Napolitana").build();
        Imagen imagen3 = Imagen.builder().denominacion("Pizza Grande Muzzarella").build();
        Imagen imagen4 = Imagen.builder().denominacion("Pizza Chica Hawaiana").build();
        Imagen imagen5 = Imagen.builder().denominacion("Pizza Chica Napolitana").build();
        Imagen imagen6 = Imagen.builder().denominacion("Pizza Chica Muzzarella").build();
        Imagen imagen7 = Imagen.builder().denominacion("Cerveza Andes").build();
        Imagen imagen8 = Imagen.builder().denominacion("Cerveza Quilmes").build();
        Imagen imaHappy1 = Imagen.builder().denominacion("Happy Hour").build();
        Imagen imaHappy2 = Imagen.builder().denominacion("Happy Hour").build();
        Imagen verano1 = Imagen.builder().denominacion("Verano").build();
        Imagen verano2 = Imagen.builder().denominacion("Verano").build();
        Imagen invierno1 = Imagen.builder().denominacion("Invierno").build();
        Imagen invierno2 = Imagen.builder().denominacion("Invierno").build();
        Imagen cerveza1 = Imagen.builder().denominacion("Cerveza Andes").build();
        Imagen cerveza2 = Imagen.builder().denominacion("Cerveza Quilmes").build();


        Articulo PizzaGrandeHawaiana = Articulo.builder().denominacion("Pizza Grande Hawaiana")
                .precioVenta(7000.0)
                .precioCompra(5000.0)
                .stockActual(30)
                .stockMaximo(90)
                .unidadDeMedida(Porciones8)
                .imagen(imagen1)
                .build();
        repoArticulo.save(PizzaGrandeHawaiana);
        repoImagen.save(imagen1);

        Articulo PizzaChicaHawiana = Articulo.builder().denominacion("Pizza Chica Hawaiana")
                .precioVenta(4000.0)
                .precioCompra(2500.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Porciones4)
                .imagen(imagen4)
                .build();
        repoArticulo.save(PizzaChicaHawiana);
        repoImagen.save(imagen4);

        Articulo PizzaGrandeNapolitana = Articulo.builder().denominacion("Pizza Grande Napolitana")
                .precioVenta(8000.0)
                .precioCompra(4000.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Porciones8)
                .imagen(imagen2)
                .build();
        repoArticulo.save(PizzaGrandeNapolitana);
        repoImagen.save(imagen2);

        Articulo PizzaChicaNapolitana = Articulo.builder().denominacion("Pizza Chica Napolitana")
                .precioVenta(4000.0)
                .precioCompra(2500.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Porciones4)
                .imagen(imagen5)
                .build();
        repoArticulo.save(PizzaChicaNapolitana);
        repoImagen.save(imagen5);

        Articulo PizzaGrandeMuzzarella = Articulo.builder().denominacion("Pizza Grande Muzarella")
                .precioVenta(8000.0)
                .precioCompra(3500.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Porciones8)
                .imagen(imagen3)
                .build();
        repoArticulo.save(PizzaGrandeMuzzarella);
        repoImagen.save(imagen3);

        Articulo PizzaChicaMuzzarella = Articulo.builder().denominacion("Pizza Chica Muzarrella")
                .precioVenta(4000.0)
                .precioCompra(2500.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Porciones4)
                .imagen(imagen6)
                .build();
        repoArticulo.save(PizzaChicaMuzzarella);
        repoImagen.save(imagen6);

        Articulo CervezaAndes = Articulo.builder().denominacion("Cerveza Andes")
                .precioVenta(3000.0)
                .precioCompra(1500.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Litro1)
                .imagen(cerveza1)
                .build();
        repoArticulo.save(CervezaAndes);
        repoImagen.save(cerveza1);

        Articulo CervezaQuilmes = Articulo.builder().denominacion("Cerveza Quilmes")
                .precioVenta(3500.0)
                .precioCompra(2500.0)
                .stockActual(60)
                .stockMaximo(90)
                .unidadDeMedida(Litro1)
                .imagen(cerveza2)
                .build();
        repoArticulo.save(CervezaQuilmes);
        repoImagen.save(cerveza2);

        Promocion happyHour = Promocion.builder().denominacion("Happy Hour")
                .FechaDesde(LocalDate.of(2021, 1, 1))
                .FechaHasta(LocalDate.of(2021, 12, 31))
                .HoraDesde(LocalTime.of(18, 0))
                .HoraHasta(LocalTime.of(20, 0))
                .descripcionDescuento("2x1 en cervezas")
                .precioPromocional(12500.0)
                .tipoPromocion(TipoPromocion.HAPPY_HOUR)
                .imagenes(Set.of(imaHappy1, imaHappy2))
                .articulos(Set.of(PizzaGrandeMuzzarella, PizzaGrandeHawaiana, CervezaQuilmes))
                .build();
        repoPromociones.save(happyHour);

        Promocion verano = Promocion.builder().denominacion("Verano")
                .FechaDesde(LocalDate.of(2021, 1, 1))
                .FechaHasta(LocalDate.of(2021, 3, 31))
                .HoraDesde(LocalTime.of(0, 0))
                .HoraHasta(LocalTime.of(23, 59))
                .descripcionDescuento("20% de descuento en pizzas")
                .precioPromocional(11000.0)
                .tipoPromocion(TipoPromocion.VERANO)
                .imagenes(Set.of(verano1, verano2))
                .articulos(Set.of(PizzaChicaHawiana, CervezaQuilmes, CervezaAndes, PizzaGrandeNapolitana))
                .build();
        repoPromociones.save(verano);

        Promocion invierno = Promocion.builder().denominacion("Invierno")
                .FechaDesde(LocalDate.of(2021, 1, 1))
                .FechaHasta(LocalDate.of(2021, 3, 31))
                .HoraDesde(LocalTime.of(0, 0))
                .HoraHasta(LocalTime.of(23, 59))
                .descripcionDescuento("15$ de descuentos en cervezas")
                .precioPromocional(10000.0)
                .tipoPromocion(TipoPromocion.INVIERNO)
                .imagenes(Set.of(invierno1, invierno2))
                .articulos(Set.of(PizzaGrandeHawaiana, PizzaChicaMuzzarella, CervezaQuilmes))
                .build();
        repoPromociones.save(invierno);




        System.out.println("----- PROMOCIONES -----");
        for (Promocion promocion : repoPromociones.findAll()) {
            System.out.println("Promoción: " + promocion.getDenominacion());
        }
        System.out.println();


        System.out.println("-- ARTICULOS --");
        for (Articulo articulo : repoArticulo.findAll()) {
            System.out.println("Articulo: " + articulo.getDenominacion());
        }
        System.out.println();

        // Mostrando los articulos de cada promocion por separado
        mostrarArticulosDePromocion(1L);
        mostrarArticulosDePromocion(2L);
        mostrarArticulosDePromocion(3L);

        // Mostrando día y horario de la promoción de verano
        System.out.println("- Promoción de verano");
        System.out.println("Fecha desde: " + verano.getFechaDesde());
        System.out.println("Fecha hasta: " + verano.getFechaHasta());
        System.out.println("Hora desde: " + verano.getHoraDesde());
        System.out.println("Hora hasta: " + verano.getHoraHasta());

        // Mostrando la promocion más economica
        System.out.println("\n5.e) ----------------------------------");
        System.out.println("** Promoción más económica");
        System.out.println("Promoción: " + obtenerPromoMasEconomica().getDenominacion() + " - $" + obtenerPromoMasEconomica().getPrecioPromocional());

    }

    public static void mostrarArticulosDePromocion(Long id) {
        Promocion promocion = repoPromociones.findById(id).get();
        System.out.println(". Promoción: " + promocion.getDenominacion());
        System.out.println("  Articulos:");
        for (Articulo articulo : promocion.getArticulos()) {
            System.out.println(". " + articulo.getDenominacion() + " - $" + articulo.getPrecioVenta());
        }
        System.out.println("\n");
    }

    public static Promocion obtenerPromoMasEconomica(){
        Promocion promoMasEconomica = null;
        double precioPromoMasEconomica = Double.MAX_VALUE;

        for (Promocion promocion : repoPromociones.findAll()) {
            if (promocion.getPrecioPromocional() < precioPromoMasEconomica) {
                precioPromoMasEconomica = promocion.getPrecioPromocional();
                promoMasEconomica = promocion;
            }
        }

        return promoMasEconomica;
    }

}