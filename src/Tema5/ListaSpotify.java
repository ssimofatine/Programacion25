package Tema5;
import java.util.ArrayList;

public class ListaSpotify {

    private String nombre;
    private ArrayList<Cancion> canciones;

    //Constructor parametrizado

    public ListaSpotify(String nombre, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }


    //Constructor copia

    public ListaSpotify(ListaSpotify listaSpotify) {
        this.nombre = listaSpotify.nombre;
        this.canciones = listaSpotify.canciones;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }


    //ToString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListaSpotify{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", canciones=").append(canciones);
        sb.append('}');
        return sb.toString();
    }


    //Añadir canción




    //Eliminar canción


}
