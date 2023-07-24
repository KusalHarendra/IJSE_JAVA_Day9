import java.util.Arrays;

public class Array14 {
    public static int[] add(int ar[], int num){
        int[] temp = new int[ar.length + 1];
        for(int i = 0; i< ar.length; i++){
            temp[i] = ar[i];
        }
        temp[temp.length-1] = num;
        ar = temp;
        return ar;
    }

    public static void main(String args[]) {
        int ar[] = {45,54,67,76,57,35,78,90,44,68};
        System.out.println(Arrays.toString(ar));// [45,54,67,76,57,35,78,90,44,68]
        System.out.println("Length : " + ar.length); // 10

        ar = add(ar, 99);

        System.out.println(Arrays.toString(ar));// [45,54,67,76,57,35,78,90,44,68,99]
        System.out.println("Length : " + ar.length); // 11
    }

}
