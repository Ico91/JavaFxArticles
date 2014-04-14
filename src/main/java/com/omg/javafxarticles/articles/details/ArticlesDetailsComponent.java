/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.articles.details;

import com.omg.javafxarticles.articles.Component;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author default
 */
public class ArticlesDetailsComponent extends Component {
    
    private static final String RESOURCE_URL = "/fxml/articles/details/ArticlesDetails.fxml";
    
    @FXML
    private TextField articleTitle;
    @FXML
    private TextArea articleContent;
    
    @FXML
    private Button btnSave;
    @FXML
    private Button btnReset;
    
    public ArticlesDetailsComponent() {
        super(RESOURCE_URL);
        
    }
    
    @FXML
    private void saveButtonAction(ActionEvent event) {
        String title = articleTitle.getText();
        String content = articleContent.getText();
        
    }
    
    @FXML
    private void resetButtonAction(ActionEvent event) {
        articleTitle.setText("");
        articleContent.setText("");
    }
}
