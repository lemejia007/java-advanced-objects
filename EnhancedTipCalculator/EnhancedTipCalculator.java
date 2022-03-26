
// EnhancedTipCalculator.java
// Main application class that loads and displays the Tip Calculator's GUI.
// (This is a modified version of the orignal TipCalculator program in that this 
//  version of the program accepts user input for party size and will then  
//  calculate and display an individual total.)
package enhancedtipcalculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnhancedTipCalculator extends Application 
{
   @Override
   public void start(Stage stage) throws Exception 
   {
      Parent root = 
         FXMLLoader.load(getClass().getResource("EnhancedTipCalculator.fxml"));

      Scene scene = new Scene(root); // Attach scene graph to scene
      stage.setTitle("Enhanced Tip Calculator"); // Displayed in window's title bar
      stage.setScene(scene); // Attach scene to stage
      stage.show(); // Display the stage
   }

   public static void main(String[] args) 
   {
      // Create an EnhancedTipCalculator object and call its start method
      launch(args); 
   }
}


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
