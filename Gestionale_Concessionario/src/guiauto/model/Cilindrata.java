/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiauto.model;

/**
 *
 * @author cappellinod
 */
public enum Cilindrata {
    MILLE(1000),MILLEDUECENTO(1200),MILLEQUATTROCENTO(1400),MILLESEICENTO(1600),DUEMILA(2000);
    
    private int cc;
   
    
    public int getCC(){
        return cc;
    }
    
    Cilindrata(int cc){
        this.cc=cc;
    }

    @Override
    public String toString() {
        return "" + cc;
    }
    
    
    
}

