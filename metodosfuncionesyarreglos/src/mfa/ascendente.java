
package mfa;

public class ascendente {
    static int size = 10;
    int[] arr = new int[size];
    public void ascendente(){
       System.out.println("Orden ascendente:");
        ordascendente(arr);
        for (int num : arr) {
            System.out.println(num);
        }
 
        System.out.println();
   }
    static void ordascendente(int[] arreglo){
       for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
 
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
 
            if (i != min) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
       }
   }
}
