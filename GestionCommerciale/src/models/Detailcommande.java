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
public class Detailcommande {
    
     private String Commande;
     private String articleCommande;
     private String quantiteCommande;
     
      //ManytoOne
    private Article article ;
    private Commande commande;

    public Detailcommande() {
    }

    public Detailcommande(String Commande, String articleCommande, String quantiteCommande, Article article, Commande commande) {
        this.Commande = Commande;
        this.articleCommande = articleCommande;
        this.quantiteCommande = quantiteCommande;
        this.article = article;
        this.commande = commande;
    }

   
    
    

    public String getCommande() {
        return Commande;
    }

    public void setCommande(String Commande) {
        this.Commande = Commande;
    }

    public String getArticleCommande() {
        return articleCommande;
    }

    public void setArticleCommande(String articleCommande) {
        this.articleCommande = articleCommande;
    }

    public String getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(String quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

   

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    
    

   
    
    
    
    
}
