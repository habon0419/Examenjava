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
public class User extends Personne {
    
    private int id ;
    private String login ;
    private String pwd;

    public User() {
    }

    public User(int id, String login, String pwd, String Nom, String prenom) {
        super(Nom, prenom);
        this.id = id;
        this.login = login;
        this.pwd = pwd;
    }

    public User(String login, String pwd, String Nom, String prenom) {
        super(Nom, prenom);
        this.login = login;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return super.toString()+"Login:"+login+"Pwd:"+pwd; //To change body of generated methods, choose Tools | Templates.
       
    }
    
    
    
}
