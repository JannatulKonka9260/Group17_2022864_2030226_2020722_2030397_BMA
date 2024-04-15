/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Asus
 */
public class Sceen8medicalcreateworkscheduleController implements Initializable {

    @FXML
    private TextField workschedule;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> nameofthework;
    @FXML
    private TableColumn<?, ?> typeandothers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void senttoadmistrator(ActionEvent event) {
    }
    
}
