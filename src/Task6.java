import java.util.Scanner;

public class Task6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 2 whole numbers: ");
        System.out.println("Input 1.st number: ");
        int a = sc.nextInt();
        System.out.println("Input 1.st number: ");
        int b = sc.nextInt();

        if(a == b || (a < 0 && b > 0) || (a > 100 && b > 100)){
            System.out.println("a is " + a + " and b is " + b + " -> true");
        }
        else System.out.println("a is " + a + " and b is " + b + " -> false");
    }
}
