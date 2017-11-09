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
public class TestAuto {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW","X5",Cilindrata.DUEMILA,Alimentazione.DIESEL,Colore.NERA_METALLIZZATA,true);
        System.out.println(bmw+"\n");
        
        Auto panda30 = new Auto("Panda","30",Cilindrata.MILLE,Alimentazione.METANO,Colore.ROSSO,false);
        System.out.println(panda30+"\n");
        
    }
    
    
    
    
}
