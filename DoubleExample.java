public class DoubleExample {
    public static void main(String[] args) {
        
        String doubleString1 = "2.71";
        Double doubleObj1 = Double.parseDouble(doubleString1); // Parsing
        System.out.println("The first double_obj is: " + doubleObj1);

        String doubleString2 = "9.81";
        Double doubleObj2 = Double.parseDouble(doubleString2); // Parsing
        System.out.println("The second double_obj is: " + doubleObj2);

        
        System.out.println("Is doubleObj1 equal to doubleObj2? " + doubleObj1.equals(doubleObj2)); // false

      
        Double doubleObj3 = Double.parseDouble(doubleString1);
        System.out.println("Is doubleObj1 equal to doubleObj3? " + doubleObj1.equals(doubleObj3)); // true
    }
}
