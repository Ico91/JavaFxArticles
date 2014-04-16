/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omg.javafxarticles.main;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author default
 */
public class ScreenController extends StackPane {
    private final Stage stage;
    private final Map<String, Node> screens;

    public ScreenController(Stage stage) {
        screens = new HashMap<>();
        this.stage = stage;
    }

    public void addScreen(String name, Node screen) {
        this.screens.put(name, screen);
    }

    public void loadScreen(String name, String resource) throws IOException {

        URL location = getClass().getResource(resource);

        FXMLLoader fxmlLoader = new FXMLLoader();

        Parent loadScreen = (Parent) fxmlLoader.load(location.openStream());

        ChangeableView myScreenController = (ChangeableView) fxmlLoader.getController();

        myScreenController.setController(this);

        addScreen(name, loadScreen);
    }

    public boolean setScreen(String name) {
        if (screens.get(name) != null) {
            if (!getChildren().isEmpty()) {
                getChildren().remove(0);
                getChildren().add(0, screens.get(name));
            } else {
                getChildren().add(screens.get(name));
            }
            stage.sizeToScene();
            stage.centerOnScreen();
            return true;
        }
        System.out.println("screen hasn't been loaded!\n");
        return false;
    }

}
