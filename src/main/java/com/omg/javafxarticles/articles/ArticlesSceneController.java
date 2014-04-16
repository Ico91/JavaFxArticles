package com.omg.javafxarticles.articles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.omg.javafxarticles.main.ChangeableView;
import com.omg.javafxarticles.main.ScreenController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author default
 */
public class ArticlesSceneController extends VBox implements ChangeableView, Initializable{

    private ScreenController controller;
    
    public ArticlesSceneController() {
        
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @Override
    public void setController(ScreenController controller) {
        this.controller = controller;
    }
    
}
