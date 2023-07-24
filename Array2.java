import java.util.*;

class Array2{
    public static void copyValuesFromTo(int[] a, int[] b){
         int minLength = a.length > b.length? b.length : a.length;

        for(int i = 0; i< minLength; i++){
            b[i] = a[i];

        }
    }
    public static void main(String args[]){
        int ar[] = {100,200,300,400,500,600};
        int br[] = new int[ar.length];
        int cr[] = new int[ar.length-3];
        int dr[] = new int[ar.length+3];

        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]


        copyValuesFromTo(ar, br);
        copyValuesFromTo(ar, cr);
        copyValuesFromTo(ar, dr);

        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(br)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(cr)); // [100,200,300]
        System.out.println(Arrays.toString(dr)); // [100,200,300,400,500,600,0,0,0]
    }
}
