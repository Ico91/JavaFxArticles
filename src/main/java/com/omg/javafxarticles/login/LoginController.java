/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.login;

import com.omg.javafxarticles.main.ChangeableView;
import com.omg.javafxarticles.main.ScreenController;
import com.omg.javafxarticles.main.Screens;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author default
 */
public class LoginController extends AnchorPane implements ChangeableView, Initializable {
    @FXML
    private LoginComponent loginComponent;
    private ScreenController controller;
    
    public LoginController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    @FXML
    public void login() {
        loginComponent.setOnLogin(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if(loginComponent.isValidUser()) {
                    controller.setScreen(Screens.ARTICLES_SCREEN);
                }
            }
        });
    }

    @Override
    public void setController(ScreenController controller) {
        this.controller = controller;
    }
}
