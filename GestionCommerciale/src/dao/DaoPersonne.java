/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Article;
import models.Commande;
import models.Personne;

/**
 *
 * @author habon
 */
public class DaoPersonne {
    
      private final String  SQL_SELECT_BY_Commande="";
       private final String SQL_INSERT="INSERT INTO `personne` (`nom`, `prenom`) VALUES (?,?);";
        private final String SQL_SELECT_Client="select * from personne "
                                  + " where telephone=?";
        
      
       public List<Personne> findByCommande(Commande commande){
          List<Personne> lArticle=new ArrayList<>();
          
          return lArticle;
        }

   public int insert(Personne pers){
          int numCommande=0;
                  
          return numCommande;        
   }
   
      public Article findClientByTelephone(String reference){
          
          Article article=null;
          
           return article;
      }

    public int insert(Article article) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
