/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author norah
 */
public class CPIT251 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    FileHandler file=new FileHandler();
   
    System.out.print("Enter the name of the SECTION:");
    String Section = in.nextLine();
    System.out.print("Enter the PROBLEM:");
    String Problem = in.nextLine();
    System.out.print("Enter the SOLUTION:");
    String  Solution = in.nextLine();
    Information data=new Information(file);
    data.addNewInformation(Section,Problem,Solution);
    

    
    }
}
