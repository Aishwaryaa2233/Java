public class EvenFibonacciArray {
    public static void main(String[] args) {
        int[] evenFibArray = new int[20];
        int count = 0;
        int a = 0, b = 1;
         while (count < 20) {
            int next = a + b;
            a = b;
            b = next;
            if (next % 2 == 0) {
                evenFibArray[count] = next;
                count++;
            }
        }
        System.out.println("First 20 even Fibonacci numbers:");
        for (int num : evenFibArray) {
            System.out.print(num + " ");
        }
        int sum = 0;
        for (int num : evenFibArray) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);}
        
    }