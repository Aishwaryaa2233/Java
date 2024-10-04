public class IntegerExample {
    public static void main(String[] args) {
        // Integer Example
        Integer intObj1 = new Integer(10);
        System.out.println("The first int_obj is: " + intObj1);

        Integer intObj2 = new Integer(20);
        System.out.println("The second int_obj is: " + intObj2);

        // Comparison using equals() method
        System.out.println("Is intObj1 equal to intObj2? " + intObj1.equals(intObj2)); // false

        // Another comparison
        Integer intObj3 = new Integer(10);
        System.out.println("Is intObj1 equal to intObj3? " + intObj1.equals(intObj3)); // true
    }
}
