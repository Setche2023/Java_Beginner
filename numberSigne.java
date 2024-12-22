import java.util.Scanner;

public class numberSigne {

    public static void main(String[] args) {
        double number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Zahl ein: ");
        number = scanner.nextDouble();

        scanner.close();

        if (number > 0) {
            System.out.println("Der Zahl ist positiv.");
        } else if (number < 0) {
            System.out.println("Der Zahl ist negativ.");
        } else {
            System.out.println("Der Zahl ist null.");
        }
    }
}
