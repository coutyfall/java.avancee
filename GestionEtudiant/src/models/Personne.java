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
public abstract class Personne {
    protected int id;
    protected String nomcomplet;
    protected String type;
    private String login;
    private String mdp;

    public Personne() {
    }

    public Personne(int id, String nomcomplet) {
        this.id = id;
        this.nomcomplet = nomcomplet;
    }

    public Personne(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public Personne(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nomcomplet=" + nomcomplet + '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    


    
    
}
