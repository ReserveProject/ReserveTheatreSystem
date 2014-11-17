/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author Administrator
 */
public class Clerk {

    // field
    protected String name;
    protected String id;
    protected String tel;

    //constructor
    Clerk(String name, String id, String tel) {
        this.setName(name);
        this.setID(id);
        this.setTel(tel);
    }

    //method
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(String id){
        return id;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

}
