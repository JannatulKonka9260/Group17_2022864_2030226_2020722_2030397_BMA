/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class MontlhyBudgetSceneController implements Initializable {

    @FXML
    private TextField budgetmonth;
    @FXML
    private TextField weaponAndProtectiveGearTF;
    @FXML
    private TextField medicalTF;
    @FXML
    private TextField educationTF;
    @FXML
    private TextField foodTF;
    @FXML
    private TextField transportationTF;

    /**
     * Initializes the controller class.
     */ MonthlyBudget m1;
    @FXML
    private DatePicker budgetDate;
    @FXML
    private TextArea displaybudgetTA;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void createMonthlyBudgetButtonMouseOnClick(ActionEvent event) {
        m1= new MonthlyBudget(
        budgetmonth.getText(),
        Float.parseFloat(weaponAndProtectiveGearTF.getText()),
        Float.parseFloat(medicalTF.getText()),
        Float.parseFloat(educationTF.getText()),
        Float.parseFloat(foodTF.getText()), 
        Float.parseFloat(transportationTF.getText()),
                budgetDate.getValue()
        );
        
    }

    @FXML
    private void showMonthlyBudgetButtonMouseOnClick(ActionEvent event) {
        displaybudgetTA.setText( m1.toString());
       
                }

    @FXML
    private void sendToDOAButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) throws IOException {
       
        
            Parent sceneA= FXMLLoader.load(getClass().getResource("loginScene.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
      }
       
     
    }
    

