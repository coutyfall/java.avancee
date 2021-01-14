/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Couty
 */
public class Etudiant  extends Personne{
    private String tuteur;
    //Association Many to one
    private Classe cl;
    
    
    
    public Etudiant() {
        super();
    }

    public Etudiant(String tuteur, String nomcomplet) {
        super(nomcomplet);
        this.tuteur = tuteur;
    }

    public Etudiant(int id, String nomcomplet) {
        super(id, nomcomplet);
    }

    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "tuteur=" + tuteur + '}';
    }

    public Classe getCl() {
        return cl;
    }

    public void setCl(Classe cl) {
        this.cl = cl;
    }

   

 
  
    
    
  
    }

 
