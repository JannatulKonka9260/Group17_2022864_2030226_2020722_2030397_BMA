/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
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
public class Sceen1medicalofficernewequipmentsController implements Initializable {

    @FXML
    private TextField showlist;
    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> nameoftheequipments;
    @FXML
    private TableColumn<?, ?> numbers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
