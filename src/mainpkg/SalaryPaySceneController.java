/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView<SalaryPay> paySlipTableView;
    @FXML
    private TableColumn<SalaryPay,String> earningTypeTC;
    @FXML
    private TableColumn<SalaryPay,String> earningAmountTC;
    @FXML
    private TableColumn<SalaryPay,String> deductionTypeTC;
    @FXML
    private TableColumn<SalaryPay,String> deductionAmountTC;
  
    @FXML
    private Label instituitionNameLabel1;
    @FXML
    private Label addressLabel1;

    /**
     * Initializes the controller class.
     */
    
    ArrayList<SalaryPay> payslip;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        // TODO
        
        
        earningTypeCB1.getItems().addAll("Basic", "Incentive Pay", "House Rent Allowance", "Meal Allowance") ;       
        deductionTypeCB1.getItems().addAll("Provident Fund", "Professional Tax", "Loan");
        payslip= new ArrayList<SalaryPay>();
        
        instituitionNameLabel1.setText("Bangladesh Military Academy");
        addressLabel1.setText("Hathazari Link Rd, Bhatiari" );
        
        earningTypeTC.setCellValueFactory(
        new PropertyValueFactory<SalaryPay,String>("earningType"));
       earningAmountTC.setCellValueFactory(
        new PropertyValueFactory<SalaryPay,String>("earningAmount"));
        deductionTypeTC.setCellValueFactory(
        new PropertyValueFactory<SalaryPay,String>("deductionType"));
        deductionAmountTC.setCellValueFactory(
        new PropertyValueFactory<SalaryPay,String>("deductionAmount"));
       
        
        
    }    

    @FXML
    private void createPaySlipButtonMouseOnClick(ActionEvent event) {
        
       
        payslip.add(
        
     new SalaryPay(
             
             Integer.parseInt(employeeIDTF1.getText()),
             dateOfJoiningDatePicker1.getValue(),
             designationTF1.getText(),
             payPeriodFromDatePicker.getValue(),
             Integer.parseInt(workdaysTF.getText()),
             earningTypeCB1.getValue().toString(),
             Float.parseFloat(earningAmountTF1.getText()),
              deductionTypeCB1.getValue(),
             Float.parseFloat(deductionAmountTF1.getText())
             
     )  
     
     );
        
        
        
    }

    @FXML
    private void showPySlipButtonMouseClick(ActionEvent event) {
        
        for(SalaryPay p: payslip)
        {
            paySlipTableView.getItems().add(p);
        }
    }

    @FXML
    private void sendToEmployeeButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
