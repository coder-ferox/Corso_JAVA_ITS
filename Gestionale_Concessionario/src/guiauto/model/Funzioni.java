/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiauto.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cappellinod
 */
public class Funzioni {
    /**
     * Write on a file
     * @param fileName
     * @param list 
     */
    public static void write(String fileName, ArrayList<Auto> list){
    
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(list);
            oos.flush();
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Funzioni.java: FileNotFoundException");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
    }
    
    public static void maketxt(String filename){
        
        File F = new File(filename);
        
        if(F.exists())
            JOptionPane.showMessageDialog(null, "Il file esiste già");
        else
            try{
                if(F.createNewFile())
                    JOptionPane.showMessageDialog(null, "File creato");
                else
                    JOptionPane.showMessageDialog(null, "File non creato");
            } catch (IOException ex){
                ex.printStackTrace();
            }
    }
    
    public static void writetxt(String filename, String content){
        
        FileWriter FW = null;
        BufferedWriter BW = null;
        
        try{
            FW = new FileWriter(filename);
            BW = new BufferedWriter(FW);
        
            BW.write(content);
            BW.flush();
            BW.close();
            FW.close();
            //JOptionPane.showMessageDialog(null, "Salvataggio Riuscito");
        }catch (IOException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Funzioni.writetxt: "+ex);
        }
        
        
    }
    
    /**
     * Read a file
     * @param fileName
     * @return ArrayList<> read
     */
    public static ArrayList<Auto> read(String fileName){
        
        ArrayList<Auto> list = new ArrayList<>();
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            
            Object obj = ois.readObject();
            if (obj instanceof ArrayList) {
                list = (ArrayList) obj;
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Non hai ancora creato una lista di auto");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IOException");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ClassNotFoundException");
        } finally {
            if(fis != null)
                fis = null;
            if(ois != null)
                ois = null;
        }
        
        return list;  
    }
    
      
    
    /**
     * Append on a file
     * @param fileName
     * @param person
     */
    public static void append(String fileName, Auto auto){
        
        ArrayList<Auto> list = read(fileName);
        list.add(auto);
        write(fileName, list);
    }       
    
    /**
     * Search a person by his index
     * @param index
     * @param fileName
     * @return Person found
     */
    public static Auto searchByPosition(int index, String fileName){
        
        ArrayList<Auto> list = read(fileName);
        Auto p = list.get(index);
        
        return p;        
    }
    
    /**
     * Find an index by its istance 
     * @param fileName
     * @param list
     * @param p
     * @return index found
     */
    public static int searchByIstance(String fileName, ArrayList<Auto> list, Auto auto){
        
        int index = -1;
        
        try{
            index = list.indexOf(auto);
	}catch(Exception e){
            JOptionPane.showMessageDialog(null, "Auto not found");
        }
                
        return index;
    }
    
    /**
     * Delete a person
     * @param fileName
     * @param list
     * @param index
     * @return the element removed if the operation is successful, null if not  
     */
    public static Auto delete(String fileName, ArrayList<Auto> list, int index){
        
        Auto auto = list.get(index);
        if(list.remove(index) != null)
            write(fileName, list);
        
              
        return auto;
    }
    
    
    
    
}


