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
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal=new Animal();
        
//      try{            
            animal.comer();
            System.out.println(animal.color);
//          }catch(Exception ex){
//            
//              System.err.println("Contactese con el Administrador");
//        }
        
    }
    
}
