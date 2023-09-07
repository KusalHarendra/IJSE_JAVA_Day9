import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int ar[]){
        for(int i = 0, j = ar.length - 1; i < j; i++, j--){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }
        
    public static void main(String [] args){
        int ar[] = {10,20,30,40,50,60,70,80,90};   //[10, 20, 30, 40, 50, 60, 70, 80, 90]
        System.out.println(Arrays.toString(ar));

        reverse(ar);
        System.out.println(Arrays.toString(ar)); //[90, 80, 70, 60, 50, 40, 30, 20, 10]
    }
}
