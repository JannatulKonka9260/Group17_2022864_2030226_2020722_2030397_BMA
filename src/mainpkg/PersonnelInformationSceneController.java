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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class PersonnelInformationSceneController implements Initializable {

    @FXML
    private TextField personnelIDTF1;
    @FXML
    private TextField previousDesignationTF2;
    @FXML
    private TextField currentDesignationTF1;
    @FXML
    private TableView<?> personnelTableVew;
    @FXML
    private TableColumn<?, ?> personnelIDTC1;
    @FXML
    private TableColumn<?, ?> previousDesignationTC1;
    @FXML
    private TableColumn<?, ?> currentDesignationTC1;
    @FXML
    private ComboBox<?> sendCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createPersonnelsRankingListButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void showPersonnelRankingListBuutonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void rankSendtoPersonnelMouseBuuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonMouseOnClick(ActionEvent event) {
    }
    
}
