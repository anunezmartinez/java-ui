package javaFX.embeddingLayouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String[] args) {
        
        launch(args);
    }

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        window.setTitle("Confirm Box testing");

        HBox topLayout = new HBox();       
        Button button = new Button("Test 1");
        Button button2 = new Button("Test 2");
        Button button3 = new Button("Test 2");
        Button button4 = new Button("Test 2");
        topLayout.setAlignment(Pos.CENTER);
        topLayout.getChildren().addAll(button, button2, button3, button4);

        VBox leftLayout  = new VBox();
        Button button5 = new Button("Test 1");
        Button button6 = new Button("Test 2");
        Button button7 = new Button("Test 2");
        Button button8 = new Button("Test 2");
        leftLayout.setAlignment(Pos.CENTER);
        leftLayout.getChildren().addAll(button5, button6, button7, button8);


        BorderPane borderLayout = new BorderPane();
        borderLayout.setTop(topLayout);
        borderLayout.setLeft(leftLayout);


        Scene scene = new Scene(borderLayout, 500, 500);

        window.setScene(scene);
        window.show();


    }
}