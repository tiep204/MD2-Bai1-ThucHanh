import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("which month that you want to count dáy?");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("the month"+ month+ "há 28 or 29 dáy!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month "+ month+"há 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thư month "+ month+ "has 30 days!");
                break;
            default:
                System.out.println("this month doesn't exist");



        }
    }
}