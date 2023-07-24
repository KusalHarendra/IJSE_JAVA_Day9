import java.util.*;

class Array7{
    public static void reverse(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = a[(a.length-1) - i];
        }
    }
    public static void main(String args[]){
        int ar[] = {45,54,67,76,54,35,78,90,44,68};
        System.out.println(Arrays.toString(ar)); // [45,54,67,76,54,35,78,90,44,68]

        reverse(ar);

        System.out.println(Arrays.toString(ar)); // [68,44,90........54,45] 
    }
}
