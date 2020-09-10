package javaFX.validateInput;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        TextField textInput = new TextField();
        Button buttonInput = new Button("Send");

        buttonInput.setOnAction( e -> {
            isInt(textInput, buttonInput);
            System.out.println("Button Clicked");
        });

        VBox layout = new VBox(25);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(textInput, buttonInput);



        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);

        window.show();
    }

    private boolean isInt(TextField input, Button button){
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println("The input is a number.");
            return true;
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            System.out.println("The input is not a number.");
            return false;
        }


        
    }
}