package AskQuestion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    //Deklarerer label til overskriften
    @FXML
    private Label overskrift;

    //Deklarerer label til svaret
    @FXML
    private Label svar;

    //Deklarerer label til infoteksten
    @FXML
    private Label info;

    @FXML
    //Hvad skal der ske, når der klikkes på knappen?
    private void handleButtonAction(ActionEvent event) {

        int tilfaeldigtTal = (int)(Math.random() * 8); //Genererer et tilfældigt tal fra 0-7
        System.out.println("Det tilfældige tal er: " + tilfaeldigtTal); //Til debugging

        if(tilfaeldigtTal == 0) {
            svar.setText("Absolut, ja! Før det ud i livet!");
        }
        else if(tilfaeldigtTal == 1) {
            svar.setText("Hell no! Dårlig idé! Drop det!");
        }
        else if(tilfaeldigtTal == 2) {
            svar.setText("Både og. Jeg synes, du skal tænke lidt over det.");
        }
        else if(tilfaeldigtTal == 3) {
            svar.setText("Sikke da et spørgsmål! Giver svaret ikke sig selv?");
        }
        else if(tilfaeldigtTal == 4) {
            svar.setText("Et glas mælk ville være en bedre idé, min ven.");
        }
        else if(tilfaeldigtTal == 5) {
            svar.setText("Yeeees! Du har totalt fat i den lange ende!");
        }
        else if(tilfaeldigtTal == 6) {
            svar.setText("Har du talt med din mor om den idé?");
        }
        else if(tilfaeldigtTal == 7) {
            svar.setText("Det kan jeg simpelthen ikke svare på...");
        }

        info.setText("Herunder står svaret. Stil mig et nyt spørgsmål.");
    }
}
