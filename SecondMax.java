import java.util.Arrays;

public class SecondMax {

    public static void printSecondMax(int[] ar){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < ar.length; i++){
            if(ar[i]> max){
                secondMax = max;
                max = ar[i];
            } else  if(ar[i]> secondMax && ar[i]!= max) {
                secondMax = ar[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE){
            System.out.println("There is no second max");
        } else {
            System.out.println("Second Max : " + secondMax);
        }
    }

    public static void main(String args[]){
        
        int ar[] = {45,54,67,76,54,35,78,90,44,68};
        System.out.println(Arrays.toString(ar));
        printSecondMax(ar); // 78

        ar = new int[]{45,54,67,76,54,35,99,90,44,68};
        System.out.println(Arrays.toString(ar));
        printSecondMax(ar); // 90

        ar = new int[]{99,99,99,99,99,99,99,99,99};
        System.out.println(Arrays.toString(ar));
        printSecondMax(ar); // There is no second max
        
 }


}
