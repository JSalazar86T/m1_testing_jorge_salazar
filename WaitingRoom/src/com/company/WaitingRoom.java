package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class WaitingRoom {


//    public  boolean Exists() {
//        return exists;
//    }

    //static boolean exists = false;
    //public static Object iter;

    public WaitingRoom() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Visitante> visitantes = new ArrayList<>();
        Visitante visitanteDefault = new Visitante("45326521D", "Agapito", "Moreno", 1957, true, false);
        visitantes.add(visitanteDefault);

        while (true) {

            //out.println();("Elige una opción");
            out.println("1. Registra a un nuevo visitante");
            out.println("2. Consulta quién está en la sala");
            out.println("3. Corrige algún dato");
            out.println("4. Registra una salida");
            out.println("5. ¿Está ya la sala vacía?");
            out.println("6. Cerrar sesión");

            int opcion = scanner.nextInt();
            if (opcion == 1) {

                out.println("Introduce el DNI/NIE o Pasaporte");
                String dni = scanner.next();
                out.println("Introduce nombre(s)");
                String nombre = scanner.next();
                out.println("Introduce apellidos(s)");
                String apellido = scanner.next();
                out.println("Cotejando con Base de Datos");
                boolean antecedentes = scanner.nextBoolean();
                boolean violencia = scanner.nextBoolean();
                if (antecedentes == false) {
                    out.println("El visitante no tiene antecedentes penales. No se requieren precauciones de vigilancia extra");
                } else {
                    out.println("Este visitante tiene antecedentes penales. El sistema informará al personal");
                }
                if (violencia == true)
                    out.println("Este visitante tiene antecedentes violentos. Se extremarán las precauciones");
            } else if (opcion == 2) {
                if (!visitantes.isEmpty()) {
                    out.println("Actualmente hay en la sala " + visitantes.size());
                } else {
                    out.println("La sala está vacía");
                }
            } else if (opcion == 3) {
                out.println("Introduce los datos que quieras modificar");
                out.println("Introduce el DNI guardado");
                String dni = scanner.next();
                exists = true;
                out.println("Introduce nombre del visitante para actualizar sus datos");
                String nombre = scanner.next();
                out.println("Introduce apellidos del visitante");
                String apellido = scanner.next();
                out.println("Introduce año de nacimiento");
                Integer year = scanner.nextInt();
            } else if (opcion == 4) {
                out.println("Introduce el DNI del visitante que quieres borrar");
                String dni = scanner.next();
                exists = false;
                iter = visitantes.iterator();
                while (iter.hasNext()) {
                    visitanteDefault = (Visitante).iter.next();
                    if (visitanteDefault.dni.equals(dni)) {
                        iter.remove();
                        exists = true;
                        out.println();
                    }


                }

            } else if (opcion == 5) {
                out.println("Si la sala está vacía, pulsa 7");
            }
            if (opcion == 7) {
                visitantes.clear();
                return;
            }
            if (opcion == 6) {
                out.println("La sesión se está cerrando");
                out.println("Tu sesión está cerrada. Disfruta del día");
                scanner.close();
                return;
            }
//                }
//
//
//
//
//                if (opcion == ) {
//
//                }
//
//
//                }
//                    break;
//                    default:
//                        throw new IllegalStateException("Unexpected value: " + opcion);

        }
    }

}
