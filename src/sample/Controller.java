package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {


    @FXML
    private ImageView progressbar0;

    @FXML
    private ImageView progressbar10;

    @FXML
    private TextField score;

    @FXML
    void onProgressBar10(MouseEvent event) {
        progressbar10.setVisible(false);
        progressbar0.setVisible(true);
    }

    @FXML
    void onProgressbar0(MouseEvent event) {
        progressbar0.setVisible(false);
        progressbar10.setVisible(true);
    }

    @FXML
    void setScore(ActionEvent event) {
        String string = score.getText();

        if(Integer.parseInt(string) >= 10){
            System.out.println("over 10");
            progressbar0.setVisible(false);
            progressbar10.setVisible(true);
        }
        else {
            System.out.println("under 10");
            progressbar10.setVisible(false);
            progressbar0.setVisible(true);
        }
    }
}
