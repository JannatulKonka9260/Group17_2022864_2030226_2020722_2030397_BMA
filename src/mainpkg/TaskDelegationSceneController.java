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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class TaskDelegationSceneController implements Initializable {

    @FXML
    private TextField taskTF1;
    @FXML
    private DatePicker deadlineforTaskDatePicker1;
    @FXML
    private ComboBox<?> taskForTF1;
    @FXML
    private TextArea taskOuputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createTaskButtonMouseOnClicked(ActionEvent event) {
    }

    @FXML
    private void showTasksButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void taskDelegateButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
