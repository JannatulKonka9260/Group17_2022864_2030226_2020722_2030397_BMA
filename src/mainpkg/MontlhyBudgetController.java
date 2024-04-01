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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class MontlhyBudgetController implements Initializable {

    @FXML
    private TextField weaponAndProtectiveGearLabel;
    @FXML
    private TextField medicalLabel;
    @FXML
    private TextField educationLabel;
    @FXML
    private TextField foodLabel;
    @FXML
    private TextField transportationLabel;
    @FXML
    private TableView<MonthlyBudget> monthlyBudgetTableView;
    @FXML
    private TableColumn<MonthlyBudget, String> nameTC;
    @FXML
    private TableColumn<MonthlyBudget, Integer> amountTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createMonthlyBudgetButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showMonthlyBudgetButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void sendToDOAButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
