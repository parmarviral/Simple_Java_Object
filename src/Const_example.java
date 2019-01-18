public class Const_example { //class Created
    Const_example(){ //constructor of the class
        System.out.println("Im a Constructor!! "); // acknowledge constructor was Called
    }
    public static void main(String arg[]){
        System.out.println("im a main method object is created after this statement!"); //main was called
        Const_example obj = new Const_example(); // object was created and constructor will be called
    }
}
