/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Couty
 */
public class Professeur extends Personne {
    
    private String grade;
    private List<String> modules=new ArrayList();
    private String matricule;

    public Professeur() {
         type="Personne";
    }

    public Professeur(String grade, String nomcomplet) {
        super(nomcomplet);
        this.grade = grade;
         type="Personne";
    }

    public Professeur(String grade, int id, String nomcomplet) {
        super(id, nomcomplet);
        this.grade = grade;
         type="Personne";
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }
    

    @Override
    public String toString() {
        return super.toString()+ "Grade:"+grade;//To change body of generated methods, choose Tools | Templates.
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    
    
    
    
}
