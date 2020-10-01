public class method_call { //create a class with the correct naming convention
    public static void main(String arg[]){  //main method(Java program execution starts from here.)
        method_call obj = new method_call(); //create an object of method_call class.
        System.out.println("Im a main Method: ");  //simple message to know main was called
        obj.method(); // called method() using the object of method_call class.
    }
    public void method(){ // method declaration
        System.out.println("Im a Method Called by Main()"); //(Method body) Acknowledge method was revoked!!.
        //no need to return anything.
    }
}
