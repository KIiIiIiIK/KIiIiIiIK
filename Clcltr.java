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
            double firstNumber = Double.parseDouble(scanner.nextLine());
            System.out.println("enter second number:");
            double secondNumber = Double.parseDouble(scanner.nextLine());
            System.out.println("enter operation ('+' or '-' or '/' or '*' or '%') " +
                    "to perform or q if you want to quit:");

            operation = scanner.nextLine();

            return performOperation(firstNumber, secondNumber);
        }

        private double performOperation(double firstNumber, double secondNumber) {
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
                case "%":
                    result = percentage(firstNumber, secondNumber);
                    break;
                default:
                    result = 0;
                    break;
            }

            return result;
        }

        private double plus(double firstNumber, double secondNumber){
            return firstNumber + secondNumber;}
        private double minus(double firstNumber, double secondNumber){
            return firstNumber - secondNumber;}
        private double divide(double firstNumber, double secondNumber){
            return firstNumber / secondNumber;}
        private double multiply(double firstNumber, double secondNumber){
            return firstNumber * secondNumber;}
        private double percentage(double firstNumber, double secondNumber){
            return (firstNumber * secondNumber/100);}
    }

