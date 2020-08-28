package javaFX.closeProgram;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        window.setTitle("Properly closing the program testing");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Close.");

        button.setOnAction(e -> {
            closeProgram();
        });

        StackPane layout = new StackPane();

        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 500, 500);

        window.setScene(scene);
        window.show();


    }

    private void closeProgram(){
        Boolean answer = confirmBox.display("Closing", "Are you sure you want to close the program?");
        if(answer){
            window.close(); 
        }
    };

}