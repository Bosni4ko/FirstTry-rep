import java.util.Scanner;

public class Task5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean b;
        while(true){
            System.out.println("Please enter boolean: ");
            if(sc.hasNextBoolean()) {
                b = sc.nextBoolean();
                break;
            }
            else {
                System.out.println("Incorrect input");
                sc.nextLine();
            }
        }

        System.out.println(!b);

    }
}
