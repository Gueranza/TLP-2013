/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unvaq.tlp.fbdata.utils;

/**
 *
 * @author Stefano
 */
public class Friend {
    private String _name;
    private String _email;
    
    public void setName(String name){
        _name = name;
    }
    
    public void setEmail(String email){
        _email = email;
    }
    
    public String getName(){
        return _name;
    }
    
    public String getEmail(){
        return _email;
    }
}
