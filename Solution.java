import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number and the program will determine if it is prime: ");
        int num = scan.nextInt();
        boolean sol = isPrime(num);
        if(sol == true){
            System.out.println("The value is prime.");
        }else{
            System.out.println("The value is not prime");
        }
        scan.close();

    }

    public static Boolean isPrime(int num){
        for(int x = num -1; x > 1; x--){
            if (num % x== 0) {
                System.out.println(x);
                return false;
            }
        }
        return true;
    }
}
