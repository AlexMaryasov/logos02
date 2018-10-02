import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
//        boolean ok = false;
//        if (ok) {
//            System.out.println("this will work if condition is true");
//        } else {
//            System.out.println("if condition is false");
//        }
        // >, <, >=, <=
        // ==, !=
//        System.out.println(22 > 11);
//        System.out.println(22 != 11);
//        System.out.println(22 <= 11);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age: ");

        int age = scan.nextInt();
        if (age >= 18 && age <= 140) {
            System.out.println("You are welcome");
        } else if (age < 0 || age > 140) { // as many as you want
            System.out.println("You made a mistake");
        } else {
            System.out.println("You are too young");
        }

        //провірити чи вік більший\менший 10 і повідомити про це
        if (age > 10) {
            System.out.println("greater");
        } else if (age < 10) {
            System.out.println("less");
        } else {
            System.out.println("equals");
        }

        //провірити на парність
        if (age % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        System.out.println("main");
    }
}
