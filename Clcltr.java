import java.util.InputMismatchException;
import java.util.Scanner;

public class Clcltr {
    private String operation;
    private Scanner scanner;

    public Clcltr() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate() throws InputMismatchException {
        while (!"q".equals(operation)) {
            System.out.println(calculationStep());
        }
    }

    private double calculationStep() throws InputMismatchException {
        System.out.println("enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter operation ('+' or '-' or '/' or '*') to perform or q if you want to quit:");

        operation = scanner.nextLine();

        return performOperation(firstNumber, secondNumber);
    }

    private double performOperation(int firstNumber, int secondNumber) {
        double result;

        switch (operation){
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "/":
                result = divide(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    private int plus(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;}
    private int minus(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;}
    private int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;}
    private int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;}
}

