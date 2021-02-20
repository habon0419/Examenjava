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
public class Profil {
    
     private int id;
     private String nomProfil ;

    public Profil() {
    }

    public Profil(int id, String nomProfil) {
        this.id = id;
        this.nomProfil = nomProfil;
    }

    public Profil(String nomProfil) {
        this.nomProfil = nomProfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProfil() {
        return nomProfil;
    }

    public void setNomProfil(String nomProfil) {
        this.nomProfil = nomProfil;
    }

    @Override
    public String toString() {
        return "Profil{" + "id=" + id + ", nomProfil=" + nomProfil + '}';
    }
    
     
     
    
}
