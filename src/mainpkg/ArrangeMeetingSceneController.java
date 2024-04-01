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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class ArrangeMeetingSceneController implements Initializable {

    @FXML
    private TextField meetingTimeTF;
    @FXML
    private DatePicker meetingDatePicker1;
    @FXML
    private ComboBox<String> sendtoEmployeeCB2;
    @FXML
    private TableView<MeetingSchedule> meetingScheduleTableView;
    @FXML
    private TableColumn<MeetingSchedule, Integer> employeeIDTC2;
    @FXML
    private TableColumn<MeetingSchedule, String> meetingDateTC1;
    @FXML
    private TableColumn<MeetingSchedule, String> meetingTimeTC1;
    @FXML
    private ComboBox<Integer> employeeforMeetingCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendMeetingScheduleToEmployeeButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void setMeetingScheduleButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showMeetingScheduleButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
