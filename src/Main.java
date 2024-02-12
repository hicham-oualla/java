import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix = 0;
        ArrayList<Apprenant> listApprenant = new ArrayList<>();
        ArrayList<Classes> listClasses = new ArrayList<>();

        do {
            System.out.println("** Menu **");
            System.out.println("1--------Gérer les Apprenants");
            System.out.println("2--------Gérer les Classes");
            System.out.println("3--------Quitter");
            System.out.println("   Enter votre choix : ");
            Scanner scanner1 = new Scanner(System.in);
            choix = scanner1.nextInt();

            switch (choix) {
                case 1:
                    // Apprenant Menu
                    menuApprenant(listApprenant);
                    break;
                case 2:
                    // Classes Menu
                    menuClasses(listClasses);
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }

        } while (choix != 3);
    }

    private static void menuApprenant(ArrayList<Apprenant> listApprenant) {
        int choixApprenant = 0;
        Apprenant app1 = new Apprenant();

        do {
            System.out.println("** Menu Apprenant **");
            System.out.println("1--------Ajouter un nouvel apprenant");
            System.out.println("2--------Modifier les informations");
            System.out.println("3--------Supprimer un apprenant");
            System.out.println("4--------Consulter la liste");
            System.out.println("5--------Rechercher un apprenant");
            System.out.println("6--------Revenir au menu principal");
            System.out.println("   Enter votre choix : ");
            Scanner scanner2 = new Scanner(System.in);
            choixApprenant = scanner2.nextInt();

            switch (choixApprenant) {
                case 1:
                    // Ajouter
                    app1.AjouterApprent(listApprenant);
                    break;
                case 2:
                    // Modifier
                    app1.Modifier(listApprenant);
                    break;
                case 3:
                    // Supprimer
                    app1.Supprimer(listApprenant);
                    break;
                case 4:
                    // Consulter
                    app1.Afficher(listApprenant);
                    break;
                case 5:
                    // Rechercher
                    break;
                case 6:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }

        } while (choixApprenant != 6);
    }

    private static void menuClasses(ArrayList<Classes> listClasses) {
        int choixClasses = 0;
        Classes classes = new Classes();

        do {
            System.out.println("** Menu Classes **");
            System.out.println("1--------Ajouter une nouvelle classe");
            System.out.println("2--------Modifier les informations de classe");
            System.out.println("3--------Supprimer une classe");
            System.out.println("4--------Consulter la liste des classes");
            System.out.println("5--------Rechercher une classe");
            System.out.println("6--------Revenir au menu principal");
            System.out.println("   Enter votre choix : ");
            Scanner scanner3 = new Scanner(System.in);
            choixClasses = scanner3.nextInt();

            switch (choixClasses) {
                case 1:
                    // Ajouter
                    classes.AjouterClasse(listClasses);
                    break;
                case 2:
                    // Modifier
                    classes.ModifierClasse(listClasses);
                    break;
                case 3:
                    // Supprimer
                    classes.SupprimerClasse(listClasses);
                    break;
                case 4:
                    // Consulter
                    classes.AfficherClasses(listClasses);
                    break;
                case 5:
                    // Rechercher
                    break;
                case 6:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }

        } while (choixClasses != 6);
    }
}
