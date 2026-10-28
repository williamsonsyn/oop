/*
    Assignment 10: I/O reading and writing to files, streams
    PAWAN KOSHTI
    125B1F079
    A2
*/
/*Develop a Java program for analyzing
log files using I/O operations to read and process log data from files. Implement a log
files reader that reads log entries from a text file and analyzes them to extract useful
information such as error counts, warning messages. Utilize file streams and buffered
readers to efficiently read log files line by line and perform analysis tasks */

import java.io.*;
import java.util.*;

public class assignment10{
    public static void main(String[] args)
    {
        int errorCount = 0;
        int warningCount = 0;

        ArrayList<String> warnings = new ArrayList<>();

        try
        {
            // Open log file
            FileReader fr = new FileReader("log.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null)
            {
                if (line.contains("ERROR"))
                {
                    errorCount++;
                }

                if (line.contains("WARNING"))
                {
                    warningCount++;
                    warnings.add(line);
                }
            }
            br.close();

            // Display result
            System.out.println("Log Analysis Report");
            System.out.println("-------------------");
            System.out.println("Total Errors: " + errorCount);
            System.out.println("Total Warnings: " + warningCount);

            System.out.println("\nWarning Messages:");
            for (String warning : warnings)
            {
                System.out.println(warning);
            }

            // Write result to output file
            FileWriter fw = new FileWriter("analysis.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Log Analysis Report");
            bw.newLine();
            bw.write("-------------------");
            bw.newLine();

            bw.write("Total Errors: " + errorCount);
            bw.newLine();

            bw.write("Total Warnings: " + warningCount);
            bw.newLine();
            bw.newLine();
            bw.write("Warning Messages:");
            bw.newLine();

            for (String warning : warnings)
            {
                bw.write(warning);
                bw.newLine();
            }
            bw.close();

            System.out.println("\nAnalysis saved to analysis.txt");
        }
        catch (IOException e)
        {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
