/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import bridge.options.Making;
import bridge.options.NoBeans;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AJuda
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choice = 1;
        
        
        if(choice == 1)
        {
            MakeCoffe makeCoffe = new ImplementMakeCoffe(CoffeType.latte
                    , new Making(), "no sugar");
            
            makeCoffe.make();
            System.out.println(makeCoffe.show());
        }
        else
        {
            MakeCoffe makeCoffe = new ImplementMakeCoffe(CoffeType.error
                    , new NoBeans(), "Error"); 
            
            makeCoffe.make();       
            System.out.println(makeCoffe.show());
        }
        
    }
    
}
