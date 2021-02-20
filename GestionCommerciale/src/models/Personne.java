/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author habon
 */
public abstract class Personne {
   
    protected String Nom;
    protected String prenom;
  
    
     //Defaut

    public Personne() {
    }

    public Personne(String Nom, String prenom) {
        this.Nom = Nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" + "Nom=" + Nom + ", prenom=" + prenom + '}';
    }

   
    

   

  
    
    
}
