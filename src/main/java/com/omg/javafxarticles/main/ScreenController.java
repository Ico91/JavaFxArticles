/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omg.javafxarticles.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

/**
 *
 * @author default
 */
public class ScreenController extends StackPane {

    private final Map<String, Node> screens;

    public ScreenController() {
        screens = new HashMap<>();
    }

    public void addScreen(String name, Node screen) {
        this.screens.put(name, screen);
    }

    public void loadScreen(String name, String resource) throws IOException {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
        Parent loadScreen = (Parent) myLoader.load();
        ChangeableView myScreenControler
                = (ChangeableView) myLoader.getController();
        myScreenControler.setController(this);
        addScreen(name, loadScreen);
    }

    public void setScreen(String name) {

    }

}
