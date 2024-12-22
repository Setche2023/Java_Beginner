import java.util.Scanner;

public class Addiere {
    public static void main(String[] args) {
        // Déclaration des variables
        int firstNummer;
        int secondNummer;

        // Création d'un Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du premier nombre
        System.out.println("Bitte geben Sie den ersten Nummer ein:");
        firstNummer = scanner.nextInt();

        // Demande du deuxième nombre
        System.out.println("Bitte geben Sie den zweiten Nummer ein:");
        secondNummer = scanner.nextInt();

        // Calcul du résultat en utilisant la méthode addiere
        int ergebnis = addiere(firstNummer, secondNummer);

        // Affichage du résultat
        System.out.println("Das Ergebnis ist: " + ergebnis);

        // Fermeture du Scanner
        scanner.close();
    }
 
    // Méthode pour additionner deux nombres
    public static int addiere(int firstNummer, int secondNummer) {
        return (firstNummer + secondNummer);
    }
}
