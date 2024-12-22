import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un premier nombre a: ");
        a = scanner.nextInt();

        System.out.println("Entrez un deuxième nombre b: ");
        b = scanner.nextInt();

        System.out.println("Entrez un troisième nombre c: ");
        c = scanner.nextInt();

        scanner.close();
       
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Le nombre le plus grand est: " + max);

    } 
    
}
