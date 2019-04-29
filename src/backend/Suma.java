package backend;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristal
 */
public class Suma {
    
    private int valor;
    
    public Suma() {
        valor = 0;
    }
    
    public void incrementar() {
        valor++;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "" + valor;
    }
}
