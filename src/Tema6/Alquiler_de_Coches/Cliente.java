package Tema6.Alquiler_de_Coches;

import java.time.LocalDate;

public class Cliente extends Persona{
    // Atributos:
    private String licenciaConducir;
    private LocalDate fechaObtencionLicencia;

    // Constructor con todos los parámetros (incluyendo los de la clase padre)

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion, String telefono, String licenciaConducir, LocalDate fechaObtencionLicencia) {
        super(nombre, apellidos, dni, email, direccion, telefono);
        this.licenciaConducir = licenciaConducir;
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    // Constructor copia
    public Cliente(Cliente clinte){
        super(clinte.getNombre(),clinte.getApellidos(),clinte.getDni(),clinte.getEmail(),clinte.getDireccion(),clinte.getTelefono());
        this.licenciaConducir = clinte.licenciaConducir;
        this.fechaObtencionLicencia = clinte.fechaObtencionLicencia;
    }

    // Getters y setters


    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    // toString() (debe incluir el número de licencia de conducir y la fecha)


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append(", fechaObtencionLicencia=").append(fechaObtencionLicencia);
        sb.append('}');
        return sb.toString();
    }


}
