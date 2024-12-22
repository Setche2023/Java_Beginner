import java.util.Scanner;

public class geradeNummer {
    public static void main(String[] args) {
        int a;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre: ");
        a = scanner.nextInt();

            if (a % 2 == 0) {
                System.out.println("Le nombre entré est un nombre pair");
            } else {
                System.out.println("Le nombre entré est un nombre impair");
            }
 
            scanner.close();
        }
    }
