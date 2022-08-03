package HojadeTrabajo4;

import java.util.Scanner;

public class Matriz {

    public void array_5x4() {
        int matriz[][] = new int[5][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Scanner sp = new Scanner(System.in);
                System.out.println("Ingrese un numero entero : ");
                int valor = sp.nextInt();
                matriz[i][j] = valor;
            }

        }

        System.out.println("");
        
        System.out.println("Desplegando Matriz de 5x4: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }
    
    public static void main(String[] args) {
        
        Matriz ma = new Matriz();
        
        ma.array_5x4();
    }
}
