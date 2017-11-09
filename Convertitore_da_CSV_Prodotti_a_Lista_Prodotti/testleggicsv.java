/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * DANILO CAPPELLINO CORSO JAVA 16-05-2017
 */
public class testleggicsv {
    
    public static void main (String[] args){
    
    ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();    
        
    Funzioni.csv2Prodotto("import.csv");
    
    
    
    
    for(Prodotto p : listaProdotti)
            System.out.println(p);
    }
    
}

