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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class SalaryPaySceneController implements Initializable {

    @FXML
    private TextField employeeIDTF1;
    @FXML
    private DatePicker dateOfJoiningDatePicker1;
    @FXML
    private DatePicker payPeriodFromDatePicker;
    @FXML
    private DatePicker payPeriodToDatePicker;
    @FXML
    private TextField designationTF1;
    @FXML
    private TextField workdaysTF;
    @FXML
    private ComboBox<String> earningTypeCB1;
    @FXML
    private TextField earningAmountTF1;
    @FXML
    private ComboBox<String> deductionTypeCB1;
    @FXML
    private TextField deductionAmountTF1;
    @FXML
    private AnchorPane payslipAnchorPane2;
    @FXML
    private TextArea paySlipOutputTextArea1;
    @FXML
    private TableView<SalaryPay> paySlipTableView;
    @FXML
    private TableColumn<SalaryPay,String> earningTypeTC;
    @FXML
    private TableColumn<SalaryPay, Float> earningAmountTC;
    @FXML
    private TableColumn<SalaryPay, String> deductionTypeTC;
    @FXML
    private TableColumn<SalaryPay, Float> deductionAmountTC;
    @FXML
    private TableColumn<SalaryPay, Float> amountToPayTC;
    @FXML
    private Label instituitionNameLabel1;
    @FXML
    private Label addressLabel1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createPaySlipButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showPySlipButtonMouseClick(ActionEvent event) {
    }

    @FXML
    private void sendToEmployeeButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
