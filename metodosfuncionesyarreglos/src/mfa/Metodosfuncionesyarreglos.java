package mfa;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Metodosfuncionesyarreglos {
    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion;
       
        while(!salir){
           System.out.println("1. Llenar arreglo aleatorio");
           System.out.println("2. Ordenar arreglo ascendente");
           System.out.println("3. Ordenar arreglo descendente");
           System.out.println("4. Salir");
            
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        llenar obj = new llenar();
                        obj.llenar();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        ascendente obj1 = new ascendente();
                        obj1.ascendente();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        descendente obj2 = new descendente();
                        obj2.descendente();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}