import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers: ");
        String input;
        int a,b;
        while (true) {
            System.out.println("Enter value a");
            input = sc.next();
            try {
                a = Integer.parseInt(input);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input");
            }
        }
        while (true) {
            System.out.println("Enter value b");
            input = sc.next();
            try {
                b = Integer.parseInt(input);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input");
            }
        }

        System.out.println("Is "+ a +" equal to "+ b + " ? " + " - " + (a == b));
        System.out.println("Is "+ a +" less than "+ b + " ? "+ " - " + (a < b));
        System.out.println("Is "+ a +" less or equal "+ b + " ? "+ " - " + (a <= b));
        System.out.println("Is "+ a +" greater than "+ b + " ? "+ " - " + (a > b));
        System.out.println("Is "+ a +" greater or equal to "+ b + " ? " + " - " + (a >= b));


    }

}