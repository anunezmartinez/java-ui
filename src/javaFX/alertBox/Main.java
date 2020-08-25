package javaFX.alertBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        window.setTitle("Alert Box testing");

        button = new Button("Click me to show an alert.");

        StackPane layout = new StackPane();

        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 500, 500);

        window.setScene(scene);
        window.show();


    }
    
}