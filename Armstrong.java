
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number to be checked:-");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int len = String.valueOf(number).length();
        int temp = number;
        int rm;
        int sum = 0;

        while (number > 0) {
            rm = number % 10;
            sum += Math.pow(rm, len);
            number /= 10;
        }

        if (temp == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
        sc.close();
    }
}
