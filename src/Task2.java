import java.util.Scanner;

public class Task2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean b1,b2;

        System.out.println("Please enter 2 booleans: ");
        while(true){
            System.out.println("Enter value b1");
            if(sc.hasNextBoolean()) {
                b1 = sc.nextBoolean();
                break;
            }
            else {
                System.out.println("Incorrect input");
                sc.nextLine();
            }
        }

        while(true){
            System.out.println("Enter value b2");
            if(sc.hasNextBoolean()) {
                b2 = sc.nextBoolean();
                break;
            }
            else {
                System.out.println("Incorrect input");
                sc.nextLine();
            }
        }



        System.out.println("Is b1 and b2 equal? - " + (b1 == b2));
    }
}
