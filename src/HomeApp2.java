import java.util.Scanner;

public class HomeApp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = b * b - 4 * a * c;
        double x1  = ((-1 * b) - Math.sqrt(d)) / (2 * a) ;
        double x2 = ((-1 * b) + Math.sqrt(d)) / (2 * a) ;

        if (d < 0) {
            System.out.println("There are no roots in the equation");
        } else if (d > 0) {

            System.out.println("There are 2 roots in the equation:");
            System.out.print("First root is ");
            System.out.format("%.3f%n", x1);
            System.out.print("Second root is ");
            System.out.format("%.3f%n", x2);

        } else {
            System.out.println("There are only 1 root in the equation, it is ");
            System.out.format("%.3f%n", x1);
        }

        System.out.println("d = " + d);

    }
}
