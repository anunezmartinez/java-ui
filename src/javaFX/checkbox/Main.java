package javaFX.checkbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
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
        window.setTitle("Validate");

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        Button buttonInput = new Button("Order now!");
        buttonInput.setOnAction(e -> {
            handleOptions(box1, box2);

        });


        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(box1, box2, buttonInput);


        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);

        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2){

        String message = "User's order : \n";

        if(box1.isSelected()){
            message += box1.getText();
            System.out.print(message);
        }
        if(box2.isSelected()){
            message += box2.getText();
            System.out.print(message);
        }
    };
}
