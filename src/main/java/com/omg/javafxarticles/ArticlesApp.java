package com.omg.javafxarticles;

import com.omg.javafxarticles.main.ScreenController;
import com.omg.javafxarticles.main.Screens;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArticlesApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        ScreenController controller = new ScreenController(stage);
        controller.loadScreen(Screens.LOGIN_SCREEN, Screens.LOGIN_SCREEN_FXML);
        controller.loadScreen(Screens.ARTICLES_SCREEN, Screens.ARTICLES_SCREEN_XML);

        controller.setScreen(Screens.LOGIN_SCREEN);

        Group root = new Group();
        root.getChildren().addAll(controller);
        Scene scene = new Scene(root);

        stage.setTitle("JavaFX and Maven");
        stage.sizeToScene();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
