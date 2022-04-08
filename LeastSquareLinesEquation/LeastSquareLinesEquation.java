
// LeastSquareLinesEquation.java
// 
// This program prompts the user for the name of a text file, opens the provided 
// text file and reads in the ordered pair data (which is stored in the text 
// file in the format of: xxx.xxxxx yyy.yyyy where there is a space between the 
// numeric values and a carriage return/line feed after the last numeric value 
// on each line).

// Import declarations 
import java.io.File;
import java.io.IOException;
import java.lang.IllegalStateException; 
import java.util.NoSuchElementException; 
import java.util.Scanner; 

// Start of class LeastSquareLinesEquation 
public class LeastSquareLinesEquation { 
	
	// Main method 
	public static void main(String[] args) { 
			
		// Prompt user for a file 
		String  fileName = getFileFromUser(); 
		try {
			File file = new File(fileName);
			Scanner fileScan = new Scanner(file);  
			
			int    numOfOrderedPairs    = 0; 
			double sumOfX               = 0.0; 
			double sumOfY               = 0.0; 
			double sumOfSquareOfX       = 0.0; 
			double sumOfProductsOfXY    = 0.0; 
			
			// Read data
			while (fileScan.hasNextDouble()) { 
				double x          = fileScan.nextDouble();
				double y          = fileScan.nextDouble();
				sumOfX            += x; 
				sumOfY            += y; 
				sumOfSquareOfX    += (Math.pow(x, 2)); 
				sumOfProductsOfXY += (x * y); 
				numOfOrderedPairs++;	
			} 
				
			// Close fileScan Scanner object 
			if (fileScan != null) {
				fileScan.close();
			} 
			
			// Compute the regression coefficients m and b for the equation of the least 
			// squares line equation, where m is the slope and b is the y-intercept
			double averageOfX = (sumOfX / numOfOrderedPairs); 
			double averageOfY = (sumOfY / numOfOrderedPairs); 
			// Slope
		  double m = (sumOfProductsOfXY - (sumOfX * averageOfY)) / (sumOfSquareOfX - (sumOfX * averageOfX)); 
		  
		  // y-intercept
		  double b = (averageOfY - (m * averageOfX)); 
		         
		  // Output to the terminal 
		  System.out.printf("%n%s: y = %.5fx + %.5f%n", 
		  								  "Equation of least squares line", m, b); 
		}
		catch (NoSuchElementException | IllegalStateException | IOException e) {
			System.out.println("File could not open.");
		}
	
	} // End of main method 
	
	// Method getFileFromUser definition 
	public static String getFileFromUser() {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("\nEnter a file to open and read from: "); 
		String fileName = scan.nextLine(); 
		scan.close(); 
		
		return fileName; 
	} 
	
} // End of class LeastSquareLinesEquation
