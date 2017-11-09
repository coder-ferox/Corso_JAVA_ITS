/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiauto.model;

import java.io.Serializable;

/**
 *
 * @author cappellinod
 */
public class Auto implements Serializable {
    private String marca;
    private String modello;
    private Cilindrata cilindrata;
    private Alimentazione alimentazione;
    private Colore colore;
    private boolean isTurbo;

    public Auto() {}
   
    public Auto(String marca, String modello, Cilindrata cilindrata, Alimentazione alimentazione, Colore colore, boolean isTurbo) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.alimentazione = alimentazione;
        this.colore = colore;
        this.isTurbo = isTurbo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public Cilindrata getCilindrata() {
        return cilindrata;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public Colore getColore() {
        return colore;
    }

    public boolean isIsTurbo() {
        return isTurbo;
    }

    public int getCilindrataCC(){
        return cilindrata.getCC();
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setCilindrata(Cilindrata cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setAlimentazione(Alimentazione alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public void setIsTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }
    
    public int velocitaMax(){
		int v = getCilindrataCC() / 10;
		
		switch(alimentazione){
		case BENZINA : v+=50; break;
		case DIESEL : v+=30; break;
		case GPL : v+=10; break;
		case METANO : v-=20; break;
                case ELETTRICA : v-=30; break;
		default : v+=0; 
		
		}
		return v;
	}
    
    public int velocitaMaxTurbo(){
        
        if(isTurbo)
            return velocitaMax()+30;
        else
            return velocitaMax();
    }

    @Override
    public String toString() {
        String prtTurboStatus="";
        if(isTurbo) prtTurboStatus="SI"; else prtTurboStatus="NO";
        return "Marca: " + marca + "\r\nModello: " + modello + "\r\nCilindrata: " + getCilindrataCC() + "\r\nAlimentazione: " + alimentazione + "\r\nColore: " + colore + "\r\nTurbo: " + prtTurboStatus + "\r\nVelocità Max: " + velocitaMaxTurbo() + " Km/h\n";
    }
    
    
    
    
    
}

