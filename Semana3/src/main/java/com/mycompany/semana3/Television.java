/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author user
 */
public class Television extends DispositivoElectronico {

    @Override
    public void encender(String d) {
        
        System.out.println(d + "Television Encendida");
    }
    
    public String cambiarcanal(){
        return "Television cambia de canal"; 
        
    }
    
}
