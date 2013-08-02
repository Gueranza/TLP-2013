/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unvaq.tlp.fbdata.utils;

import java.util.List;

/**
 *
 * @author Stefano
 */
public class Album {
    private String _name;
    private List<Photo> _photos;

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public List<Photo> getPhotos() {
        return _photos;
    }

    public void setPhotos(List<Photo> _photos) {
        this._photos = _photos;
    }
    
}
