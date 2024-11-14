/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

/**
 *
 * @author norah
 */
import java.io.IOException;

public class Information {
 String content;
 FileHandler file;
 

  public Information(FileHandler file) {
        this.file = file;
    }   
    
public void addNewInformation(String section,String problem,String solution) throws IOException {
   content= "SECTION :"+section + "\n\nPROBLEM:"+problem+   "\nSOLUTION : " +solution  ;
    file.writeData(content);
}

}
