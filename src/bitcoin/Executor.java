/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcoin;

/**
 *
 * @author soja
 * @author Dario
 */
public class Executor {
    public static void main(String[] args){
        Corretora corretora = new Corretora();
        
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        
        c.start();
        c1.start();
}

    
}

   