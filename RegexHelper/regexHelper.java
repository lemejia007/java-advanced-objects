
// RegexHelper.java
// This programm allows the user to enter a regular expression that they would 
// like to test, text that they would like to match against, a string to replace 
// match(es) with and it will then display the new texted with the requested 
// replacement(s). 

package regexhelper;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegexHelper extends Application 
{
   @Override
   public void start(Stage stage) throws Exception 
   {
      Parent root = 
         FXMLLoader.load(getClass().getResource("RegexHelper.fxml"));

      Scene scene = new Scene(root); // Attach scene graph to scene
      stage.setTitle("Regex Helper"); // Displayed in window's title bar
      stage.setScene(scene); // Attach scene to stage
      stage.show(); // Display the stage
   }

   public static void main(String[] args) 
   {
      // Create an EnhancedTipCalculator object and call its start method
      launch(args); 
   }
}
