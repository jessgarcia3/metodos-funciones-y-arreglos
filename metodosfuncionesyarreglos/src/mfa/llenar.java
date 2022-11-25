
package mfa;

import java.util.Random;

public class llenar {
    static int size = 10;
    int[] arr = new int[size];
    
    public void llenar(){
       System.out.println("LLenando array....");
		for(int i=0;i<arr.length;i++){
			arr[i] = new Random().nextInt(40);
		}
                for (int num : arr) {
            System.out.println(num);
        }
 
        System.out.println();
                
    }
}
