package Tema6.Alquiler_de_Coches.Practica_en_grupo;
import java.util.ArrayList;
public class Sala {
    /**
     * Representa una sala de la mazmorra con enemigos.
     *
     * Atributos:
     *
     * int numeroSala
     * ArrayList<Enemigo> enemigos
     * boolean completada
     * Constructor:
     *
     * Recibe el número de sala
     * Genera enemigos aleatorios según la dificultad:
     * Salas 1-2: 2-3 Goblins
     * Salas 3-4: 1-2 Orcos + 1 Goblin
     * Sala 5 (JEFE): 1 Dragón + 2 Orcos
     * Métodos:
     *
     * void generarEnemigos(): crea los enemigos de la sala
     * boolean todosEnemigosmuertos(): verifica si no quedan enemigos vivos
     * ArrayList<Enemigo> getEnemigosVivos(): devuelve solo los enemigos con vida
     * toString que muestre los enemigos
     */

    private int numeroSala;
    private ArrayList<Enemigo> enemigos;
    private boolean completada;
}
