import java.util.Scanner;

public class multiplicationByTen {
    public static void main(String[] args){
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre pour afficer sa table de multiplication par 10");
        a = scanner.nextInt();

        System.out.println("Table de multiplication par 10 pour " + a + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
        scanner.close(); // fermeture du scanner pour libérer la mémoire

    } 
}
