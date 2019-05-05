package zlk.cnm.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InputView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/Input.fxml"));
        Scene scene = new Scene(root,496,173);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.setTitle("输入卡号");
        primaryStage.show();
    }

    /**
     * 显示输入界面
     */
    public void showView(){
        Application.launch(InputView.class);
    }
}
