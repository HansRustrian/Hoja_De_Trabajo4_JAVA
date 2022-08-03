
package ejercicio_3;

import java.util.ArrayList;


public class Clase11 {
    
    public static void main(String[] args) {
    
        // ARRAY LIST
        
        
        // UNA FORMA DE LLENAR EL ARRAYLIST CON USO DE CONSTRUCTOR:
        
        alumnos alumno1 = new alumnos(2015, "Hans", 22, "Cierre de pensum");
        
        ArrayList<alumnos> lista = new ArrayList<>();
        
        
        lista.add(alumno1);
        
        lista.add(new alumnos(2020, "Marvin", 25, "5to Semestre"));
        lista.add(new alumnos(2018, "Maria", 27, "7mo Semestre"));
        lista.add(new alumnos(2015, "Carlos", 23, "Cierre de pensum"));
        lista.add(new alumnos(2021, "Juan", 24, "8vo Semestre"));
        lista.add(new alumnos(2022, "Noemi", 21, "9no Semestre"));
        
        /*
        // IMPRIMIR POR SU MEDIDA SE USA EL NOMBRE DE OBJETO.SIZE
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nombre);
            System.out.println(lista.get(i).carnet);
            System.out.println(lista.get(i).edad);
            System.out.println(lista.get(i).grado);
            
        }
        */
        
        // FOR EACH (EL FOR MAS PODEROSO) SE IDENTIFICA POR LOS 2 PUNTOS
        // sintaxis : CLASE NOMBRE DE FOR Y EL NOMBRE DEL ARRAYLIST
        
        for (alumnos display : lista) {
            
            System.out.println(display.carnet);
            
        }
        
        
        /*
        //OTRA FORMA DE LLENAR ARRAYLIST SE DEBE USAR METODOS GET Y SET Y SE LLENA CAMPO POR CAMPO
        //YA QUE SIN CONSTRUCTOR NO SOLICITA LOS DATOS Y SE PUEDEN CREAR LOS OBJETOS QUE SE NECESITEN
        //PERO SE CREAN VACIOS
        alumnos alumno1 = new alumnos();
        alumno1.setCarnet(2020);
        alumno1.setEdad(24);
        
        ArrayList<alumnos> lista = new ArrayList<>();
        
        lista.add(alumno1);
        
        lista.add(new alumnos());
        lista.add(new alumnos());
        lista.add(new alumnos());
        */
        
        
    }
    
    
    
    
    
    
}
