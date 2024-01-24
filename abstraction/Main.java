package abstraction;

public class Main {

    public static void main(String[] args) {

        Parent obj1 = new FirstSubclass();

        Parent obj2 = new SecondSubclass();

       

        obj1.message();

        obj2.message();

    }

}