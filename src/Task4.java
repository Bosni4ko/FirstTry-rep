import java.util.Scanner;

public class Task4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        String input;
        int n;
        System.out.println("Please input a number: ");
        while (true) {
            System.out.println("Enter value a");
            input = sc.next();
            try {
                n = Integer.parseInt(input);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input");
            }
        }
        System.out.println(n % 2 != 0);
    }
}
