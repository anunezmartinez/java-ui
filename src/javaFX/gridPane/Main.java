package javaFX.gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        window = primaryStage;
        window.setTitle("Grid Pane JavaFX");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10,10));
        grid.setVgap(25);
        grid.setHgap(25);

        //Name label
        Label nameLabel = new Label("Username ");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input
        TextField nameInput = new TextField("test");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password label
        Label passLabel = new Label("Username ");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        TextField passInput = new TextField("test");
        GridPane.setConstraints(passInput, 1, 1);

        //Log Button
        Button logButton = new Button("Log In");
        GridPane.setConstraints(logButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, logButton);

        Scene scene = new Scene(grid, 300, 300);


        window.setScene(scene);
        window.show();

    }
}