import java.util.*;

class Array5{

    public static int search(int ar[], int key){
        int index = -1;
        for(int i = 0; i< ar.length; i++){
            if(ar[i] == key){
                index = i;
                break;
            } 
        }

        return index;
    }

    public static void main(String args[]){
        int ar[] = {78,79,88,56,78,69,35,76,20,32,47,12,94,39};
        System.out.println(Arrays.toString(ar));

        int index;
        int key = 78;
        index = search(ar, key);
        System.out.println("First Index of : " + key + " : " + index); // 0

        key = 12;
        index = search(ar, key);
        System.out.println("First Index of : " + key + " : " + index); // 11

        key = 99;
        index = search(ar, key);
        System.out.println("First Index of : " + key + " : " + index); // -1
    }
}
