import java.util.Scanner;

public class Task3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0);
    }
}
