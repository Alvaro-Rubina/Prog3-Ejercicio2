package org.example;

import org.example.Entidades.*;
import org.example.repositorios.InMemoryRepository;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Inicializar repositorios
        InMemoryRepository<Imagen> imagenRepository = new InMemoryRepository<Imagen>();
        InMemoryRepository<Promocion> promocionRepository = new InMemoryRepository<>();
        InMemoryRepository<Articulo> articuloRepository = new InMemoryRepository<>();
        InMemoryRepository<TipoPromocion> tipoPromocionRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaRepository = new InMemoryRepository<>();
         //Crear Unidad de medida
        UnidadMedida ochoPorciones = UnidadMedida.builder().denominacion("Ocho Porciones").build();
        UnidadMedida cuatroPorciones = UnidadMedida.builder().denominacion("Cuatro Porciones").build();
        UnidadMedida unLitro = UnidadMedida.builder().denominacion("Un Litro").build();
        //guardar unidad de medida
        unidadMedidaRepository.save(ochoPorciones);
        unidadMedidaRepository.save(cuatroPorciones);
        unidadMedidaRepository.save(unLitro);
        //Crear Imagenes
        Imagen imagen1 = Imagen.builder().denominacion("Pizza grande Hawaiana").build();
        Imagen imagen2 = Imagen.builder().denominacion("Pizza grande Napolitana").build();
        Imagen imagen3 = Imagen.builder().denominacion("Pizza grande Muzza").build();
        Imagen imagen4 = Imagen.builder().denominacion("Pizza chica Hawaiana").build();
        Imagen imagen5 = Imagen.builder().denominacion("Pizza chica Napolitana").build();
        Imagen imagen6 = Imagen.builder().denominacion("Pizza chica Muzza").build();
        Imagen iamhappy1 = Imagen.builder().denominacion("Happy Hour").build();
        Imagen imhappy2 = Imagen.builder().denominacion("Happy Hour").build();
        Imagen verano1 = Imagen.builder().denominacion("Verano").build();
        Imagen verano2 = Imagen.builder().denominacion("Verano").build();
        Imagen invierno1 = Imagen.builder().denominacion("Invierno").build();
        Imagen invierno2 = Imagen.builder().denominacion("Invierno").build();
        Imagen cerveza1 = Imagen.builder().denominacion("Cerveza Andes").build();
        Imagen cerveza2 = Imagen.builder().denominacion("Cerveza Quilmes").build();
        //guardar imagenes
        imagenRepository.save(imagen1);
        imagenRepository.save(imagen2);
        imagenRepository.save(imagen3);
        imagenRepository.save(imagen4);
        imagenRepository.save(imagen5);
        imagenRepository.save(imagen6);
        imagenRepository.save(iamhappy1);
        imagenRepository.save(imhappy2);
        imagenRepository.save(verano1);
        imagenRepository.save(verano2);
        imagenRepository.save(invierno1);
        imagenRepository.save(invierno2);
        imagenRepository.save(cerveza1);
        imagenRepository.save(cerveza2);

        //Crear Articulos
        Articulo PgrandeHawaiana = Articulo.builder().denominacion("Pizza grande Hawaiana").precioVenta(500).precioCompra(200).stockActual(10).stockMaximo(20).imagen(imagen1).unidadMedida(ochoPorciones).build();
        Articulo PchicaHawaiana = Articulo.builder().denominacion("Pizza chica Hawaiana").precioVenta(200).precioCompra(100).stockActual(15).stockMaximo(30).imagen(imagen4).unidadMedida(cuatroPorciones).build();
        Articulo PgrandeNapo = Articulo.builder().denominacion("Pizza grande Napolitana").precioVenta(1000).precioCompra(1500).stockActual(15).stockMaximo(34).imagen(imagen2).unidadMedida(ochoPorciones).build();
        Articulo PchicaNapo = Articulo.builder().denominacion("Pizza chica Napolitana").precioVenta(200).precioCompra(300).stockActual(15).stockMaximo(30).imagen(imagen5).unidadMedida(cuatroPorciones).build();
        Articulo PgrandeMuzza = Articulo.builder().denominacion("Pizza grande Muzzarella").precioVenta(1000).precioCompra(2000).stockActual(23).stockMaximo(40).imagen(imagen3).unidadMedida(ochoPorciones).build();
        Articulo PchicaMuzza = Articulo.builder().denominacion("Pizza chica Muzzarella").precioVenta(350).precioCompra(130).stockActual(15).stockMaximo(23).imagen(imagen6).unidadMedida(cuatroPorciones).build();
        Articulo cervezaAndes = Articulo.builder().denominacion("Cerveza Andes").precioVenta(230).precioVenta(150).stockActual(30).stockMaximo(50).imagen(cerveza1).unidadMedida(unLitro).build();
        Articulo cervezaQuilmes = Articulo.builder().denominacion("Cerveza Quilmes").precioVenta(230).precioVenta(150).stockActual(30).stockMaximo(50).imagen(cerveza2).unidadMedida(unLitro).build();
//guardar articulos
        articuloRepository.save(PgrandeHawaiana);
        articuloRepository.save(PchicaHawaiana);
        articuloRepository.save(PgrandeNapo);
        articuloRepository.save(PchicaMuzza);
        articuloRepository.save(cervezaAndes);
        articuloRepository.save(cervezaQuilmes);

        //Crear promociones
        Promocion happyHour = Promocion.builder().denominacion("Happy Hour")
                .fechaDesde(LocalDate.of(2021, 1, 1))
                .fechaHasta(LocalDate.of(2021, 12, 31))
                .horaDesde(LocalTime.of(18, 0))
                .horaHasta(LocalTime.of(20, 0))
                .descripcionDescuento("2x1 en cervezas")
                .precioPromocional(11500.0)
                .tipoPromocion(TipoPromocion.HAPPYHOUR)
                .promoImagen(Set.of(iamhappy1, imhappy2))
                .articulos(Set.of(PgrandeMuzza, PgrandeHawaiana, cervezaQuilmes))
                .build();
        Promocion Verano = Promocion.builder().denominacion("Verano")
                .fechaDesde(LocalDate.of(2023, 1, 1))
                .fechaHasta(LocalDate.of(2024, 12, 31))
                .horaDesde(LocalTime.of(18, 0))
                .horaHasta(LocalTime.of(20, 0))
                .descripcionDescuento("2x1 en Pizzas")
                .precioPromocional(20500.0)
                .tipoPromocion(TipoPromocion.VERANO)
                .promoImagen(Set.of(verano1, verano2))
                .articulos(Set.of(PgrandeNapo, cervezaAndes, cervezaQuilmes))
                .build();
        Promocion Invierno = Promocion.builder().denominacion("Invierno")
                .fechaDesde(LocalDate.of(2023, 1, 1))
                .fechaHasta(LocalDate.of(2023, 12, 31))
                .horaDesde(LocalTime.of(18, 0))
                .horaHasta(LocalTime.of(20, 0))
                .descripcionDescuento("2 cervezas 1 pizza")
                .precioPromocional(14500.0)
                .tipoPromocion(TipoPromocion.INVIERNO)
                .promoImagen(Set.of(invierno1, invierno2))
                .articulos(Set.of(PgrandeHawaiana,PchicaMuzza, cervezaQuilmes))
                .build();
        //guardar promos
        promocionRepository.save(happyHour);
        promocionRepository.save(Verano);
        promocionRepository.save(Invierno);

        //Mostrar promos
        System.out.println( "Todas las promociones: ");
        List<Promocion> promociones = promocionRepository.findAll();
        promociones.forEach(System.out::println);

        //Mostrar articulos
        System.out.println("Todos los articulos: ");
        List<Articulo> articulos = articuloRepository.findAll();
        articulos.forEach(System.out::println);


        // Mostrando día y horario de la promoción de verano
        System.out.println("\n5.d) ----------------------------------");
        System.out.println("** Promoción de verano");
        System.out.println("Fecha desde: " + Verano.getFechaDesde());
        System.out.println("Fecha hasta: " + Verano.getFechaHasta());
        System.out.println("Hora desde: " + Verano.getHoraDesde());
        System.out.println("Hora hasta: " + Verano.getHoraHasta());


    }
}