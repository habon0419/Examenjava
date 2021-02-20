/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;


import dao.DaoCommande;
import dao.DaoDetailcommande;
import dao.DaoPersonne;
import java.util.List;
import models.Article;
import models.Client;
import models.Commande;
import models.Detailcommande;
import models.Personne;
import models.User;



/**
 *
 * @author habon
 */
public class Service {
    
     private DaoCommande daoCommande;
     private DaoPersonne daoPersonne;
     private DaoDetailcommande  daoDetailcommande;
    
    
     public Service() {
      daoCommande=new DaoCommande();
      daoPersonne=new DaoPersonne();
     }
     
      public List<Personne> ajouterClient(Commande commande){
       return daoPersonne.findByCommande(commande);
   }
    
     
   public boolean mettreEnFormeLaCommande(Commande commande){
       
       int nbreLigne=daoCommande.insert(commande);
      if(nbreLigne==0) return false; else  return true;
      
    }
    
   public List<Commande> selectionnerClient(){
       return daoCommande.findaAll();
   }
    
    
    public boolean  creerPersonne(Personne pers){
        return daoPersonne.insert(pers)!=0;
          
    }
    
    public Article rechercherClient(String telephone){
        
         return daoPersonne.findClientByTelephone(telephone);
       
    }
    
    public boolean gererArticle(Commande command,Article article,String Commande,String articleCommande,String quantiteCommande){
        
        if(article.getId()==0){
            int id= daoPersonne.insert(article);
            article.setId(id);
        }
        
        Detailcommande detailcommande(commande,articleCommande,quantieCommande,article,commande)
        
        return daoDetailcommande.insert(detailcommande)!=0;
    }

    public Personne seConnecter(String login, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
    
   
