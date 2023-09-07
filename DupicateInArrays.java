import java.util.Arrays;

public class DupicateInArrays {

     public static boolean isDuplicate(int[] ar){
        for(int i = 0; i< ar.length; i++){
            for(int j = i+1; j< ar.length; j++){
                if(ar[i]==ar[j]){
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

