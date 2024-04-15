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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Sceen2GradesubmissionController implements Initializable {

    @FXML
    private RadioButton full;
    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> namecoloumb;
    @FXML
    private TableColumn<?, ?> idcolomb;
    @FXML
    private TableColumn<?, ?> gradecolomb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selecttimeandsection(ActionEvent event) {
    }

    @FXML
    private void course(ActionEvent event) {
    }

    @FXML
    private void confirm(ActionEvent event) {
    }
    
}
