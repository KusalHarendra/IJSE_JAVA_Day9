public class VariableTypes {
    static int globalVar = 100;
    public static void main(String [] args){
        int localVar = 200;
        System.out.println(localVar);
        System.out.println(globalVar);
        System.out.println(VariableTypes.globalVar);
        //System.out.println(VariableTypes.localVar); //illegal
        print();
    }

    public static void print(){
        //System.out.println(localVar); //cannon access inside another method
        System.out.println(globalVar);
        System.out.println(VariableTypes.globalVar);
    }
}
