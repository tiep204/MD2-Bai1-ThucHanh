
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.println("your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("%-20.2s%s"+"bmi"+"Interpretaion\n");
        if (bmi < 18){
            System.out.println("%-20.2f%s"+ bmi + "Underweight");

        }else if (bmi < 25.0){
            System.out.println("%-20.2f%s" + bmi + "Normal");

        }else if (bmi < 30.0){
            System.out.println("%-20.2f%s"+ bmi + "Overweight");

        }else{
            System.out.println("%-20.2f%s" + bmi + "Obese");
        }


    }
}