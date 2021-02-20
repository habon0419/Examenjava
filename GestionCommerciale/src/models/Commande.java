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
public class Commande {
    
    private int id;
    private int numCommande;
    private String dateCommande  ;
    private String client;

    public Commande() {
    }

    public Commande(int id, int numCommande, String dateCommande, String client) {
        this.id = id;
        this.numCommande = numCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public Commande(int numCommande, String dateCommande, String client) {
        this.numCommande = numCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", numCommande=" + numCommande + ", dateCommande=" + dateCommande + ", client=" + client + '}';
    }

   
    
    
    
    
    
    
}
