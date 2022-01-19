import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double firstNumb;
        double secondNumb;
        double result;
        System.out.println("Enter first number");
        firstNumb = scanner.nextDouble();
        System.out.println("Enter second number");
        secondNumb = scanner.nextDouble();
        result = firstNumb + secondNumb;
        System.out.println(result);
    }
}

