package Tema5.Practica_De_Clase_Evaluable;

public class Apoyo extends Jugador {
    /**
     * Representa al jugador encargado de curar y asistir al resto del equipo.
     * Nuevos atributos (privados):
     * curacionesPorPartida (int): número medio de curaciones otorgadas en cada partida.
     * eficienciaAsistencia (float): eficacia global del jugador en asistencias (porcentaje).
     * Métodos:
     * Constructor que llama al de la clase padre.
     * Getters y setters.
     * toString() : imprime todos los datos heredados y específicos.
     * imprimirRol() : devuelve “Apoyo”.
     */

    // Atributos privados
    private int curacionesPorPartida;
    private float eficienciaAsistencia;

    // Constructor que llama al de la clase padre. (extends Jugador)

    public Apoyo(int id, String nombre, String alias, int puntos, int curacionesPorPartida, float eficienciaAsistencia) {
        super(id, nombre, alias, puntos);
        this.curacionesPorPartida = curacionesPorPartida;
        this.eficienciaAsistencia = eficienciaAsistencia;
    }


    // Getters y setters.


    public int getCuracionesPorPartida() {
        return curacionesPorPartida;
    }

    public void setCuracionesPorPartida(int curacionesPorPartida) {
        this.curacionesPorPartida = curacionesPorPartida;
    }

    public float getEficienciaAsistencia() {
        return eficienciaAsistencia;
    }

    public void setEficienciaAsistencia(float eficienciaAsistencia) {
        this.eficienciaAsistencia = eficienciaAsistencia;
    }

    // toString() : imprime todos los datos heredados y específicos.

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Apoyo{");
        sb.append("curacionesPorPartida=").append(curacionesPorPartida);
        sb.append(", eficienciaAsistencia=").append(eficienciaAsistencia);
        sb.append('}');
        return sb.toString();
    }


    //imprimirRol() : devuelve “Apoyo”.


    public String imprimirRol(){
        return "Apoyo"; // devuelve “Apoyo” y ya esta
    }
}
