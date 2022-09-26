import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0 ){
                    System.out.println("%d is a leap year " +year);
                }else {
                    System.out.println("%d is NOT a leap year" +year);
                }
            }else {
                System.out.println("%d is a leap year " + year);
            }
        }
    }
}