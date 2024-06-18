package secao17.testes;

// Java Program to differenciate between
// BufferedReader and FileReader in Java
 
// Reading lines using BufferedReader
 
// Import necessary classes
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
// Class
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        FileReader reader;
 
        // Try block to check exceptions
        try {
 
            // A Reader that reads creates an input
            // character stream
            // and reads characters from it
            reader = new FileReader("C://temp//geeks.txt");
 
            // Creating a BufferedReader object (instance)
            //  that 16Kb in buffer in the memory
            BufferedReader buffer
                = new BufferedReader(reader, 16384);
 
            // Custom input
            // A string to store the lines
            String line = "";
 
            // Maintaining real time count using
            // currentTimeMillis() method to get time taken
            // to read the data
            long initialTime = System.currentTimeMillis();
            while (true) {
 
                // Try block to check exceptions
                try {
 
                    // readLine() method of BufferedReader
                    // returns
                    //  a whole line at a time
                    line = buffer.readLine();
                }
 
                // Catch block to handle exceptions
                catch (IOException e) {
 
                    // Print the line where exception
                    // occurred
                    e.printStackTrace();
                }
 
                // When the read head reaches the "End Of
                // File" the readLine method returns null
                if (line == null)
                    break;
 
                // Prints the line
                System.out.println(line);
            }
 
            // New line
            System.out.println();
 
            // Display the time taken to read the data
            System.out.println("Time taken : "
                               + (System.currentTimeMillis()
                                  - initialTime));
 
            // Try block to check exceptions
            try {
 
                // Close all the streams
                buffer.close();
                reader.close();
            }
 
            // Catching only exceptions those occurred
            // only during closing streams
            catch (IOException e) {
 
                // Prints the line number where exception
                // occurred
                e.printStackTrace();
            }
        }
 
        // Catch block
        catch (FileNotFoundException e) {
 
            // print the exception only if
            // the file not found
            e.printStackTrace();
        }
    }
}