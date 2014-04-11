/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omg.javafxarticles.main;

import javafx.fxml.Initializable;

/**
 *
 * @author default
 */
public abstract class ChangeableView implements Initializable {

    protected ScreenController controller;

    /**
     *
     * @param controller
     */
    public void setController(ScreenController controller) {
        this.controller = controller;
    }

}
