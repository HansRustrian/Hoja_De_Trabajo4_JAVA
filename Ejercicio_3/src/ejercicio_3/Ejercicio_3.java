package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        /*
        // ARRAIS : tipo_dato => nombre => [] => new => tipo_dato => [] => ;
        int numeros [] = new int[4];
        
        // asignando valores al array
        
        numeros[0] = 3;
        numeros[3] = 7;
        
        // DESPLEGANDO VALORES DE ARRELGO
        
        System.out.println(numeros[0]);
        
        // OTRO EJEMPLO: 
        
        String nombres [] = new String [5];
        
        nombres[4] = "Hans";
        
        System.out.println(nombres[4]);
        
        // OTRA FORMA DE LLENAR ARRAYS
        
        String nombre [] = {"Yanic","Byron","Blanca","Hans"};
        
        System.out.println(nombre[0]);
         */
        
        // GENERAR TABLAS DE MULTIPLICAR DE CUALQUIER ENTERO
        Scanner y = new Scanner(System.in);
        System.out.println("Ingrese el valor del cual desea los multiplos : ");
        int valor = y.nextInt();

        //int multiplos [] = {5,10,15,20,25,30,35,40,45,50};
        int multiplos[] = new int[10];
        int j = 1;
        for (int i = 0;i<multiplos.length; i++) {
            j++;
            int nuevo_valor = valor * j;
            multiplos[i] = nuevo_valor;
        }
        int x = 0;
        
        while (x < 9) {
            System.out.println(multiplos[x]);
            x++;
        }
        

    }

}
