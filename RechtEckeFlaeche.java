import java.util.Scanner;

public class RechtEckeFlaeche {

    public static void main(String[] args) {
        double laenge;
        double breite;

        // Création de l'objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la longueur
        System.out.println("Geben Sie die Länge der Rechtecke ein:");
        laenge = scanner.nextDouble();

        // Demander à l'utilisateur de saisir la largeur
        System.out.println("Geben Sie die Breite der Rechtecke ein:");
        breite = scanner.nextDouble();

        // Fermer le scanner
        scanner.close();

        // Appeler la méthode pour calculer l'aire
        double flaeche = berechneFlaeche(laenge, breite);

        // Afficher l'aire calculée
        System.out.println("Die gesamte Fläche beträgt: " + flaeche);
    }

    // Méthode pour calculer l'aire d'un rectangle
    public static double berechneFlaeche(double laenge, double breite) {
        return laenge * breite;
    }
}
