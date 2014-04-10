/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author krasimir
 */
public class LoginComponent extends AnchorPane {
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfPassword;
    
    public LoginComponent() {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/login/Login.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
