package Lesson_7.Model.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriterFile {
    
    public static void writeFile(StringBuilder sb, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            
            writer.write(sb.toString());
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }
    }

    public static void fileWrite(StringBuilder sb, String fileName, boolean n) {
        try(FileWriter writer = new FileWriter(fileName, n)) {
            
            writer.write(sb.toString());
            
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

    