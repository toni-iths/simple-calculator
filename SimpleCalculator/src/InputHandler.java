import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        String input = scanner.nextLine();
        Boolean isCorrectInput = false;
        while (!isCorrectInput){
            isCorrectInput = true;
            switch (input.toLowerCase()){
                case "+":
                    System.out.println("Du har valt att addera.");
                    break;
                case "-":
                    System.out.println("Du har valt att subtrahera");
                    break;
                case "*":
                    System.out.println("Du har valt att multiplicera");
                    break;
                case "/":
                    System.out.println("Du har valt att dividera");
                    break;
                case "exit":
                    System.out.println("Tack för att du använde kalkylatorn!");
                    break;
                default:
                    System.out.println("Fel input, du behöver välja mellan +, -, * eller /. Skriv exit för att avsluta.");
                    isCorrectInput = false;
                    input = scanner.nextLine();
                    break;
            }
        }
        return input;
    }

    public double getNumber() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Fel input. Du behöver ange siffror.");
            scanner.next();
        }
        double number = scanner.nextDouble();
        String rinse = scanner.nextLine();
        return number;
    }
}
