/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.articles;

import com.omg.javafxarticles.articles.details.ArticlesDetailsComponent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author default
 */
public abstract class Component extends AnchorPane {
    
    public Component(String resource) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resource));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException ex) {
            Logger.getLogger(ArticlesDetailsComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
