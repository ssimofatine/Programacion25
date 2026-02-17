package Tema6.Alquiler_de_Coches.Informacion_basica_del_curso;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class curso {

    /**
     * Parte 1: Información básica del curso (LocalDate)
     * Crea una clase Curso con los siguientes atributos:
     *
     * Nombre del curso
     * Fecha de inicio (LocalDate)
     * Fecha de fin (LocalDate)
     */

    // Atributos privados
    private String nombreCurso;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;


    // Constructor

    public curso(String nombreCurso, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombreCurso = nombreCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    // toString con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("curso{");
        sb.append("nombreCurso='").append(nombreCurso).append('\'');
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }


    // Calcular la duración del curso en días, meses y años usando Period
    public Period calcularDuracion() {
        return Period.between(fechaInicio, fechaFin);
    }





    //Comprobar si el curso está activo en una fecha determinada
    public boolean estaActivo(LocalDate fecha) {
        if (fecha.isEqual(fechaInicio) || fecha.isEqual(fechaFin)) {
            return true;
        }
        if (fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFin)) {
            return true;
        }
        return false;
    }





    //Calcular cuántos días faltan para que comience el curso (si aún no ha empezado) o cuántos días han pasado desde que comenzó
    public long diasParaEmpezar() {
        LocalDate hoy = LocalDate.now();
        if (hoy.isBefore(fechaInicio)) {
            return hoy.until(fechaInicio, ChronoUnit.DAYS);
            } else {
            return hoy.until(fechaInicio, ChronoUnit.DAYS);
        }
    }





}
