
import java.util.*;

class Array12 {

    public static int[] removeDuplicates(int[] ar){
        int [] br = new int[0];
        for(int i = 0; i< ar.length; i++){
            if(!isDuplicate(br, ar[i])){
               int[] temp = new int[br.length+1];
               for(int j = 0; j< br.length; j++){
                    temp[j] = br[j];
               }
               temp[temp.length-1] = ar[i];
               br = temp;
            }
        }
        return br;
    }

    public static boolean isDuplicate(int ar[], int number) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] ar = {10,20,30,40,50,40,60,20,80,90};
        System.out.println(Arrays.toString(ar)); // [10,20,30,40,50,40,60,20,80,90]

        int[] br = removeDuplicates(ar);
        System.out.println(Arrays.toString(br)); // [10,20,30,40,50,60,80,90]
    }
}
