/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.tlp.fbdata.utils;

import java.util.Date;

/**
 *
 * @author Stefano
 */
public class Comment {
    private Friend _owner;
    private Date date;
    private String _comment;

    public Friend getOwner() {
        return _owner;
    }

    public void setOwner(Friend _owner) {
        this._owner = _owner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return _comment;
    }

    public void setComment(String _comment) {
        this._comment = _comment;
    }
    
    
    
}
