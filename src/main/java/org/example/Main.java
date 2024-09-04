package org.example;

import org.example.entidades.*;
import org.example.repositorio.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Set;

public class Main {

    // Repositorios
    static InMemoryRepository<Articulo> repositorioArticulo = new InMemoryRepository<>();
    static InMemoryRepository<Imagen> repositorioImagen = new InMemoryRepository<>();
    static InMemoryRepository<Promocion> repositorioPromocion = new InMemoryRepository<>();

    public static void main(String[] args) {

        // Unidades de Medida
        UnidadMedida ochoPorciones = UnidadMedida.builder().denominacion("porciones").build();
        UnidadMedida cuatroPorciones = UnidadMedida.builder().denominacion("porciones").build();
        UnidadMedida unLitro = UnidadMedida.builder().denominacion("litro").build();

        // Imagenes
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
        Imagen inviero2 = Imagen.builder().denominacion("Invierno").build();
        Imagen cerveza1 = Imagen.builder().denominacion("Cerveza Andes").build();
        Imagen cerveza2 = Imagen.builder().denominacion("Cerveza Quilmes").build();

        // Promociones
        Articulo pizzaGrandeHawaiana = Articulo.builder().denominacion("Pizza Grande Hawaiana")
                .precioVenta(5500.0)
                .precioCompra(3500.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(ochoPorciones)
                .imagen(imagen1)
                .build();

        Articulo pizzaChicaHawaiana = Articulo.builder().denominacion("Pizza Chica Hawaiana")
                .precioVenta(3500.0)
                .precioCompra(2500.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(cuatroPorciones)
                .imagen(imagen4)
                .build();

        Articulo pizzaGrandeNapolitana = Articulo.builder().denominacion("Pizza Grande Napolitana")
                .precioVenta(5500.0)
                .precioCompra(3500.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(ochoPorciones)
                .imagen(imagen2)
                .build();

        Articulo pizzaChicaNapolitana = Articulo.builder().denominacion("Pizza Chica Napolitana")
                .precioVenta(3500.0)
                .precioCompra(2500.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(cuatroPorciones)
                .imagen(imagen5)
                .build();

        Articulo pizzaGrandeMuzzarella = Articulo.builder().denominacion("Pizza Grande Muzzarella")
                .precioVenta(5500.0)
                .precioCompra(3500.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(ochoPorciones)
                .imagen(imagen3)
                .build();

        Articulo pizzaChicaMuzzarella = Articulo.builder().denominacion("Pizza Chica Muzzarella")
                .precioVenta(3500.0)
                .precioCompra(2500.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(cuatroPorciones)
                .imagen(imagen6)
                .build();

        Articulo cervezaAndes = Articulo.builder().denominacion("Cerveza Andes")
                .precioVenta(1500.0)
                .precioCompra(1000.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(unLitro)
                .imagen(cerveza1)
                .build();

        Articulo cervezaQuilmes = Articulo.builder().denominacion("Cerveza Quilmes")
                .precioVenta(1500.0)
                .precioCompra(1000.0)
                .stockActual(25)
                .stockMaximo(50)
                .unidadMedida(unLitro)
                .imagen(cerveza2)
                .build();

        Promocion happyHour = Promocion.builder().denominacion("Happy Hour")
                .fechaDesde(LocalDate.of(2021, 1, 1))
                .fechaHasta(LocalDate.of(2021, 12, 31))
                .horaDesde(LocalTime.of(18, 0))
                .horaHasta(LocalTime.of(20, 0))
                .descripcionDescuento("2x1 en cervezas")
                .precioPromocional(11500.0)
                .tipoPromocion(TipoPromocion.HAPPY_HOUR)
                .promoImagen(Set.of(imaHappy1, imaHappy2))
                .articulos(Set.of(pizzaGrandeMuzzarella, pizzaGrandeHawaiana, cervezaQuilmes))
                .build();

        Promocion verano = Promocion.builder().denominacion("Verano")
                .fechaDesde(LocalDate.of(2021, 1, 1))
                .fechaHasta(LocalDate.of(2021, 3, 31))
                .horaDesde(LocalTime.of(0, 0))
                .horaHasta(LocalTime.of(23, 59))
                .descripcionDescuento("20% de descuento en pizzas")
                .precioPromocional(10000.0)
                .tipoPromocion(TipoPromocion.VERANO)
                .promoImagen(Set.of(verano1, verano2))
                .articulos(Set.of(pizzaChicaHawaiana, cervezaQuilmes, cervezaAndes, pizzaGrandeNapolitana))
                .build();

        Promocion invierno = Promocion.builder()
                .denominacion("Invierno")
                .fechaDesde(LocalDate.of(2021, 6, 1))
                .articulos(Set.of(pizzaGrandeHawaiana, pizzaChicaMuzzarella, cervezaQuilmes))
                .fechaHasta(LocalDate.of(2021, 8, 31))
                .horaDesde(LocalTime.of(0, 0))
                .horaHasta(LocalTime.of(23, 59))
                .descripcionDescuento("15% de descuento en cervezas")
                .precioPromocional(8500.0)
                .tipoPromocion(TipoPromocion.INVIERNO)
                .promoImagen(Set.of(invierno1, inviero2))
                .articulos(Set.of(pizzaGrandeHawaiana, pizzaChicaMuzzarella, cervezaQuilmes))
                .build();


        repositorioArticulo.save(pizzaGrandeHawaiana);
        repositorioArticulo.save(pizzaChicaHawaiana);
        repositorioArticulo.save(pizzaGrandeNapolitana);
        repositorioArticulo.save(pizzaChicaNapolitana);
        repositorioArticulo.save(pizzaGrandeMuzzarella);
        repositorioArticulo.save(pizzaChicaMuzzarella);
        repositorioArticulo.save(cervezaAndes);
        repositorioArticulo.save(cervezaQuilmes);

        // Imagenes
        repositorioImagen.save(imagen1);
        repositorioImagen.save(imagen2);
        repositorioImagen.save(imagen3);
        repositorioImagen.save(imagen4);
        repositorioImagen.save(imagen5);
        repositorioImagen.save(imagen6);
        repositorioImagen.save(imagen7);
        repositorioImagen.save(imagen8);
        repositorioImagen.save(imaHappy1);
        repositorioImagen.save(imaHappy2);
        repositorioImagen.save(verano1);
        repositorioImagen.save(verano2);
        repositorioImagen.save(invierno1);
        repositorioImagen.save(inviero2);
        repositorioImagen.save(cerveza1);
        repositorioImagen.save(cerveza2);

        // Promociones
        repositorioPromocion.save(happyHour);
        repositorioPromocion.save(verano);
        repositorioPromocion.save(invierno);

        // Mostrando las promociones
        System.out.println("\n5.a) ----------------------------------");
        System.out.println("** PROMOCIONES");
        for (Promocion promocion : repositorioPromocion.findAll()) {
            System.out.println("Promoción: " + promocion.getDenominacion());
        }

        // Mostrando los articulos
        System.out.println("\n5.b) ----------------------------------");
        System.out.println("** ARTICULOS");
        for (Articulo articulo : repositorioArticulo.findAll()) {
            System.out.println("Articulo: " + articulo.getDenominacion());
        }

        // Mostrando los articulos de cada promocion por separado
        System.out.println("\n5.c) ----------------------------------");
        mostrarArticulosDePromocion(1L);
        mostrarArticulosDePromocion(2L);
        mostrarArticulosDePromocion(3L);

        // Mostrando día y horario de la promoción de verano
        System.out.println("\n5.d) ----------------------------------");
        System.out.println("** Promoción de verano");
        System.out.println("Fecha desde: " + verano.getFechaDesde());
        System.out.println("Fecha hasta: " + verano.getFechaHasta());
        System.out.println("Hora desde: " + verano.getHoraDesde());
        System.out.println("Hora hasta: " + verano.getHoraHasta());

        // Mostrando la promocion más economica
        System.out.println("\n5.e) ----------------------------------");
        System.out.println("** Promoción más económica");
        System.out.println("Promoción: " + obtenerPromoMasEconomica().getDenominacion() +
                " - $" + obtenerPromoMasEconomica().getPrecioPromocional());
    }

    public static void mostrarArticulosDePromocion(Long id) {
        Promocion promocion = repositorioPromocion.findById(id).get();
        System.out.println("** Promoción " + promocion.getDenominacion());
        System.out.println("* Articulos:");
        for (Articulo articulo : promocion.getArticulos()) {
            System.out.println("- " + articulo.getDenominacion() + " - $" + articulo.getPrecioVenta());
        }
        System.out.println("\n");
    }

    public static Promocion obtenerPromoMasEconomica(){
        Promocion promoMasEconomica = null;
        double precioPromoMasEconomica = Double.MAX_VALUE;
        for (Promocion promocion : repositorioPromocion.findAll()) {
            if (promocion.getPrecioPromocional() < precioPromoMasEconomica) {
                precioPromoMasEconomica = promocion.getPrecioPromocional();
                promoMasEconomica = promocion;
            }
        }
        return promoMasEconomica;
    }
}