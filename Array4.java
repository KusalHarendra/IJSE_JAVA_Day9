import java.util.*;

class Array4{
    public static int search(int[] a,int b){
        int index = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                index = i;
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
        System.out.println("Last Index of : " + key + " : " + index); // 4

        key = 12;
        index = search(ar, key);
        System.out.println("Last Index of : " + key + " : " + index); // 11

        key = 99;
        index = search(ar, key);
        System.out.println("Last Index of : " + key + " : " + index); // -1
    }
}
