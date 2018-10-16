/*
 * MOHAMED GALY ING3 ECE PARIS
 * 
 * 
 */
package tp1exo2;

import java.util.Scanner;


public class TestEtudiant {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);   
        
        Etudiant etud2 = new Etudiant();
        Etudiant etud1 = new Etudiant();

       // Etudiant etud1 = new Etudiant();
       // etud2.nom = "GALY";
        //etud1.nom = "SED";
        //etud1.prenom = "Mohamed";
        //etud2.prenom = "COA";
        
        //System.out.println("ID1 : ");
        //etud1.setId(scan.next());
        //System.out.println(" ID2  : ");
        //etud2.setId(scan.next());
        
       // System.out.print("Etudiant1, Nom Prenom : " + " " + etud1.nom + " " + etud1.prenom + " \n");
        //System.out.print("Etudiant2, Nom Prenom : " + " " + etud2.nom + "  " + etud2.prenom + " \n");
         

       int lenght ;
       float[] notes ;
       
       System.out.println("entrez les numbres des note que vous voulez mettre : ");
            lenght = scan.nextInt();
       notes = new float[lenght];
       System.out.println("entrez les notes");
       
       for (int i = 0 ; i<lenght ; i++){
           notes[i] =scan.nextInt();
          
        }

        System.out.println();
        
        String nom;
        String prenom;
        String id;
        
        System.out.println("entrez le nom de l'etudiant : ");
        nom= scan.next();
        System.out.println("entrez prenom de l'etudiant : ");
        prenom = scan.next();
        System.out.println("entrez votre ID : ");
        id = scan.next();
        
        etud1.modifieur(id, nom, prenom, notes, lenght);
        System.out.println("nom : " + etud1.nom + "  " + "prenom : " + etud1.prenom  + " ID : "  + etud1.getId() + " \n");
        System.out.println("les note que vous avez mis sont : " +  "\n");
        etud1.affichertab();
        System.out.println("les note aleatoires sont : " );
        etud1.ramtab();
        etud1.affichertab();
        
       
        etud1.moyenne();
        
        
    
       // float notes [] = new float[4];
       //System.out.println("note1 : ");
       //notes[0] = scan.nextFloat();
       //System.out.println("note2 : ");
       //notes[1] = scan.nextFloat();
       //System.out.println("note3 : ");
       //notes[2] = scan.nextFloat();
       //System.out.println("note4 : ");
       //notes[3] = scan.nextFloat();
       //System.out.print("ID : " + etud1.getId()  + "\n");

       
    }
    
}
