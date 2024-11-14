/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
 private FileWriter writeManual;
 private File readManual;
  public FileHandler() throws IOException {
         creatFile();
    }


  
    
  public void creatFile () throws IOException {
  
  writeManual = new FileWriter("Manual.txt");
  readManual = new File("Manual.txt");
  }
  //---------------------------------
   public void writeData (String content) throws IOException {
   writeManual.write(content);
   writeManual.flush();
   
   
   }
  
    
}