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
public class Client extends Personne {
    
    private int id ;
    private String telephone ;
    private String address;
    
    //ManytoOne
    private Commande cmd;

    public Client() {
      
    }

    public Client(int id, String telephone, String address, String Nom, String prenom) {
        super(Nom, prenom);
        this.id = id;
        this.telephone = telephone;
        this.address = address;
    }

    public Client(String telephone, String address, String Nom, String prenom) {
        super(Nom, prenom);
        this.telephone = telephone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+"Telephone:"+telephone+"Address:"+address; //To change body of generated methods, choose Tools | Templates.
    }

    public Commande getCmd() {
        return cmd;
    }

    public void setCmd(Commande cmd) {
        this.cmd = cmd;
    }

   

    
    
    
   
    
    
    
   
}
