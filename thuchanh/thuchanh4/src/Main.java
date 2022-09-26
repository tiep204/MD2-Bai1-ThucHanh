import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println("Linear Equation Réolver");
        System.out.println("Given a equation 'a * x + b = c', please enter cóntants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if (a != 0) { /// nếu a khác 0
            double x = (c - b) / a; // phương trình có nghiệm duy nhất x = (c-b)/a
            System.out.println("Equation pas with x = " + x);
        } else { // trường hợp a = 0;
            if (b == c) { // nếu b = c -> phương trình có vô số nghiệm
                System.out.println("the solution í all x!");

            } else { // nếu c# c -> phương trình vô nghiệm
                System.out.println("no solution!");

            }
        }
    }
}