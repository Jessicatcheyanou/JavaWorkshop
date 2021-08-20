package main.chapter5;

public class Example06 {
    private static void staticMethod(){

        System.out.println("static method,acessible from null reference");

    }

    private void nonStaticMethod(){
        System.out.println("non-static method,inacessible from null reference");
    }

    public  static void main(String[] args){
        Example06 object = null ;

        //object.staticMethod();
        object.nonStaticMethod();

    }
}
