package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    public TextField height;
    public TextField weight;

    public Label bmi;
    public Label result;


    public void buttonClicked(){

        double userHeight;
        double userWeight;
        double userBMI;

        String usersResult = "";

        userHeight =Double.parseDouble(height.getText());
        userWeight =Double.parseDouble(weight.getText());

        // formula of BMI = weight / height^2

        userBMI = userHeight*userHeight;
        userBMI = userWeight/userBMI;

        bmi.setText("BMI is " +userBMI);

        if(userBMI<18.5){
            usersResult =" Under Weight";
        }
        else if(userBMI>18.5 && userBMI<25){
            usersResult =" Normal";
        }
        else if(userBMI>25){
            usersResult= " Over Weight";
        }
        result.setText("You are"+usersResult);

    }





}
