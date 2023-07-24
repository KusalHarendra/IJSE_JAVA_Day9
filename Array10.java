
import java.util.*;

class Array10{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number (Press -1 to terminate the program) : ");
        int number = input.nextInt();
        int numberArr[] = new int[0];
        while(number != -1){
            int temp[] = new int[numberArr.length +1];
            for(int i = 0; i< numberArr.length; i++){
                temp[i] = numberArr[i];
            }

            temp[temp.length-1] = number;
            numberArr = temp;
            System.out.print("Input Number (Press -1 to terminate the program) : ");
            number = input.nextInt();
        }
        System.out.println(Arrays.toString(numberArr));
    }

}
