package UserInterface;

//En masse imports fra javafx.scene
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Her anvendes ikke MVC-princippet på samme måde som med "AskQuestion".
 *
 * @author dani832m
 */
public class UI extends Application { //JavaFX extender altid klassen "Application"

    Label message;

    //Metoden "start" overrides som altid i FX-apps
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane(); //Laver ny BorderPane - læs mere i README-filen

        //Først laves en MenuBar som tilføjes
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        //Dernæst laves en fileMenu, som skal bruges i toppen af vinduet med forskellige muligheder
        Menu fileMenu = new Menu("Vælg her");

        //Opretter menupunkter som skal bruges til menuen
        MenuItem newMenuItem = new MenuItem("Ny");
        MenuItem saveMenuItem = new MenuItem("Gem");
        MenuItem printMenuItem = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");

        //Lukket vinduet, hvis muligheden "Exit" vælges
        exitMenuItem.setOnAction(actionEvent->Platform.exit());

        menuBar.getMenus().addAll(fileMenu);

        //Tilføjer de nye MenuItems til FileMenu
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem,printMenuItem,
                new SeparatorMenuItem(), exitMenuItem);

        //Deklarerer ny label og tre nye knapper
        message = new Label("Klik på en af navnene for at se, hvilke fag de underviser i.");
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();

        //Tilføjer tekst, der skal stå på de tre knapper
        btn1.setText("Karsten Vandrup");
        btn2.setText("Douglas Beaver");
        btn3.setText("Ándras Ács");

        //Hvad skal der ske, når vi trykker på den første knap? (Karsten Vandrup)
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                message.setText("Lærer i Virksomhed og Teknologi.");
                message.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
                message.setTextFill(Color.FIREBRICK);
            }
        });

        //Hvad skal der ske, når vi trykker på den anden knap? (Douglas Beaver)
        btn2.setOnAction((ActionEvent e)-> {
            message.setText("Lærer i Systemudvikling og Database.");
            message.setFont(Font.font("Comic Sans ms", FontWeight.BOLD, 20));
            message.setTextFill(Color.DARKSLATEGREY);
        });

        //Hvad skal der ske, når vi trykker på den tredje knap? (Ándras Ács)
        btn3.setOnAction((ActionEvent e)-> {
            message.setText("Lærer i Programmering.");
            message.setFont(Font.font("Jokerman", FontWeight.BOLD, 30));
            message.setTextFill(Color.FUCHSIA);
        });

        root.setCenter(message);

        VBox buttons = new VBox();
        buttons.setSpacing(20);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(btn1, btn2, btn3);

        root.setLeft(buttons);
        root.setTop(menuBar);

        Scene scene = new Scene(root, 600, 250);

        primaryStage.setTitle("UserInterface Playground");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
