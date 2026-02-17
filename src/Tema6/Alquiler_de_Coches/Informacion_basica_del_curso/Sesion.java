package Tema6.Alquiler_de_Coches.Informacion_basica_del_curso;

import java.time.Duration;
import java.time.LocalTime;

public class Sesion {
    /**
     *
     *Parte 2: Gestión de horarios (LocalTime)
     * Crea una clase Sesion que represente una clase o sesión formativa con:
     *
     * Hora de inicio (LocalTime)
     * Hora de fin (LocalTime)
     * Implementa métodos para:
     *
     * Calcular la duración de la sesión usando Duration (en horas y minutos)
     * Comprobar si dos sesiones se solapan
     * Calcular el tiempo de descanso entre dos sesiones consecutivas
     *
     */

    // Atributos privados
    private LocalTime horaInicio;
    private LocalTime horaFin;

    // Constructor para todo

    public Sesion(LocalTime horaInicio, LocalTime horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Getters y Stters


    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    // toString con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sesion{");
        sb.append("horaInicio=").append(horaInicio);
        sb.append(", horaFin=").append(horaFin);
        sb.append('}');
        return sb.toString();
    }

    // Calcular la duración de la sesión usando Duration (en horas y minutos)

    public Duration duracion(){
        Duration duracion = Duration.between(horaInicio, horaFin);
        return duracion;

    }

    // Comprobar si dos sesiones se solapan

    public boolean sesiones(Sesion sesiones1){
        return horaInicio.isBefore(sesiones1.horaFin) && horaFin.isAfter(sesiones1.horaInicio);
    }

    // Calcular el tiempo de descanso entre dos sesiones consecutivas

    public Duration descanso(Sesion sesiones2){
        Duration duracion = Duration.between(horaFin, sesiones2.horaInicio);
        return duracion;

    }

}
