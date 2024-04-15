
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginasChiefMedicalOfficerController implements Initializable {

    @FXML
    private TextField cheifmedicalofficer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void listofnewaeipments(ActionEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("sceen1Selectcourse.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
    }

    @FXML
    private void placeorder(ActionEvent event)throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("sceen2medicalplaceorder.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
    }

    @FXML
    private void timeformedicalcase(ActionEvent event) {
       
    }

    @FXML
    private void showapproveordisapprove(ActionEvent event) {
    }

    @FXML
    private void applyleave(ActionEvent event) {
    }

    @FXML
    private void showassigntask(ActionEvent event) {
    }

    @FXML
    private void viewpayslip(ActionEvent event) {
    }

    @FXML
    private void crteateworkschedule(ActionEvent event) {
    }

    @FXML
    private void confirm(ActionEvent event) {
    }
    
}
