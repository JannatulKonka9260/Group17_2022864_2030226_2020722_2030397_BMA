/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import mainpkg.FinancialPolicy;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */


public class FinancialPolicySceneController implements Initializable {

    @FXML
    private TextArea writeFinancialPolicyTA;
    @FXML
    private TextArea showFinancialPolicyTA;
    
    FinancialPolicy f1;
    @FXML
    private DatePicker lastUpdated1;

    /**
     * Initializes the controller class.
     
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void createFinancialPolicyButtonMouseOnClick(ActionEvent event) {
        f1= new FinancialPolicy(
        writeFinancialPolicyTA.getText(),
                lastUpdated1.getValue()
        );
    }

    @FXML
    private void sendToDOAButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showFinancialPolicyButtonMouseOnClick(ActionEvent event) {
        showFinancialPolicyTA.setText(f1.toString());
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
