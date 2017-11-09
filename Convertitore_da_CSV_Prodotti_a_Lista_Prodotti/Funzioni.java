/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *DANILO CAPPELLINO CORSO JAVA 16-05-2017
 * 
 */
public class Funzioni {
    
    
      
    
    /**Legge file di testo e lo trasforma in stringa
     * 
     * @param path : String
     * @return output : String
     */
     
    public static String leggiCSV(String path){
        
		String output = "";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			output = br.readLine();
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 

		return output;
    }
    
    /**Legge un file di testo, lo converte in stringa, trasforma ogni riga in un oggetto e lo aggiunge ad una lista Prodotto 
     * 
     * @param path : String 
     */
    
    public static ArrayList<Prodotto> csv2Prodotto (String path)
    {
       Scanner inputStream = null;
       Prodotto p1 = null;
       ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();
       
       try {
            inputStream = new Scanner(new File (path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
       while (inputStream.hasNextLine()) {
            String riga = inputStream.nextLine();
            p1 = string2product (riga);
            listaProdotti.add(p1);
       }
       return listaProdotti;
    }
    
    /**Raccoglie una stringa di testo e produce un oggetto Prodotto
     * 
     * @param input : String
     * @return p : Prodotto
     */
    
    public static Prodotto string2product (String input){
        
          
        Prodotto p = null;
        
        String codice;
        int giacenza;
        double prezzo;
        String categoria;
        String nomeprodotto;
        String descrizioneprodotto;
        
        String[] prodotto = input.split(";");
        System.out.println(input);
        codice = prodotto[0];
        categoria = prodotto[1];
        nomeprodotto = prodotto[2];
        descrizioneprodotto = prodotto[3];
        prezzo = Double.parseDouble(prodotto[4]);
        giacenza = Integer.parseInt(prodotto[5]);
        
        p = new Prodotto(codice,categoria,nomeprodotto,descrizioneprodotto,prezzo,giacenza);
        
        return p;
    }

    
    
    
}
