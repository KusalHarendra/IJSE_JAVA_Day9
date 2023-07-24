import java.util.*;

class Array9{

    public static boolean isDuplicate(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        
        int ar[] = {45,54,67,76,57,35,78,90,44,68};
        System.out.println(Arrays.toString(ar)); // [45,54,67,76,57,35,78,90,44,68]
        System.out.println("Arrays ar is a duplicate array : " + isDuplicate(ar)); // false

        int br[] = {45,54,67,76,57,45,78,90,44,68};
        System.out.println(Arrays.toString(br)); // [45,54,67,76,57,45,78,90,44,68]
        System.out.println("Arrays ar is a duplicate array : " + isDuplicate(br)); // true
    }
}
