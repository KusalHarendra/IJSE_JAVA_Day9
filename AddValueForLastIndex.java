import java.util.Arrays;

public class AddValueForLastIndex{
    public static void main(String args[]) {
        int ar[] = {45,54,67,76,57,35,78,90,44,68};
        System.out.println(Arrays.toString(ar));// [45,54,67,76,57,35,78,90,44,68]
        System.out.println("Length : " + ar.length); // 10

        // add '99' to last index
        int temp[] = new int[ar.length+1];
        for(int i = 0; i<ar.length; i++){
            temp[i] = ar[i];
        }
        temp[temp.length-1] = 99;
        ar = temp; 

        System.out.println(Arrays.toString(ar));// [45,54,67,76,57,35,78,90,44,68,99]
        System.out.println("Length : " + ar.length); // 11
    }

}
