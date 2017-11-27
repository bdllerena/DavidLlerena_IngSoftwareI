/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.animal;

/**
 *
 * @author Sele
 */
public class Animal {
    public String color;
    
    public void comer() throws RuntimeException
    { 
        
        System.out.println("El animal esta comiendo");         
        throw new RuntimeException();
    }
    
       
}
