public class newMethod {
    public static void main(String[] args) {
        abdullah.main(args);
        sayGoodBey();
        // abdullah.sauda(); //! sauda method is a privet thats why its cannot be used in here.
        // sad(); //! its because it is a non-static method that should not be used in here.
    }

    public static void sayGoodBey(){
        System.out.println("sayGoodBey...!");
    }

    public void sad(){
        System.out.println("I'm sad..."); 
    }
}
 