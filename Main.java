package T050325;

import tools.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
/**
 * Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main
{
    static JConsole con = new JConsole();
    public static void main(String args[]){ 
        con.setFontSize(25);   
        
        //methode1();
        methode2();
    }
    static void methode2(){
        try(FileWriter fw = new FileWriter(new File("neueDatei2")); BufferedWriter bw = new BufferedWriter(fw)){
            
        }catch(IOException exp){
            con.println("fehler");
        }
    }
    static void methode1(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
          fw = new FileWriter(new File("neueDatei"));  
          bw = new BufferedWriter(fw);
          
          bw.write("Moin zusammen");
        }catch(IOException exp){
            con.println("- fehler");
        }
        finally{
            try{
                bw.close();
                fw.close();
            }catch(IOException exp){
                
            }
        }
    }
 
}
