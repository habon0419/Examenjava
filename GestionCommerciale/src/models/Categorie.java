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
public class Categorie {
    
      private int id;
    private String NomCategorie;

    public Categorie() {
    }

    public Categorie(int id, String NomCategorie) {
        this.id = id;
        this.NomCategorie = NomCategorie;
    }

    public Categorie(String NomCategorie) {
        this.NomCategorie = NomCategorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCategorie() {
        return NomCategorie;
    }

    public void setNomCategorie(String NomCategorie) {
        this.NomCategorie = NomCategorie;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", NomCategorie=" + NomCategorie + '}';
    }

    
    
    
    
    
}
