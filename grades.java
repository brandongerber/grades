/*
 * Brandon Gerber
 * COP1250C
 * 11/13/2023
 * Added pseudocode resubmission
 
 * declare variables 
  	countA = 0
	countB = 0
	countC = 0
	countD = 0
	countF = 0
	
	- open grades.txt file
	
	-read lines from file
	
	-find letter based on percent 
	if(grade >= 90 && grade <= 100)
	increment countA
	.......
	>80 <89
	increment countB
	.......
	>70 <79
	increment countC
	.......
	>60 <69
	increment countD
	else
	increment countF
	
	close file
	
	display results
	
 */
package grades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class grades {
    public static void main(String[] args) {
        // Initialize counters for each grade
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader("C:\\grades.txt"));

            // Read each line (grade) from the file
            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line is not empty
                if (!line.isEmpty()) {
                    int grade = Integer.parseInt(line.trim());

                    // Determine the letter grade based on the given scale
                    if (grade >= 90 && grade <= 100) {
                        countA++;
                    } else if (grade >= 80 && grade <= 89) {
                        countB++;
                    } else if (grade >= 70 && grade <= 79) {
                        countC++;
                    } else if (grade >= 60 && grade <= 69) {
                        countD++;
                    } else {
                        countF++;
                    }
                }
            }

            // Close the file
            reader.close();

            // Display the counts for each letter grade
            System.out.println("Number of A grades: " + countA);
            System.out.println("Number of B grades: " + countB);
            System.out.println("Number of C grades: " + countC);
            System.out.println("Number of D grades: " + countD);
            System.out.println("Number of F grades: " + countF);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}