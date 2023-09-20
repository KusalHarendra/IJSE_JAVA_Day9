public class GlobalVariable {
    static int y = 200;
    public static void main(String [] args){
        //System.out.println(y); cannot access like a local variable
        System.out.println(GlobalVariable.y);
    }
}
