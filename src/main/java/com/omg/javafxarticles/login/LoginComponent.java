/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.login;

import com.omg.javafxarticles.articles.Component;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author krasimir
 */
public class LoginComponent extends Component {
    
    private static final String RESOURCE_URL = "/fxml/login/Login.fxml";
    
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfPassword;
    
    public LoginComponent() {
        super(RESOURCE_URL);
    }
}
