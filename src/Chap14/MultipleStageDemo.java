package Chap14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * I denne klasse:
 * Laver to stages - default primaryStage og en ny kaldet "stage".
 * Begge stages gives en scene som argument, og show-metoden kaldes på dem begge.
 * Resultatet bliver, at der åbnes to nye vinduer (stages) med hvert deres indhold (scenes og nodes)
 *
 * Øvelsen stammer fra kapitel 14 i lærebogen. Listing 14.2.
 */
public class MultipleStageDemo extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create a scene and place a button in the scene
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        Stage stage = new Stage(); // Create a new stage
        stage.setTitle("Second Stage"); // Set the stage title
        // Set a scene with a button in the stage
        stage.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}