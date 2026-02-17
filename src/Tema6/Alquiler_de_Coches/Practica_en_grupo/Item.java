package Tema6.Alquiler_de_Coches.Practica_en_grupo;

public class Item {
    //Atributos
    private String nombre;
    private TipoItem tipo;
    private int valorCuracion;

    //Constructor


    public Item(String nombre, TipoItem tipo, int valorCuracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorCuracion = valorCuracion;
    }

    /**
     *
     * Según el TipoItem:
     * POCION_PEQUENA: cura 30 puntos
     * POCION_GRANDE: cura 60 puntos
     * ELIXIR: cura completamente
     * @param heroe
     */



    // metodo void usar(Heroe heroe)
    public void usar(Heroe heroe){

    }

    // Getters


    public String getNombre() {
        return nombre;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public int getValorCuracion() {
        return valorCuracion;
    }

    // Tostring con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", valorCuracion=").append(valorCuracion);
        sb.append('}');
        return sb.toString();
    }
}
