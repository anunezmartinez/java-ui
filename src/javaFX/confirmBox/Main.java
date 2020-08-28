package javaFX.confirmBox;

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

        button.setOnAction(e -> {
            confirmBox.display("This is an confirm window.", "Do you drink water?");
        });

        StackPane layout = new StackPane();

        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 500, 500);

        window.setScene(scene);
        window.show();


    }
}