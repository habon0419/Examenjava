/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Commande;

/**
 *
 * @author habon
 */
public class DaoCommande {
    
     private final String SQL_INSERT="INSERT INTO `commande` (`id`, `numCommande`, `dateCommande`, `client`) VALUES (NULL, '1000', '', '');"; 
     private final String SQL_SELECT_ALL="select * from commande";
    
    
    
    public int insert(Commande commande){
         int nbreLigne=0;
         
         return nbreLigne;
    }
    
    public List<Commande> findAll(){
        List<Commande>lCommande=new ArrayList<>();  
        
         return lCommande;
        
    }   

    public List<Commande> findaAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
