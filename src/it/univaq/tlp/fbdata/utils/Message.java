/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.tlp.fbdata.utils;

/**
 *
 * @author Stefano
 */
public class Message {
    private Friend _owner;
    private String _content;

    public Friend getOwner() {
        return _owner;
    }

    public void setOwner(Friend _owner) {
        this._owner = _owner;
    }

    public String getContent() {
        return _content;
    }

    public void setContent(String _content) {
        this._content = _content;
    }
    
    
}
