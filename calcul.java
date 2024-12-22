import java.util.Scanner;

public class calcul {
    public static void main(String[] args) {
        int number;
        int summe = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= number; i++) {
            summe += i;
            

        }
        System.out.println("Die Summe von Zahl von 1 bis " + number + " is " + summe + "!");
    }
}
