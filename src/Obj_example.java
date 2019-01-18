public class Obj_example { //class
    String echo = "This is a Message!!";  //Global Variable which is not in main() scope to access them we need a object
    public static void main(String argu[]) //main method
    {
        Obj_example obj = new Obj_example(); // Create a Simple Object called obj
        System.out.println("Im accessed By Object: " + obj.echo); //using obj now we can access The Global Variable
    }
}
