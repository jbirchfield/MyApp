/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acrostic;

import org.me.mylib.LibClass;

/**
 *
 * @author jamesb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result = LibClass.acrostic(args);
        System.out.println("Result = " + result);    
    }
}
