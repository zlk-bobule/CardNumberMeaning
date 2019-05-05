package zlk.cnm.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MeaningView extends Application {

//    private String number;

    public MeaningView(){}

    public MeaningView(String number){
        try{
            File file = new File("save.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            //先清空文件
            FileWriter fw1 = new FileWriter(file);
            fw1.write("");
            fw1.flush();
            fw1.close();
            //写入
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(number);
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/CardNumberMeaning.fxml"));
        Scene scene = new Scene(root,532,370);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.setTitle("卡号信息");
        primaryStage.show();
    }

    /**
     * 读卡号，显示读卡界面
     */
//    public void showView(){
//        try{
//            File file = new File("save.txt");
//            if(!file.exists()){
//                file.createNewFile();
//            }
//            //先清空文件
//            FileWriter fw1 = new FileWriter(file);
//            fw1.write("");
//            fw1.flush();
//            fw1.close();
//            //写入
//            FileWriter fw = new FileWriter(file, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(number);
//            bw.flush();
//            bw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        Application.launch(MeaningView.class);
//    }
}
