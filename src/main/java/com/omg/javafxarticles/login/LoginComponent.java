/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.login;

import com.omg.javafxarticles.articles.Component;
import com.omg.javafxarticles.main.Screens;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author krasimir
 */
public class LoginComponent extends Component {
    
    private static final String RESOURCE_URL = "/fxml/login/LoginComponent.fxml";
    
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfPassword;
    @FXML
    private Button btnLogin;
    
    public LoginComponent() {
        super(RESOURCE_URL);
    }
    
    /**
     *
     * @param handler
     */
    public void setOnLogin(EventHandler<MouseEvent> handler) {
        btnLogin.setOnMouseClicked(handler);
   }
    
    public boolean isValidUser() {
        return "admin".equals(tfUsername.getText()) && "admin".equals(tfPassword.getText());
    }
}
