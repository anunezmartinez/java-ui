package javaFX.confirmBox;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class confirmBox {

    static boolean answer;

    public static void display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);

        Label label1 = new Label();
        label1.setText(message);

        Button buttonO1 = new Button();
        buttonO1.setOnAction(e -> {
            answer = true;
            System.out.println(answer);
            window.close();
        });
        buttonO1.setText("Yes");

        Button buttonO2 = new Button();
        buttonO2.setOnAction(e -> {
            answer = false;
            System.out.println(answer);
            window.close();
        });
        buttonO2.setText("No");

        VBox layout = new VBox(20);

        layout.getChildren().addAll(label1, buttonO1, buttonO2);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


    }
    
}