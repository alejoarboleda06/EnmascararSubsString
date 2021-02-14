/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enmascararsubsstring;

/**
 *
 * @author user
 */
public class Tarjeta {
    
    String Numero;
    
    public Tarjeta(){
    
    }
    public Tarjeta(String Numero){
        this.Numero = Numero;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    public boolean validarTarjeta(String Tarjeta){
        
        return (Tarjeta.length()==19);
    }
    
    public String enmascararTarjeta(String Tarjeta){
        
        Tarjeta = Tarjeta.substring(0, 4)+" XXXX XXXX "+Tarjeta.substring(15, 19);
        return Tarjeta;
    }
    
}
