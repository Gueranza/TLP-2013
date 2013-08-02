/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unvaq.tlp.fbdata.utils;

import java.io.File;
import java.util.List;

/**
 *
 * @author Stefano
 */
public class Photo {
    private File _photo;
    private List<Comment> _comments;

    public File getPhoto() {
        return _photo;
    }

    public void setPhoto(File _photo) {
        this._photo = _photo;
    }

    public List<Comment> getComments() {
        return _comments;
    }

    public void setComments(List<Comment> _comments) {
        this._comments = _comments;
    }
    
    
}
