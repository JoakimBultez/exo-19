package fr.dampierre;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel");
        Random random = new Random();
        System.out.println("Entrez un nombre : ");
        int nombreadeviner = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int proposition = scanner.nextInt();
        System.out.println("vous proposez : " + proposition);
        System.out.println("le nombre auquel je pensais était : " + nombreadeviner);
        int différence = (nombreadeviner - proposition);
        System.out.println("vous étiez à " + différence + " de la bonne réponse");
        if (nombreadeviner < proposition) {
            System.out.println("Perdu vous avez dépassé de :" + (proposition - nombreadeviner));
        } else if (nombreadeviner > proposition) {
            System.out.println("Il vous manquait : " + (nombreadeviner - proposition));
        } else {
            System.out.println("Quel bol vous avez trouvé !");
        }

        scanner.close();
    }

}