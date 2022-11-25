
package mfa;

public class descendente {
    static int size = 10;
    int[] arr = new int[size];
     public void descendente(){
       System.out.println("Orden descendente:");
        orddescendente(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
   static void orddescendente(int[] arreglo){
       for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;
                }
            }
 
            if (i != max) {

                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
   } 
}
