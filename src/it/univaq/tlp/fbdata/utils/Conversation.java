/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.tlp.fbdata.utils;

import java.util.List;

/**
 *
 * @author Stefano
 */
public class Conversation {
    private Friend _receiver;
    private List<Message> _messages;

    public Friend getReceiver() {
        return _receiver;
    }

    public void setReceiver(Friend _receiver) {
        this._receiver = _receiver;
    }

    public List<Message> getMessages() {
        return _messages;
    }

    public void setMessages(List<Message> _messages) {
        this._messages = _messages;
    }
    
    
}
