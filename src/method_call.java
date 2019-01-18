public class method_call { //create a class
    public static void main(String arg[]){  //main method
        method_call obj = new method_call(); //create an object
        System.out.println("Im a main Method: ");  //simple message to know main was called
        obj.method(); // called method() using the object
    }
    String method(){ // method body
        System.out.println("Im a Method Called by Main()"); //acknowledge method was revoked!!
        return null;
    }
}
