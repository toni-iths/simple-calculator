public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till kalkylatorn!");
        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();

        while (true) {
            System.out.println("\nVälj en operation (+, -, *, /) eller skriv 'exit' för att avsluta:");
            String operation = inputHandler.getOperation();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Ange första talet: ");
            double num1 = inputHandler.getNumber();
            System.out.println("Ange andra talet: ");
            double num2 = inputHandler.getNumber();

            double result = calculator.calculate(operation, num1, num2);
            System.out.println("Resultatet är: " + result);
        }
    }
}
