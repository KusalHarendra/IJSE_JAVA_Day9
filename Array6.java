import java.util.*;

class Array6{
    public static boolean equals(int[] a,int[] b){

          if(a.length != b.length){
            return false;
        } else {
            for(int i = 0; i< a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String args[]){
        int ar[] = {10,20,30,40,50,60};
        int br[] = {10,20,30,40,50,60,70};
        int cr[] = {10,20,30,40,50};
        int dr[] = {10,30,20,40,50,60};
        int er[] = {10,20,30,40,50,60};

        System.out.println("ar == br : " + equals(ar,br)); // false
        System.out.println("ar == cr : " + equals(ar,cr)); // false
        System.out.println("ar == dr : " + equals(ar,dr)); // false
        System.out.println("ar == er : " + equals(ar,er)); // true
    }
}
