package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.List;

public class FileWriter {
    public static void  writeToFile(List<String> lines){
        try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("C:\\Users\\panchal.kumar\\IdeaProjects\\Dec5-FindHandling\\src\\target.txt"))){
            for(String line : lines){
                bw.write(line);
                bw.write("\n");
            }
        }catch (Exception e){
        }
    }
}
