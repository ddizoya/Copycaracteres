/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package copycaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ddizoya
 */
public class Copycaracteres {

    FileReader fr;
    FileWriter fw;
    String f1 = "/datos/local/ddizoya/Desktop/texto10.txt";
    String f2 = "/datos/local/ddizoya/Desktop/texto11.txt";
    File out;

    
    public void lecturaYescritura(){
        try {
            out = new File(f2);
            if (!out.exists())
                out.createNewFile();
            
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            int x;
            while ((x = fr.read()) !=-1){
                fw.write(x);
            } 
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copycaracteres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Copycaracteres.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Copycaracteres.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    

    public static void main(String[] args) {
        Copycaracteres obj = new Copycaracteres();
        obj.lecturaYescritura();
    }
    
}
