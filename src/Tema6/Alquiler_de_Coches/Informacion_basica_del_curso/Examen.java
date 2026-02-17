package Tema6.Alquiler_de_Coches.Informacion_basica_del_curso;

import java.time.Duration;
import java.time.LocalDateTime;

public class Examen {
    /**
     * Parte 3: Eventos completos (LocalDateTime)
     * Crea una clase Examen con:
     *
     * Nombre del examen
     * Fecha y hora del examen (LocalDateTime)
     * Implementa métodos para:
     *
     * Mostrar cuánto tiempo falta para el examen (días, horas y minutos)
     * Comprobar si el examen ha pasado
     * Calcular el tiempo transcurrido desde que se realizó el examen
     */

    // Atributos privados
    private String nombreExamen;
    private LocalDateTime fechaHoraExamen;

    // Constructor para todo


    public Examen(String nombreExamen, LocalDateTime fechaHoraExamen) {
        this.nombreExamen = nombreExamen;
        this.fechaHoraExamen = fechaHoraExamen;
    }

    // Getters y Stters


    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public LocalDateTime getFechaHoraExamen() {
        return fechaHoraExamen;
    }

    public void setFechaHoraExamen(LocalDateTime fechaHoraExamen) {
        this.fechaHoraExamen = fechaHoraExamen;
    }

    // toString con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Examen{");
        sb.append("nombreExamen='").append(nombreExamen).append('\'');
        sb.append(", fechaHoraExamen=").append(fechaHoraExamen);
        sb.append('}');
        return sb.toString();
    }

    // Mostrar cuánto tiempo falta para el examen (días, horas y minutos)

    /**
     * public void falta(){
     *         LocalDateTime fecha = LocalDateTime.now();
     *         Duration duracion = Duration.between(fecha, fechaHoraExamen);
     *         long dias = duracion.toDays();
     *         long horas = duracion.toHours() % 24;
     *         long minutos = duracion.toMinutes() % 60;
     *         System.out.println("Faltan " + dias + " días, " + horas + " horas y " + minutos + " minutos para el examen");
     *     }
     */

    public void falta(){
        LocalDateTime fecha = LocalDateTime.now();
        Duration duracion = Duration.between(fecha, fechaHoraExamen);
        System.out.println("Faltan: " + duracion.toDays() + " dias, " + duracion.toHours() + " horas, " + duracion.toMinutes() + " minutos");
        boolean aprobado = false;
        if (duracion == Duration.ZERO) {
            System.out.println("pasado el examen");
            aprobado = true;
        } else if (duracion.isNegative()) {
            System.out.println("pasado el examen");

        }


    }


    // Comprobar si el examen ha pasado

    public boolean pasado(){
        LocalDateTime fecha = LocalDateTime.now();
        return fecha.isAfter(fechaHoraExamen);
    }

    // Calcular el tiempo transcurrido desde que se realizó el examen
    public Duration transcurrido(){
        LocalDateTime fecha = LocalDateTime.now();
        Duration duracion = Duration.between(fechaHoraExamen, fecha);
        return duracion;
    }



}
