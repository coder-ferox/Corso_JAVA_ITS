/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * DANILO CAPPELLINO CORSO JAVA 16-05-2017
 */

/*private String codice;
    private Categoria categoria;
    private String nomeprodotto;
    private String descrizioneprodotto;
    private double prezzo;
    private int giacenza;
*/

public class testnuovoprodotto {
    
    public static void main(String[] args){
    
        Prodotto p = new Prodotto("P01","CPU","Xeon 123 1GHZ","Procio potente",499.99,200);
        
        System.out.println(p);
    
    
    }
}
