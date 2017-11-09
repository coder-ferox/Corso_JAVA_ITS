/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * DANILO CAPPELLINO CORSO JAVA 16-05-2017
 */
public class Ordine implements Serializable {
    
    final static double IVA = 22;
    
    private Prodotto cpu,ram,hd,monitor,tastiera,mouse;
    private Cliente cliente;

    public Ordine() {
    }

    public Prodotto getCpu() {
        return cpu;
    }

    public void setCpu(Prodotto cpu) {
        this.cpu = cpu;
    }

    public Prodotto getRam() {
        return ram;
    }

    public void setRam(Prodotto ram) {
        this.ram = ram;
    }

    public Prodotto getHd() {
        return hd;
    }

    public void setHd(Prodotto hd) {
        this.hd = hd;
    }

    public Prodotto getMonitor() {
        return monitor;
    }

    public void setMonitor(Prodotto monitor) {
        this.monitor = monitor;
    }

    public Prodotto getTastiera() {
        return tastiera;
    }

    public void setTastiera(Prodotto tastiera) {
        this.tastiera = tastiera;
    }

    public Prodotto getMouse() {
        return mouse;
    }

    public void setMouse(Prodotto mouse) {
        this.mouse = mouse;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public 
    
    
}
