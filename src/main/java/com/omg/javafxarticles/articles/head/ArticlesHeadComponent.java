/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.articles.head;

import com.omg.javafxarticles.articles.Component;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author default
 */
public class ArticlesHeadComponent extends Component {
    
    private static final String RESOURCE_URL = "/fxml/articles/head/ArticlesHead.fxml";
    
    @FXML
    private Button btnNew;
    @FXML
    private Button btnLogout;
    
    public ArticlesHeadComponent() {
       super(RESOURCE_URL);
        
    }
    
}
