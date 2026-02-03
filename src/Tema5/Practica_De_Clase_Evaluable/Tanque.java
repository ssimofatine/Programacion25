package Tema5.Practica_De_Clase_Evaluable;

public class Tanque extends Jugador {

    /**
     * Representa un jugador especializado en absorber daño y proteger al equipo.
     * Nuevos atributos (privados):
     * defensaPromedio (double): cantidad media de daño bloqueado por partida.
     * dañoRecibido (double): daño promedio recibido por partida.
     * Métodos:
     * Constructor que llama al de la clase padre.
     * Getters y setters.
     * imprimirDatos() : imprime los datos comunes y los específicos del rol.
     * imprimirRol() : devuelve “Tanque”.
     */

    // Atributos privados
    // Representa un jugador especializado en absorber daño y proteger al equipo.
    private double defensaPromedio; //defensaPromedio (double): cantidad media de daño bloqueado por partida.
    private double danoRecibido; // dañoRecibido (double): daño promedio recibido por partida.

    // Constructor que llama al de la clase padre.

    public Tanque(int id, String nombre, String alias, int puntos, double defensaPromedio, double danoRecibido) {
        super(id, nombre, alias, puntos);
        this.defensaPromedio = defensaPromedio;
        this.danoRecibido = danoRecibido;
    }


    // Getters y Setters


    public double getDefensaPromedio() {
        return defensaPromedio;
    }

    public void setDefensaPromedio(double defensaPromedio) {
        this.defensaPromedio = defensaPromedio;
    }

    public double getDanoRecibido() {
        return danoRecibido;
    }

    public void setDanoRecibido(double danoRecibido) {
        this.danoRecibido = danoRecibido;
    }

    // toString con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tanque{");
        sb.append("defensaPromedio=").append(defensaPromedio);
        sb.append(", danoRecibido=").append(danoRecibido);
        sb.append('}');
        return sb.toString();
    }


    //imprimirDatos() : imprime los datos comunes y los específicos del rol.

    public void imprimirDatos(){

    }




    //imprimirRol() : devuelve “Tanque”

    public String imprimirRol(){
        return "Tanque"; // devuelve “Tanque” y ya esta
    }

}
