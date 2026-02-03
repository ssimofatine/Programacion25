package Tema5.Practica_De_Clase_Evaluable;

import java.util.Scanner;
import java.util.ArrayList; // Importar ArrayList para inicializar la lista de jugadores

public class prueba {
    /**
     * En el método main , se debe:
     * 1. Crear un equipo.
     * 2. Añadir jugadores de diferentes tipos (Tanque, Apoyo, Asesino).
     * 3. Permitir al usuario interactuar mediante un menú con las siguientes opciones:
     * - Imprimir datos del equipo
     * - Añadir un jugador (se piden sus datos)
     * - Añadir puntos a un jugador tras una partida (id, puntos)
     * - Calcular el total de puntos del equipo
     * - Listar todos los jugadores
     * - Buscar un jugador (por identificador)
     * - Salir
     */
    public static int totalJugador(){
        System.out.println("Hola Jugadores :)");
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre,pais;
        int sumaJugadores = 0;

        System.out.println("----------Tu Nombre-------------");
        System.out.println("Ingrese el nombre del equipo");
        nombre = sc.nextLine();
        System.out.println("----------Tu Pis-------------");
        System.out.println("Ingrese el pais del equipo");
        pais = sc.nextLine();

        // Crear un equipo
        Equipo equipo = new Equipo(nombre, pais, new ArrayList<>(), Equipo.Total_Puntos);

        // Añadir jugadores de diferentes tipos (Tanque, Apoyo, Asesino)

        // Jugador Asesino
        String nombre1, alias;
        int id, puntos, preicion, bajas;
        System.out.println("----------Nombre jugador-------------");
        System.out.println("Ingrese el nombre del jugador");
        nombre1 = sc.nextLine();
        System.out.println("----------Tu Alias-------------");
        System.out.println("Ingrese el alias del jugador");
        alias = sc.nextLine();
        System.out.println("----------Tu Id-------------");
        System.out.println("Ingrese el Id del jugador");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Puntos-------------");
        System.out.println("Ingrese el Puntos del jugador");
        puntos = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Precision-------------");
        System.out.println("Ingrese el Precision del jugador");
        preicion = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Bajas-------------");
        System.out.println("Ingrese el Bajas del jugador");
        bajas = Integer.parseInt(sc.nextLine());

        // limpia scanner
        sc.nextLine();

        Asesino asesino1 = new Asesino(id, nombre1, alias, puntos, preicion, bajas);
        equipo.nuevoJugador(asesino1);

        // Jugador Tanque
        String nombre2, alias1;
        int id1, puntos1, preicion1, bajas1;
        System.out.println("----------Nombre jugador Tanque-------------");
        System.out.println("Ingrese el nombre del jugador Tanque");
        nombre2 = sc.nextLine();
        System.out.println("----------Tu Alias-------------");
        System.out.println("Ingrese el alias del jugador Tanque");
        alias1 = sc.nextLine();
        System.out.println("----------Tu Id-------------");
        System.out.println("Ingrese el Id del jugador");
        id1 = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Puntos-------------");
        System.out.println("Ingrese el Puntos del jugador Tanque");
        puntos1 = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Precision-------------");
        System.out.println("Ingrese el Precision del jugador Tanque");
        preicion1 = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Bajas-------------");
        System.out.println("Ingrese el Bajas del jugador Tanque");
        bajas1 = Integer.parseInt(sc.nextLine());
        // limpia scanner
        sc.nextLine();

        Tanque tanque1 = new Tanque(id1, nombre2, alias1, puntos1, preicion1, bajas1);
        equipo.nuevoJugador(tanque1);

        // Jugador Apoyo
        String nombre3, alias2;
        int id2, puntos2, preicion2, bajas2;

        System.out.println("----------Nombre jugador Apoyo-------------");
        System.out.println("Ingrese el nombre del jugador Apoyo");
        nombre3 = sc.nextLine();
        System.out.println("----------Tu Alias-------------");
        System.out.println("Ingrese el alias del jugador Apoyo");
        alias2 = sc.nextLine();
        System.out.println("----------Tu Id-------------");
        System.out.println("Ingrese el Id del jugador");
        id2 = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Puntos-------------");
        System.out.println("Ingrese el Puntos del jugador Apoyo");
        puntos2 = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Precision-------------");
        System.out.println("Ingrese el Precision del jugador Apoyo");
        preicion2 = Integer.parseInt(sc.nextLine());
        System.out.println("----------Tu Bajas-------------");
        System.out.println("Ingrese el Bajas del jugador Apoyo");
        bajas2 = Integer.parseInt(sc.nextLine());
        Apoyo apoyo1 = new Apoyo(id2, nombre3, alias2, puntos2, preicion2, bajas2);

        equipo.nuevoJugador(apoyo1);

        // Ahora muestra datos del equipo
        equipo.imprimirDatosEquipo();

        // Añadir un jugador
        System.out.println("Jugadores añadidos al equipo: " + equipo.getNombre());
        for (Jugador j : equipo.getJugadores()) {
            System.out.println("- " + j.getAlias() + " (" + j.imprimirRol() + ")");
        }

        // Aqui Menu
        boolean salir = true;
        int s;
        try {
            do {
                System.out.println(" 1. Imprimir datos del equipo ");
                System.out.println(" 2. Añadir un jugador ");
                System.out.println(" 3. Añadir puntos a un jugador tras una partida ");
                System.out.println(" 4. Calcular el total de puntos del equipo");
                System.out.println(" 5. Listar todos los jugadores");
                System.out.println(" 6. Buscar un jugador (por identificador)");
                System.out.println(" 7. Salir");
                s = Integer.parseInt(sc.nextLine());
                switch (s) {
                    case 1:
                        equipo.imprimirDatosEquipo();
                        salir = false;
                        break;
                    case 2:
                        System.out.println("Jugadores añadidos al equipo: " + equipo.getNombre());
                        for (Jugador j : equipo.getJugadores()) {
                            System.out.println("- " + j.getAlias() + " (" + j.imprimirRol() + ")");
                        }
                        salir = false;
                        break;
                    case 3:
                        System.out.println("Jugadores añadidos al equipo: " + equipo.getNombre());
                        for (Jugador j : equipo.getJugadores()) {
                            System.out.println("- " + j.getAlias() + "(" + j.imprimirRol() + ")");
                            System.out.println("Ingrese el Id del jugador: ");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println("Ingrese el Puntos del jugador: ");
                            puntos = Integer.parseInt(sc.nextLine());
                            j.addPuntos(puntos);
                            System.out.println("Puntos añadidos al jugador " + j.getAlias() + " ");
                        }
                        salir = false;
                        break;
                    case 4:
                        equipo.calcularTotalPuntos();
                        System.out.println("El total de puntos del equipo es: " + equipo.getTotalPuntos());
                        salir = false;
                        break;
                    case 5:
                        equipo.listarJugadores();
                        salir = false;
                        break;
                    case 6:
                        System.out.println("Jugadores añadidos al equipo: ");
                        for (Jugador j : equipo.getJugadores()){
                            System.out.println("- " + j.getAlias() + " (" + j.imprimirRol() + ")");
                            System.out.println("Ingrese el Id del jugador: ");
                            id = Integer.parseInt(sc.nextLine());
                        }
                        equipo.buscarJugadorPorId(id);
                        salir = false;
                        break;
                    case 7:
                        System.out.println("Gracias, Adios");
                        salir = false;
                        break;
                    default:
                        System.out.println("ERROR, Tu numero no es valido");
                        break;
                }
            }while (salir);

        }catch (NumberFormatException e){
            System.out.println("ERROR, Tu numero no es valido");
        }

    }
}
