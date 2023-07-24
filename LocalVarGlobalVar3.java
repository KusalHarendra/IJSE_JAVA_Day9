public class LocalVarGlobalVar3 {
     public static int x = 100;

    public static void print(){
        System.out.println(x); // Legal -> Global Variable
        //System.out.println(y); // Illegal -> Local Variable
    }
    public static void main(String args[]) {
        int y = 200;
    }

}
