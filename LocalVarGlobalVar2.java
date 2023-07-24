public class LocalVarGlobalVar2 {
    public static int x = 100;
    public static void main(String args[]) {
        int x = 200;
        System.out.println("Global x : " + LocalVarGlobalVar2.x );
        System.out.println("Local x : " + x);
    }
 
}
