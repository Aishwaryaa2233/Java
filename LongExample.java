public class LongExample {
    public static void main(String[] args) {
        
        String longString1 = "54321";
        Long longObj1 = Long.parseLong(longString1); // Parsing
        System.out.println("The first long_obj is: " + longObj1);

        String longString2 = "98765";
        Long longObj2 = Long.parseLong(longString2); // Parsing
        System.out.println("The second long_obj is: " + longObj2);

       
        System.out.println("Is longObj1 equal to longObj2? " + longObj1.equals(longObj2)); // false


        Long longObj3 = Long.parseLong(longString1);
        System.out.println("Is longObj1 equal to longObj3? " + longObj1.equals(longObj3)); // true
    }
}

