package org.example;

import org.example.entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Set;

public class Main {

    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");
    public static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        System.out.println("EntityManagerFactory creado");

        try {

            // Unidades de Medida
            em.getTransaction().begin();
            UnidadMedida ochoPorciones = UnidadMedida.builder()
                    .denominacion("porciones")
                    .build();
            em.persist(ochoPorciones);
            em.getTransaction().commit();

            em.getTransaction().begin();
            UnidadMedida cuatroPorciones = UnidadMedida.builder()
                    .denominacion("porciones")
                    .build();
            em.persist(cuatroPorciones);
            em.getTransaction().commit();

            em.getTransaction().begin();
            UnidadMedida unLitro = UnidadMedida.builder()
                    .denominacion("litros")
                    .build();
            em.persist(cuatroPorciones);
            em.getTransaction().commit();

            // Imagenes
            em.getTransaction().begin();
            Imagen imagen1 = Imagen.builder().denominacion("Pizza Grande Hawaiana").build();
            em.persist(imagen1);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen2 = Imagen.builder().denominacion("Pizza Grande Napolitana").build();
            em.persist(imagen2);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen3 = Imagen.builder().denominacion("Pizza Grande Muzzarella").build();
            em.persist(imagen3);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen4 = Imagen.builder().denominacion("Pizza Chica Hawaiana").build();
            em.persist(imagen4);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen5 = Imagen.builder().denominacion("Pizza Chica Napolitana").build();
            em.persist(imagen5);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen6 = Imagen.builder().denominacion("Pizza Chica Muzzarella").build();
            em.persist(imagen6);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen7 = Imagen.builder().denominacion("Cerveza Andes").build();
            em.persist(imagen7);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imagen8 = Imagen.builder().denominacion("Cerveza Quilmes").build();
            em.persist(imagen8);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imaHappy1 = Imagen.builder().denominacion("Happy Hour").build();
            em.persist(imaHappy1);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen imaHappy2 = Imagen.builder().denominacion("Happy Hour").build();
            em.persist(imaHappy2);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen verano1 = Imagen.builder().denominacion("Verano").build();
            em.persist(verano1);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen verano2 = Imagen.builder().denominacion("Verano").build();
            em.persist(verano2);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen invierno1 = Imagen.builder().denominacion("Invierno").build();
            em.persist(invierno1);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen invierno2 = Imagen.builder().denominacion("Invierno").build();
            em.persist(invierno2);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen cerveza1 = Imagen.builder().denominacion("Cerveza Andes").build();
            em.persist(cerveza1);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Imagen cerveza2 = Imagen.builder().denominacion("Cerveza Quilmes").build();
            em.persist(cerveza2);
            em.getTransaction().commit();

            // ARTICULOS

            em.getTransaction().begin();
            Articulo pizzaGrandeHawaiana = Articulo.builder().denominacion("Pizza Grande Hawaiana")
                    .precioVenta(5500.0)
                    .precioCompra(3500.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(ochoPorciones)
                    .imagen(imagen1)
                    .build();
            em.persist(pizzaGrandeHawaiana);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo pizzaChicaHawaiana = Articulo.builder().denominacion("Pizza Chica Hawaiana")
                    .precioVenta(3500.0)
                    .precioCompra(2500.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(cuatroPorciones)
                    .imagen(imagen4)
                    .build();
            em.persist(pizzaChicaHawaiana);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo pizzaGrandeNapolitana = Articulo.builder().denominacion("Pizza Grande Napolitana")
                    .precioVenta(5500.0)
                    .precioCompra(3500.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(ochoPorciones)
                    .imagen(imagen2)
                    .build();
            em.persist(pizzaGrandeNapolitana);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo pizzaChicaNapolitana = Articulo.builder().denominacion("Pizza Chica Napolitana")
                    .precioVenta(3500.0)
                    .precioCompra(2500.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(cuatroPorciones)
                    .imagen(imagen5)
                    .build();
            em.persist(pizzaChicaNapolitana);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo pizzaGrandeMuzzarella = Articulo.builder().denominacion("Pizza Grande Muzzarella")
                    .precioVenta(5500.0)
                    .precioCompra(3500.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(ochoPorciones)
                    .imagen(imagen3)
                    .build();
            em.persist(pizzaGrandeMuzzarella);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo pizzaChicaMuzzarella = Articulo.builder().denominacion("Pizza Chica Muzzarella")
                    .precioVenta(3500.0)
                    .precioCompra(2500.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(cuatroPorciones)
                    .imagen(imagen6)
                    .build();
            em.persist(pizzaChicaMuzzarella);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo cervezaAndes = Articulo.builder().denominacion("Cerveza Andes")
                    .precioVenta(1500.0)
                    .precioCompra(1000.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(unLitro)
                    .imagen(cerveza1)
                    .build();
            em.persist(cervezaAndes);
            em.getTransaction().commit();

            em.getTransaction().begin();
            Articulo cervezaQuilmes = Articulo.builder().denominacion("Cerveza Quilmes")
                    .precioVenta(1500.0)
                    .precioCompra(1000.0)
                    .stockActual(25)
                    .stockMaximo(50)
                    .unidadMedida(unLitro)
                    .imagen(cerveza2)
                    .build();
            em.persist(cervezaQuilmes);
            em.getTransaction().commit();

            // PROMOCIONES
            em.getTransaction().begin();
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
            em.persist(happyHour);
            em.getTransaction().commit();

            em.getTransaction().begin();
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
            em.persist(verano);
            em.getTransaction().commit();

            em.getTransaction().begin();
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
                    .promoImagen(Set.of(invierno1, invierno2))
                    .articulos(Set.of(pizzaGrandeHawaiana, pizzaChicaMuzzarella, cervezaQuilmes))
                    .build();
            em.persist(invierno);
            em.getTransaction().commit();

            /*// Mostrando las promociones
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
*/
        }catch (Exception e){

            em.getTransaction().rollback();
            System.out.println(e.getMessage());
            System.out.println("Salí por el catch");
        }

        // Cerrar el EntityManager y el EntityManagerFactory
        em.close();
        emf.close();
    }

    /*public static void mostrarArticulosDePromocion(Long id) {
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
    }*/


}



