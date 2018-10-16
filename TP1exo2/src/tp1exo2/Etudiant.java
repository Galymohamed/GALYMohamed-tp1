/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1exo2;

import java.util.Random;

public class Etudiant {

    private String id;
    private float notes[];
    private int taille;
    public String nom, prenom;

    public Etudiant() {
        this.id = null;
        this.taille = 0;
        this.nom = null;
        this.prenom = null;
    }

    public String getId() {
        return this.id;
    }
    public float[] getNotes() {
        return this.notes;
    }
    public void setId(String id) {
        this.id = id;
    }
      public void setNotes(float notes[]) {
        this.notes = notes;
    }

    public Etudiant(float notes[]) {
        this.notes = notes;
        taille = notes.length;
    }

    public void modifieur (String id, String nom, String prenom,float notes[], int taille ) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.taille = taille;
        this.notes = notes;
    }
    public void affichertab (){
        for (int i=0; i<taille; i++){
            System.out.println(notes[i]);
        }
        }

   public void ramtab (){
        
           Random rand = new Random();
           
           for (int i = 0; i<taille; i++){
            notes [i] = rand.nextInt(20);
           }
           
   }
   public float moyenne() {
        float [] n =  getNotes();
	float sum = (float) 0.0;
	for (int i = 0; i < n.length; i++) {
	    sum += n[i];
            
	}
        float moy = sum / (float) n.length;
        System.out.print("le moyenne de note aleatoires est : " + moy + "\n");
	return  sum / (float) n.length;  
    }


}


