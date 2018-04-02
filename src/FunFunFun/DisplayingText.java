package FunFunFun;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class DisplayingText extends Application {

    @Override
    public void start(Stage stage) {
        //Creating a Text object
        Text text = new Text();

        //Setting font to the text
        text.setFont(new Font(55));

        //Setting color to the text
        text.setFill(Color.YELLOW);

        //Setting the position of the text
        text.setX(175);
        text.setY(150);

        //Setting the text to be added.
        text.setText("dani832m");

        //Creating a Group object
        Group root = new Group();

        //Retrieving the observable list object
        ObservableList list = root.getChildren();

        //Setting the text object as a node to the group object
        list.add(text);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting color to the scene
        scene.setFill(Color.BROWN);

        //Setting title to the Stage
        stage.setTitle("Hutlihut!");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}