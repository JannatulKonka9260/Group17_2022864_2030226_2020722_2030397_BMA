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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class MonthlyOperationalExpenseReportSceneController implements Initializable {

    @FXML
    private Label instituitionNameLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label reportLabel;
    @FXML
    private TextField telephoneBillTF;
    @FXML
    private TextField electricityBillTF;
    @FXML
    private TextField printingandStationaryExpenseTF;
    @FXML
    private TextField repairOfFurnitureBillTF;
    @FXML
    private TextField waterAndSanitationBillTF;
    @FXML
    private TextField transportationFuelExpenseTF;
    @FXML
    private TableView<MonthlyOperationalExpenseReport> monthlyOEReportTableView;
    @FXML
    private TableColumn<MonthlyOperationalExpenseReport, String> nameTC1;
    @FXML
    private TableColumn<MonthlyOperationalExpenseReport, Integer> amount1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createMonthlyOperationalExpenseReportButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showMonthlyOperationalExpenseReportButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void sendToDOAButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
