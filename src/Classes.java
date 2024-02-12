import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
    private int numeroclass;
    private int capclass;
    private String nomclasse;

    // Constructor
    public Classes(int numeroclass, int capclass, String nomclasse) {
        this.numeroclass = numeroclass;
        this.capclass = capclass;
        this.nomclasse = nomclasse;
    }

    public Classes() {

    }

    // Getters and Setters
    public int getNumeroclass() {
        return numeroclass;
    }

    public void setNumeroclass(int numeroclass) {
        this.numeroclass = numeroclass;
    }

    public int getCapclass() {
        return capclass;
    }

    public void setCapclass(int capclass) {
        this.capclass = capclass;
    }

    public String getNomclasse() {
        return nomclasse;
    }

    public void setNomclasse(String nomclasse) {
        this.nomclasse = nomclasse;
    }

    // Method to add a class
    public void AjouterClasse(ArrayList<Classes> tabClasse) {
        Classes classe = new Classes();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Numero de classe: ");
        classe.setNumeroclass(scan.nextInt());
        System.out.printf("Capacite de classe: ");
        classe.setCapclass(scan.nextInt());
        System.out.printf("Nom de classe: ");
        classe.setNomclasse(scan.nextLine());
        tabClasse.add(classe);
    }

    // Method to display all classes
    public void AfficherClasses(ArrayList<Classes> tabClasse) {
        for (Classes classe : tabClasse) {
            System.out.println("Numero de classe: " + classe.getNumeroclass());
            System.out.println("Capacite de classe: " + classe.getCapclass());
            System.out.println("Nom de classe: " + classe.getNomclasse());
            System.out.println("*****************************");
        }
    }

    // Method to modify a class
    public void ModifierClasse(ArrayList<Classes> tabClasse) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter le numero de classe");
        numero = scan.nextInt();
        for (Classes classe : tabClasse) {
            if (numero == classe.getNumeroclass()) {
                System.out.printf("Nouvelle capacite de classe: ");
                classe.setCapclass(scan.nextInt());
                System.out.printf("Nouveau nom de classe: ");
                classe.setNomclasse(scan.next());
                break;
            }
        }
    }

    // Method to delete a class
    public void SupprimerClasse(ArrayList<Classes> tabClasse) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter le numero de classe");
        numero = scan.nextInt();
        for (Classes classe : tabClasse) {
            if (numero == classe.getNumeroclass()) {
                tabClasse.remove(classe);
                System.out.println("Supprimer avec succes");
                break;
            }
        }
    }
}
