package com.company;

import com.company.Visitante;

import java.util.*;


public class PruebaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Visitante> visitantes = new ArrayList<>();
        Visitante visitanteDefault = new Visitante("45326521D", "Agapito", "Moreno", 1957, true, false);
        visitantes.add(visitanteDefault);


        boolean existe = false;
        try {

            while (true) {

                //System.out.println();("Elige una opción");
                System.out.println("1. Registra a un nuevo visitante");
                System.out.println("2. Consulta quién está en la sala");
                System.out.println("3. Corrige algún dato");
                System.out.println("4. Registra una salida");
                System.out.println("5. ¿Está ya la sala vacía?");
                System.out.println("6. Cerrar sesión");
                System.out.println("Elija su opcion");
                int opcion = sc.nextInt();
                if (opcion == 1) {

                    System.out.println("Introduce el DNI/NIE o Pasaporte");
                    String dni = sc.next();
                    System.out.println("Introduce nombre(s)");
                    String nombre = sc.next();
                    System.out.println("Introduce apellidos(s)");
                    String apellido = sc.next();
                    System.out.println("Cotejando con Base de Datos");
                    boolean antecedentes = sc.nextBoolean();
                    boolean violencia = sc.nextBoolean();
                    if (antecedentes == false) {
                        System.out.println("El visitante no tiene antecedentes penales. No se requieren precauciones de vigilancia extra");
                    } else {
                        System.out.println("Este visitante tiene antecedentes penales. El sistema informará al personal");
                    }
                    if (violencia == true)
                        System.out.println("Este visitante tiene antecedentes violentos. Se extremarán las precauciones");


                } else if (opcion == 2) {

                    if (!visitantes.isEmpty()) {
                        System.out.println("Actualmente hay en la sala " + visitantes.size());
                    } else {
                        System.out.println("La sala está vacía");
                    }

                } else if (opcion == 3) {
                    System.out.println("Introduce los datos que quieras modificar");
                    System.out.println("Introduce el DNI guardado");
                    String dni = sc.next();
                    existe = true;
                    System.out.println("Introduce nombre del visitante para actualizar sus datos");
                    String nombre = sc.next();
                    System.out.println("Introduce apellidos del visitante");
                    String apellido = sc.next();
                    System.out.println("Introduce año de nacimiento");
                    Integer year = sc.nextInt();
             /*else if (opcion == 4) {
                System.out.println("Introduce el DNI del visitante que quieres borrar");
                String dni = sc.next();
                exists = false;
                iter = visitantes.iterator();
                while (iter.hasNext()) {
                    visitanteDefault = (Visitante).iter.next();
                    if (visitanteDefault.dni.equals(dni)) {
                        iter.remove();
                        exists = true;
                        System.out.println();
                    }


                }*/


                } else if (opcion == 5) {
                    System.out.println("Si la sala está vacía, pulsa 7");
                } else if (opcion == 7) {
                    visitantes.clear();
                    return;
                }
                if (opcion == 6) {
                    System.out.println("La sesión se está cerrando");
                    System.out.println("Tu sesión está cerrada. Disfruta del día");

                    return;
                }
                sc.close();

            }



        } catch (Exception e) {
            e.printStackTrace();
        } catch (InputMismatchException in) {
            in.printStackTrace();
        } finally {
            System.out.println("LE ha salido un error");
        }


    }

}






