package HojadeTrabajo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Listado_Usuarios {

    public void Menu_inicial() {
        Scanner sca = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("*       BANCO INTERNACIONAL       *");
        System.out.println("*---------------------------------*");
        System.out.println("*  INGRESO DE CLIENTES AL SISTEMA *");
        System.out.println("*   DE FORMA MANUAL POR CONCEPTO  *");
        System.out.println("*   DE COBRO DE MANEJO DE CUENTA  *");
        System.out.println("*---------------------------------*");
        System.out.println("* 1. ADICIONAR CLIENTES NUEVOS    *");
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
        ArrayList<Clientes> user = new ArrayList<>();
        String opcion = "N";
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (opcion.equals("N")) {
                Scanner enteros = new Scanner(System.in);
                Scanner cadenas = new Scanner(System.in);

                System.out.println("Ingrese el Codigo de Cliente");
                int cod = enteros.nextInt();
                System.out.println("Ingrese Nombre de Cliente");
                String nombre = cadenas.nextLine();
                System.out.println("Ingrese el tipo de cuenta (Monetarios o Ahorros)");
                String tipo = cadenas.nextLine();
                System.out.println("Ingrese el numero de cuenta");
                int cuenta = enteros.nextInt();
                System.out.println("Ingrese el telefono del cliente");
                int telefono = enteros.nextInt();

                user.add(new Clientes(cod, nombre, tipo, cuenta, telefono));
            } else {
                System.out.println("");
                System.out.println("********************************");
                System.out.println("*LISTADO DE CLIENTES INGRESADOS*");
                System.out.println("********************************");
                System.out.println("");
                int i = 0;
                for (Clientes display : user) {
                    i++;
                    System.out.println("Cliente # "+i);
                    System.out.println("CODIGO DE CLIENTE : "+display.codigo_cliente+" NOMBRE : "+display.nombre);
                    System.out.println("|-------------------------------------------------------------------------|");
                    System.out.println("|TIPO CUENTA        | "+display.tipo_Cta);
                    System.out.println("|NUMERO DE CUENTA   | "+display.no_cta);
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
        Listado_Usuarios lu = new Listado_Usuarios();

        lu.Menu_inicial();
        lu.rutina();
    }

}
