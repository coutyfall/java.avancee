/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Personne;
import models.Professeur;

/**
 *
 * @author Couty
 */
public class DaoPersonne {
    private final String SQL_SELECT_BY_CLASSE="select * personne where type='Etudiant'and classe_id=?";
    
    private final String SQL_INSERT="INSERT INTO `personne` (`classe.id`, `nom_complet`, `tuteur`, `modules`, `grade`, `type`) VALUES ( ?, ?, ?, ?, ?, ?);";
    private final String SQL_INSERT_PROFESSEUR="select * where from matricule=?";
    private final String SQL_SELECT_ALL="select * from personne where type='Professeur'";
public List<Personne> findByClasse(Classe classe){
    List<Personne> lEtudiants=new ArrayList<>();
    //Recuperation
    return lEtudiants;
    
}

public int insert (Personne pers){
    int nbreLigne=0;
    //Traitement Insertion
    return nbreLigne;
    
  }
public Professeur findProfesseurByMatricule(String matricule){
    Professeur professeur=null;
    //Recherche
    return professeur;
}
 public List<Personne> findAll(){
        List <Personne> lProfesseurs=new ArrayList<>();
        
        //Remplir la list
        return lProfesseurs;
    }

}
