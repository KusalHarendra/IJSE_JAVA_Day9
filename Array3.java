import java.util.*;

class Example{
    
     public static int[] mergeTwoArray(int[] a, int[] b){
        int[] temp = new int[a.length + b.length];
        for(int i = 0; i< a.length; i++){
            temp[i] = a[i];
        }

        for(int i = 0; i< b.length; i++){
            temp[a.length + i] = b[i];
        }

        return temp;
    }

    public static void main(String args[]){
        int ar[] = {100,200,300,400,500,600};
        int br[] = {10,20,30,40};
       
        int mergedArray[];

        mergedArray = mergeTwoArray(ar, br);
        
        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(br)); // [10,20,30,40]
        System.out.println(Arrays.toString(mergedArray)); // [100,200,300,400,500,600,10,20,30,40]
        
    }
}
