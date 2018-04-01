package AskQuestion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author dani832m
 */
//Klassen skal altid extende Application, når vi arbejder med JavaFX
public class AskQuestion extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Setter properties for primaryStage
        primaryStage.setTitle("Spørg mig om alt!");
        primaryStage.setScene(new Scene(root, 505, 230));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    //Main-metoden kører vores applikation
    public static void main(String[] args) {
        launch(args);
    }
}
