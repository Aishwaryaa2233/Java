public class FloatExample {
    public static void main(String[] args) {
        
        String floatString1 = "5.67";
        Float floatObj1 = Float.parseFloat(floatString1); // Parsing
        System.out.println("The first float_obj is: " + floatObj1);

        String floatString2 = "8.99";
        Float floatObj2 = Float.parseFloat(floatString2); // Parsing
        System.out.println("The second float_obj is: " + floatObj2);

       
        System.out.println("Is floatObj1 equal to floatObj2? " + floatObj1.equals(floatObj2)); // false

        
        Float floatObj3 = 5.67f;
        System.out.println("Is floatObj1 equal to floatObj3? " + floatObj1.equals(floatObj3)); // true
    }
}
