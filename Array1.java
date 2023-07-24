import java.util.*;

class Array1{

    public static void copyValuesFromTo(int[] a, int[] b){
          for(int i = 0; i< a.length; i++){
            b[i] = a[i];
          }

    }
    public static void main(String args[]){
        int ar[] = {100,200,300,400,500,600};
        int br[] = new int[ar.length];
        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(br)); // [0,0,0,0,0,0]

        System.out.println(ar==br); // false

        copyValuesFromTo(ar, br);

        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(br)); // [100,200,300,400,500,600]

        System.out.println(ar==br); // false
    }
}
