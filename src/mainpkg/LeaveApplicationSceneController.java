/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class LeaveApplicationSceneController implements Initializable {

    @FXML
    private TextField employeeIDTF2;
    @FXML
    private ComboBox<String> leaveTypeCB;
    @FXML
    private DatePicker startDateCB1;
    @FXML
    private DatePicker endDateCB1;
    @FXML
    private RadioButton halfdayRadioButton;
    @FXML
    private RadioButton fullDayRadioButton;
    @FXML
    private TextArea reasonTA1;
    @FXML
    private TextArea outputLeaveApplicationTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showLeaveApplicationBuuttonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void createLeaveApplicationButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
