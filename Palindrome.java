
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num_check;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Check whether number is palindrome is not :-");
            num_check = sc.nextInt();
        }
        int temp =num_check;
        int digit =0;
        int rm;
        while(num_check>0)
        {
           rm = num_check%10;
           digit=(digit*10)+rm;
           num_check/=10;
        }
        if(temp==digit)
        {
            System.out.println("Number is palindrome");

        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
    
}