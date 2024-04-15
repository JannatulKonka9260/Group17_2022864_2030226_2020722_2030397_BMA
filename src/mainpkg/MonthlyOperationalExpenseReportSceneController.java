/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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
    private TableView<MonthlyOperationalExpense> monthlyOEReportTableView;
    @FXML
    private TableColumn<MonthlyOperationalExpense, String> telephonebillTC;
    @FXML
    private TableColumn<MonthlyOperationalExpense, String> electricityTC;
    @FXML
    private TableColumn<MonthlyOperationalExpense, String> printingTC;
    @FXML
    private TableColumn<MonthlyOperationalExpense, String> furnitureTC;
    @FXML
    private TableColumn<MonthlyOperationalExpense, String> waterandsaniTC;
    @FXML
    private TableColumn<MonthlyOperationalExpense, String> fuelTC;

    /**
     * Initializes the controller class.
     */ArrayList<MonthlyOperationalExpense> expense;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        instituitionNameLabel.setText("Bangladesh Military Academy");
        
        addressLabel.setText("Hathazari Link Rd, Bhatiari");
        reportLabel.setText("Monthly Operational Expense Report");
        // TODO
        expense = new ArrayList<MonthlyOperationalExpense>();
       telephonebillTC.setCellValueFactory(
        new PropertyValueFactory<MonthlyOperationalExpense, String>("telephoneBill"));
       electricityTC.setCellValueFactory(
        new PropertyValueFactory<MonthlyOperationalExpense, String>("electricityBill"));
        printingTC.setCellValueFactory(
        new PropertyValueFactory<MonthlyOperationalExpense, String>("printingandStationaryBill"));
        furnitureTC.setCellValueFactory(
        new PropertyValueFactory<MonthlyOperationalExpense, String>("furnitureBill"));
        waterandsaniTC.setCellValueFactory(
        new PropertyValueFactory<MonthlyOperationalExpense, String>("waterAndsanitationBill"));
        fuelTC.setCellValueFactory(
        new PropertyValueFactory<MonthlyOperationalExpense, String> ("transportationfuelExpense"));
        
        
      
    }    

    @FXML
    private void createMonthlyOperationalExpenseReportButtonMouseOnClick(ActionEvent event) {
        
        expense.add(
        new MonthlyOperationalExpense(
          Float.parseFloat(telephoneBillTF.getText()),
           Float.parseFloat(electricityBillTF.getText()),
           Float.parseFloat(printingandStationaryExpenseTF.getText()) ,
              Float.parseFloat(repairOfFurnitureBillTF.getText()) ,
              Float.parseFloat(waterAndSanitationBillTF.getText()), 
        Float.parseFloat( transportationFuelExpenseTF.getText()) 
        ));
        
         
        
        telephoneBillTF.clear();
        electricityBillTF.clear();
       printingandStationaryExpenseTF.clear();
       repairOfFurnitureBillTF.clear();
        waterAndSanitationBillTF.clear();
        transportationFuelExpenseTF.clear();
        
    }

    @FXML
    private void showMonthlyOperationalExpenseReportButtonMouseOnClick(ActionEvent event) throws IOException {
        for( MonthlyOperationalExpense m: expense)
        {
            monthlyOEReportTableView.getItems().add(m);
        }
        
        
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
