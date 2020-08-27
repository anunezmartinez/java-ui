package javaFX.alertBox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class alertBox {
    public static void displayAlert(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);

        Label label1 = new Label();
        label1.setText(message);

        Button closeButton = new Button();
        closeButton.setOnAction(e -> window.close());
        closeButton.setText("Close");

        VBox layout = new VBox(20);

        layout.getChildren().addAll(label1, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
}