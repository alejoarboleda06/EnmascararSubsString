/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enmascararsubsstring;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EnmascararSubsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se declara la variable donde se almacenara la cadena leida por teclado
        String numTarjeta;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("MEDIANTE EL METODO SUBSTRING");
        System.out.println("Introduzca numero de tarjeta: ");
        numTarjeta = leer.nextLine();
        
        Tarjeta Enmascarar = new Tarjeta(numTarjeta);
        
        if(Enmascarar.validarTarjeta(numTarjeta)){
            
            String Mascara = Enmascarar.enmascararTarjeta(numTarjeta);
            
            System.out.println("Tarjeta Enmascarada: "+Mascara);
            
        }else{
            
            System.out.println("Introdujo una tarjeta incorrecta ...");
        }
    }
    
}
