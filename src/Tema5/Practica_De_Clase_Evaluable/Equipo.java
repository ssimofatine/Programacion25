package Tema5.Practica_De_Clase_Evaluable;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    public static final int Total_Puntos = 0;

    // Atributos es privados
    private String nombre; //nombre (String): nombre del equipo.
    private String pais; //pais (String): país de origen.
    private Integer totalPuntos; //totalPuntos (tipo int): representa la suma total de los puntos conseguidos por los jugadores del equipo.
    private List<Jugador> jugadores = new ArrayList<>(); // Una lista que almacena a los jugadores inscritos en el equipo.

    // Constructor

    public Equipo(String nombre, String pais, List<Jugador> jugadores, Integer totalPuntos) {
        this.nombre = nombre;
        this.pais = pais;
        this.jugadores = jugadores;
        this.totalPuntos = Total_Puntos;
    }

    // Getters y setters para cada atributo.


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(Integer totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    // toString con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", totalPuntos=").append(totalPuntos);
        sb.append(", jugadores=").append(jugadores);
        sb.append('}');
        return sb.toString();
    }


    // imprimirDatosEquipo() : imprime el nombre, país y total de puntos del equipo.

    public void imprimirDatosEquipo(){
        System.out.println("Este Datos del Equipo: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Pais: " + this.pais);
        System.out.println("Total Puntos: " + this.totalPuntos);

    }

    //nuevoJugador() : añade un nuevo jugador al equipo.

    public void nuevoJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    // calcularTotalPuntos() : actualiza el atributo totalPuntos sumando los puntos de
    //todos los jugadores del equipo.

    public void calcularTotalPuntos(){

        // in ArrayList usar .size para mustra a todos jugadures y ya esta
        this.totalPuntos += this.jugadores.size();
    }

    //listarJugadores() : muestra los nombres (o alias) de todos los jugadores que forman
    //parte del equipo junto con la puntuación de cada uno

    public void listarJugadores(){
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre Jugador es: " + this.nombre + " Y puntuación es: " + this.totalPuntos);
        }
    }

    // buscarJugadorPorId(int id) : busca y muestra los datos de un jugador según su
    //identificador. Si no existe, se mostrará un mensaje apropiado.

    public void buscarJugadorPorId(int id){
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                System.out.println("Nombre Jugador es: " + this.nombre + " Pais es: " + this.pais + " Y puntuación es: " + this.totalPuntos);
            } else if (jugador.getId() != id) {
                System.out.println("El jugador no existe y no tiene identificador");
            }else {
                System.out.println("Lo Siento No Entiende Nada");
            }
        }


        //Otro Metodo.

        /**
         * for (int i = 0; i < jugadores.size() ; i++) {
         *             jugadores.get(i);
         *             if (jugadores.get(i).getId() == id) {
         *                 System.out.println("Nombre Jugador es: " + this.nombre + " Pais es: " + this.pais + " Y puntuación es: " + this.totalPuntos);
         *             }else if (jugadores.get(i).getId() != id) {
         *                 System.out.println("El jugador no existe y no tiene identificador");
         *             }else {
         *                 System.out.println("Lo Siento No Entiende Nada");
         *             }
         *         }
         */
    }



}
