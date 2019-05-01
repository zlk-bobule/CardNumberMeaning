package zlk.cnm.viewcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import java.io.*;

public class MeaningController {

    @FXML
    private Label c_number2;

    @FXML
    private Label c_number1;

    @FXML
    private Label c_number3;

    @FXML
    private Label province;

    @FXML
    private Label dailyUse;

    @FXML
    private Label model;

    @FXML
    public void initialize() {
        String read = "";
        String res = "";
        try(FileReader reader = new FileReader("save.txt");
        BufferedReader bufferedReader = new BufferedReader(reader)){
            while ((read = bufferedReader.readLine()) != null) {
                res = read;
            }
            bufferedReader.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(res.length()>=12){
            c_number1.setText(res.substring(0,4));
            c_number2.setText(res.substring(4,8));
            c_number3.setText(res.substring(8,12));
        }
        setDailyUse(res.substring(4,8));
    }

    /**
     * 设置省份
     * @param c_number1
     */
    private void setProvince(String c_number1){
        char c = c_number1.charAt(0);
        switch (c){
            case '0':
                province.setText("山东");
                break;
            case '1':
                province.setText("江苏");
                break;
            case '2':
                province.setText("浙江");
                break;
            case '3':
                province.setText("安徽");
                break;
            case '4':
                province.setText("福建");
                break;
            case '5':
                province.setText("湖北");
                break;
            case '6':
                province.setText("湖南");
                break;
            case '7':
                province.setText("四川");
                break;
            case '8':
                province.setText("重庆");
                break;
            case '9':
                province.setText("广东");
                break;
            case 'A':
                province.setText("海南");
                break;
            case 'B':
                province.setText("江西");
                break;
            case 'C':
                province.setText("北京");
                break;
            case 'D':
                province.setText("河北");
                break;
            case 'E':
                province.setText("河南");
                break;
            case 'F':
                province.setText("青海");
                break;
            default:
                break;

        }
    }

    /**
     * 设置货物种类
     * @param c_number2
     */
    private void setDailyUse(String c_number2){
        char c = c_number2.charAt(0);
        if(c>='0'&&c<='3'){
            dailyUse.setText("生活用品");
        }else if(c>='4'&&c<=7){
            dailyUse.setText("食品");
        }else if(c=='8'||c=='9'||c=='A'||c=='B'){
            dailyUse.setText("衣物");
        }else{
            dailyUse.setText("书籍");
        }
    }

    /**
     * 设置型号
     * @param c_number3
     */
    private void setModel(String c_number3){
        char c = c_number3.charAt(0);
        if(c>='0'&&c<='4'){
            model.setText("小型");
        }else if(c>='5'&&c<='9'){
            model.setText("中型");
        }else{
            model.setText("大型");
        }
    }

}
