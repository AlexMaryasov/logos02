import java.util.Scanner;

public class HomeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Your number is under 0 is " + a);
        } else if (a > 0) {
            System.out.println("Your number is greater than 0 is " + a);
        } else {
            System.out.println("Your number is 0");
        }


    }
}


