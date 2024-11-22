package project.group.cpit251;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Jr
 */
public class FileHandler {


    private String fileName = "data.txt";

    public FileHandler() {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error initializing the file: " + e.getMessage());
        }
    }

    // Add new information
    public void addNewInformation(String section, String problem, String solution) throws IOException {
        String content = "SECTION: " + section + "\n" +
                         "PROBLEM: " + problem + "\n" +
                         "SOLUTION: " + solution + "\n\n";
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(content);
        writer.close();
        System.out.println("New information added successfully!");
    }

    // Update a solution
    public void updateSolution(String keyword, String newSolution) throws IOException {
        List<String> lines = readData();
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("SOLUTION:") && lines.get(i).contains(keyword)) {
                lines.set(i, "SOLUTION: " + newSolution);
            }
        }
        writeData(lines);
        System.out.println("Solution updated successfully!");
    }

    // Search for information
    public void search(String keyword) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            if (line.contains(keyword)) {
                System.out.println(line);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching information found.");
        }
        reader.close();
    }

    // Print all information
    public void printAllInformation() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    // Helper methods
    private List<String> readData() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }

    private void writeData(List<String> data) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (String line : data) {
            writer.write(line + "\n");
        }
        writer.close();
    }
}

    
