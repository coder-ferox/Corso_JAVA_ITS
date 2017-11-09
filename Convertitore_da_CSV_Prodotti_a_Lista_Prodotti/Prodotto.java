/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *Cappellino Danilo - Programmazione in Java - 16-05-2017
 * 
 */
public class Prodotto {
    
    private String codice;
    private String categoria;
    private String nomeprodotto;
    private String descrizioneprodotto;
    private double prezzo;
    private int giacenza;

    public Prodotto() {
    }

    
    
    public Prodotto(String codice, String categoria, String nomeprodotto, String descrizioneprodotto, double prezzo, int giacenza) {
        this.codice = codice;
        this.categoria = categoria;
        this.nomeprodotto = nomeprodotto;
        this.descrizioneprodotto = descrizioneprodotto;
        this.prezzo = prezzo;
        this.giacenza = giacenza;
    }

    
    
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomeprodotto() {
        return nomeprodotto;
    }

    public void setNomeprodotto(String nomeprodotto) {
        this.nomeprodotto = nomeprodotto;
    }

    public String getDescrizioneprodotto() {
        return descrizioneprodotto;
    }

    public void setDescrizioneprodotto(String descrizioneprodotto) {
        this.descrizioneprodotto = descrizioneprodotto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(int giacenza) {
        this.giacenza = giacenza;
    }

    @Override
    public String toString() {
        return "Cod.: " + codice + "\nCategoria: " + categoria + "\nProdotto: " + nomeprodotto + "\nDescrizione: " + descrizioneprodotto + "\nPrezzo (IVA Esclusa): " + prezzo + "\nGiacenza: " + giacenza;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prodotto other = (Prodotto) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

    
    
    
}
