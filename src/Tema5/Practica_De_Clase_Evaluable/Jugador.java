package Tema5.Practica_De_Clase_Evaluable;

import java.util.Objects;

public abstract class Jugador {


    // Atributos privados
    private int id; // (int): identificador único del jugador
    private String alias; // (String): nombre o apodo usado en el juego.
    private String nombre; // (String): nombre o apodo usado en el juego.
    private int puntos; // (int): puntuación acumulada en el torneo.

    // Constructor parametrizado
    public Jugador(int id,  String nombre, String alias, int puntos) {
        this.id = id;
        this.alias = alias;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // toString con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id=").append(id);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    // Equals por id


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id && puntos == jugador.puntos && Objects.equals(alias, jugador.alias) && Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alias, nombre, puntos);
    }

    // addPuntos(int puntos) : incrementa los puntos obtenidos por el jugador en una
    //partida.

    public void addPuntos(int puntos){
        this.puntos += puntos;
    }

    // Método abstracto imprimirRol() : devuelve un String con el rol o tipo de jugador
    //(según su especialización).

    public abstract String imprimirRol();


}
