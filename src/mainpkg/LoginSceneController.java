/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mehedi
 */
public class LoginSceneController implements Initializable {

    @FXML
    private ComboBox<String> personnelCombobox;

    /**
     * Initializes the controller class.
     */
    ArrayList<User> userList;
    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField passwordField;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        personnelCombobox.getItems().addAll("Director of Administration","Finance Officer", "Faculty", 
        "Chief Medical Officer","Cadet", "Battalion Commander", "Human Resource Officer", "Transportation Monitoring Officer");
    
    
    
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
        
        /*
        if(personnelCombobox.getValue()=="Director of Administration")
        {
            Parent sceneA= FXMLLoader.load(getClass().getResource("dashboardDOA.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
      }
        
        else if(personnelCombobox.getValue()=="Finance Officer")
        {
            Parent sceneA= FXMLLoader.load(getClass().getResource("dashboardFinanceOfficerScene.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
      }
        
        
*/
        
        userList= new ArrayList<User>();
    
    userList.add(new User("1","mehedi1","Director of Administration") );
    userList.add(new User("2","mehedi2","Finance Officer") );
     userList.add(new User("3","mehedi3","Faculty") );
      userList.add(new User("4","mehed4","Chief Medical Officer") );
       userList.add(new User("5","mehedi5","Cadet") );
        userList.add(new User("6","mehedi6","Battalion Commander") );
         
    
    
         try{
                FileOutputStream fos = new FileOutputStream("personnel.bin",true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(User u: userList)
                    oos.writeObject(u);
                oos.close();
            }
            catch(Exception e){
                //SHOW e.toString() IN AN ALERT
            }
                //SHOW ex.toString() IN AN ALERT
             
                
            //file reading
              
            ObjectInputStream ois=null;
         try {
             User u;
             FileInputStream fis = new FileInputStream("personnel.bin");
             ois = new ObjectInputStream(fis);
             //ois = new ObjectInputStream(new FileInputStream("StudObjects.bin"));
             
          
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                u = (User) ois.readObject();
                //s.getId();               
                //Object obj = ois.readObject();
                //obj.toString();
                //studArr.add((Student) ois.readObject());
                if(idTextField.getText().equals(u.getId()) && passwordField.getText().equals(u.getPassword()))
                {
                    if(idTextField.getText().contains("2"))
                    {
                   Parent sceneA= FXMLLoader.load(getClass().getResource("dashboardFinanceOfficerScene.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();  
                    }
                    
                    if(idTextField.getText().contains("1"))
                    {
                   Parent sceneA= FXMLLoader.load(getClass().getResource("dashboardDOA.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();  
                    }
                    
                    if(idTextField.getText().contains("3"))
                    {
                   Parent sceneA= FXMLLoader.load(getClass().getResource("LoginasFacultyMember.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();  
                    }
                    
                    if(idTextField.getText().contains("4"))
                    {
                   Parent sceneA= FXMLLoader.load(getClass().getResource("LoginasChiefMedicalOfficer.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();  
                    }
                    
                     if(idTextField.getText().contains("5"))
                    {
                   Parent sceneA= FXMLLoader.load(getClass().getResource("Scene2viewtrainingschedule.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();  
                    }
                     
                     if(idTextField.getText().contains("6"))
                    {
                   Parent sceneA= FXMLLoader.load(getClass().getResource("Scene18viewtrainingpersonalrank.fxml"));
        
        
        Scene sceneB = new Scene (sceneA);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();  
                    }
                }
                //outputTxtArea.appendText(s+"\n");
            }
            //ois.close();
                       
        }
        catch(RuntimeException e){
            e.printStackTrace();
             //
        }
        catch (Exception ex) {
           
            try {
                System.out.println(ex.toString());
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

                
            }
    
}


