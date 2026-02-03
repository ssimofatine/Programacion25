package Tema5.Practica_De_Clase_Evaluable;

public class Asesino extends Jugador{
    /**
     * Representa al jugador ofensivo, centrado en infligir daño y eliminar oponentes.
     * Nuevos atributos (privados):
     * precisionPromedio (float): nivel medio de acierto en ataques.
     * bajasPorPartida (int): número promedio de eliminaciones por encuentro.
     * Métodos:
     * Constructor que llama al de la clase padre.
     * Getters y setters.
     * toString() : imprime los datos del jugador y los particulares del rol.
     * imprimirRol() : devuelve “Asesino”.
     */

    // Atributos privados
    private float precisionPromedio;
    private int bajasPorPartida;

    // Constructor que llama al de la clase padre. (extends Jugador)

    public Asesino(int id, String nombre, String alias, int puntos, float precisionPromedio, int bajasPorPartida) {
        super(id, nombre, alias, puntos);
        this.precisionPromedio = precisionPromedio;
        this.bajasPorPartida = bajasPorPartida;
    }


    // Getters y setters.

    public float getPrecisionPromedio() {
        return precisionPromedio;
    }

    public void setPrecisionPromedio(float precisionPromedio) {
        this.precisionPromedio = precisionPromedio;
    }

    public int getBajasPorPartida() {
        return bajasPorPartida;
    }

    public void setBajasPorPartida(int bajasPorPartida) {
        this.bajasPorPartida = bajasPorPartida;
    }

    // toString() : imprime los datos del jugador y los particulares del rol.

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asesino{");
        sb.append("precisionPromedio=").append(precisionPromedio);
        sb.append(", bajasPorPartida=").append(bajasPorPartida);
        sb.append('}');
        return sb.toString();
    }


    //imprimirRol() : devuelve “Asesino”.

    public String imprimirRol(){
        return "Asesino"; // devuelve “Asesino” y ya esta
    }
}
