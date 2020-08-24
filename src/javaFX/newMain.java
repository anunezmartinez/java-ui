package javaFX;

import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;





public class newMain extends Application implements EventHandler<ActionEvent>{

    public static void main(final String[] args) {
        launch(args);
    }


    Button button, button2;
    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        primaryStage.setTitle("Hello World");


        Label label1 = new Label("Welcome the the fist scene.");	
        button = new Button();
        button.setText("Click me");
        button.setOnAction(e -> {
            window.setScene(scene2);
        });


        Label label2 = new Label("Welcome the the second scene.");
        button2 = new Button();
        button2.setText("Click me too");
        button2.setOnAction(e -> { 
            window.setScene(scene1);
        });


        

        VBox vLayout = new VBox(20);
        vLayout.getChildren().addAll(label1, button);
        scene1 = new Scene(vLayout, 500, 500);
        
        HBox layout = new HBox(20);
        layout.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout, 500, 500);
        
        

        window.setScene(scene1);
        window.show();


    }

     @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub

        //If statement to identify the source to know which element was triggered due an event.
        //if(event.getSource() == button){
         //   System.out.println("Hello World");
       // }

    } 
}