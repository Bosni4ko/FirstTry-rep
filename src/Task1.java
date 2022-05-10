import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers: ");
        System.out.println("Enter value a");
        int a = sc.nextInt();
        System.out.println("Enter value b");
        int b = sc.nextInt();

        System.out.println("Is "+ a +" equal to "+ b + " ? " + " - " + (a == b));
        System.out.println("Is "+ a +" less than "+ b + " ? "+ " - " + (a < b));
        System.out.println("Is "+ a +" less or equal "+ b + " ? "+ " - " + (a <= b));
        System.out.println("Is "+ a +" greater than "+ b + " ? "+ " - " + (a > b));
        System.out.println("Is "+ a +" greater or equal to "+ b + " ? " + " - " + (a >= b));


    }

}