/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencommercial;
import java.net.*;
import java.io.*;

/**
 *
 * @author SamVanSandt
 */
public class OpenCommercial {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */

    
    URL myURL = new URL("http://"+inputLine+".com/");
    URLConnection myURLConnection = myURL.openConnection();
    myURLConnection.connect();
    
    BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
    int i = 0;
    String[] x = new String[5];
    while(i < 5){
      x[i] = (in.readLine());
        i++;
    }
    for (int j = 4; j > 0; j--){
    System.out.println(x[j]);
    }
    
    in.close();
    
    }
}
    

