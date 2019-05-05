package zlk.cnm.viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zlk.cnm.view.InputView;
import zlk.cnm.view.MeaningView;

import java.net.URL;
import java.util.ResourceBundle;

//import zlk.cnm.view.MeaningView;

public class InputController {

    @FXML
    private Label searchIcon;

    @FXML
    private TextField Search;

    @FXML
    public void initialize(){
    }

    public void clickSearchButton(){
        String cardNumber = Search.getText();
        MeaningView meaningView = new MeaningView(cardNumber);
        try {
            meaningView.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Search.clear();
    }

}
