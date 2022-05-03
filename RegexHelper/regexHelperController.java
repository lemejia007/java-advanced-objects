
// RegexHelperController.java
package regexhelper;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*; 
import java.util.regex.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class RegexHelperController implements Initializable {

  @FXML 
  private TextField regexToTestTextField; 
 
  @FXML 
  private TextArea textToMatchAgainstTextArea; 
    
  @FXML 
  private TextField replaceMatchWithTextField; 
    
  @FXML 
  private TextArea newReplacedTextTextArea; 
   
  @FXML
  private void replaceButtonPressed(ActionEvent event) {
    try {
      
      // Get the regex to be checked
      String regexToTest = new String(regexToTestTextField.getText());
      
      // Get the text to match against
      String textToMatchAgainst = new String(textToMatchAgainstTextArea.getText());
      
      // Get the string to replace match with
      String replaceMatchWith   = new String(replaceMatchWithTextField.getText());
      
      // Replace match
      textToMatchAgainst = textToMatchAgainst.replaceAll(regexToTest, replaceMatchWith);
      
      // Output the new replaced text out to the Text Area
      newReplacedTextTextArea.setText(textToMatchAgainst);
    }
    catch (Exception e) {
      regexToTestTextField.setText("Try a different expression");
      regexToTestTextField.selectAll();
      regexToTestTextField.requestFocus();
         
      textToMatchAgainstTextArea.setText(" ");
      textToMatchAgainstTextArea.selectAll();
      textToMatchAgainstTextArea.requestFocus();
         
      replaceMatchWithTextField.setText(" ");
      replaceMatchWithTextField.selectAll();
      replaceMatchWithTextField.requestFocus();
      }
    }
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
      
    }
}
