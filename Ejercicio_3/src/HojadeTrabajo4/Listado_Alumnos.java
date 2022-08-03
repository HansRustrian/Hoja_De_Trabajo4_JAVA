
package HojadeTrabajo4;

import java.util.ArrayList;
import java.util.Scanner;


public class Listado_Alumnos {
    
    public void Menu_inicial() {
        Scanner sca = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("*             INTECAP             *");
        System.out.println("*---------------------------------*");
        System.out.println("*   INGRESO DE ALUMNOS AL SISTEMA *");
        System.out.println("*   DE FORMA MANUAL POR CONCEPTO  *");
        System.out.println("*   DE COBRO DE MENSUALIDAD 2022  *");
        System.out.println("*---------------------------------*");
        System.out.println("* 1. ADICIONAR ALUMNOS NUEVOS     *");
        System.out.println("* 5. SALIR DEL SISTEMA            *");
        System.out.println("***********************************");

        int elige = sca.nextInt();
        if (elige == 5) {
            System.out.println("¡Vuelva pronto!");
            System.exit(0);
        } else if (elige == 1) {
            System.out.println("");
        } else {
            System.out.println("Opcion solicitada no valida, intente de nuevo");
            Menu_inicial();
        }

    }

    public void rutina() {
        Alumnos al = new Alumnos();
        ArrayList<Alumnos> student = new ArrayList<>();
        String opcion = "N";
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (opcion.equals("N")) {
                Scanner enteros = new Scanner(System.in);
                Scanner cadenas = new Scanner(System.in);

                System.out.println("Ingrese el Numero de Carnet");
                int carnet = enteros.nextInt();
                al.setCarnet(carnet);
                System.out.println("Ingrese Nombre de Alumno");
                String nombre = cadenas.nextLine();
                al.setNombre(nombre);
                System.out.println("Ingrese el Grado");
                String grado = cadenas.nextLine();
                al.setGrado(grado);
                System.out.println("Ingrese la edad");
                int edad = enteros.nextInt();
                al.setEdad(edad);
                System.out.println("Ingrese el telefono del alumno");
                int telefono = enteros.nextInt();
                al.setTelefono(telefono);
                student.add(al);

            } else {
                System.out.println("");
                System.out.println("*********************************");
                System.out.println("* LISTADO DE ALUMNOS INGRESADOS *");
                System.out.println("*********************************");
                System.out.println("");
                int i = 0;
                for (Alumnos display : student) {
                    i++;
                    System.out.println("Alumno # "+i);
                    System.out.println("NUMERO DE CARNET : "+display.carnet+" NOMBRE ALUMNO : "+display.nombre);
                    System.out.println("|-------------------------------------------------------------------------|");
                    System.out.println("|GRADO              | "+display.grado);
                    System.out.println("|EDAD               | "+display.edad);
                    System.out.println("|NUMERO DE CELULAR  | "+display.telefono);
                    System.out.println("|-------------------------------------------------------------------------|");
                    System.out.println("");

                }

                System.out.println("¡Vuelva pronto!");
                System.exit(0);

            }
            
            System.out.println("");
            System.out.println("¿Desea salir del ciclo? S/N");
            opcion = sc.nextLine();
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        Listado_Alumnos lu = new Listado_Alumnos();

        lu.Menu_inicial();
        lu.rutina();
    }
    
}
