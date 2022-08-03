package ejercicio_3;

import java.util.Scanner;

public class arrays {

    /*
    public void dos() {

       
        
        // DEFINIMOS ARRAY DE 2 DIMENSIONES INDICANDO QUE TIENE 5 FILAS Y 5 COLUMNAS
        int doble_dimension[][] = new int[5][5];
        // PARA LLENAR EL ARRAY ES IGUAL QUE UNO DE 1 DIMENSION
        doble_dimension[0][3] = 9;

        for (int i = 0; i < doble_dimension.length; i++) {
            for (int j = 0; j < doble_dimension[i].length; j++) {

                System.out.println(doble_dimension[i][j]);
        // otra forma de llenar arreglos : 
        
        int doble_dimension1 [] [] = {{2,4,6},{3,6,9},{4,8,12}};
        
        for (int k = 0; k < doble_dimension1.length; k++) {
            for (int l = 0; l < doble_dimension1[k].length; l++) {

                System.out.println(doble_dimension1[k][l]);
                   }

        }
            }

        }

    }

    public static void main(String[] args) {

        arrays a = new arrays();

        a.dos();

    }

     */
    // CREACION DE ARREGLO DE 3 X 5
    public void ejercicio_array() {

        int matriz[][] = new int[3][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Scanner sp = new Scanner(System.in);
                System.out.println("Ingrese un numero entero : ");
                int valor = sp.nextInt();
                matriz[i][j] = valor;
            }

        }

        System.out.println("Matriz 3x5: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        arrays ej = new arrays();

        ej.ejercicio_array();
 
    }

}
