/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mianatra_java;
import jc.Horse;
import jc.Pegasus;
/**
 *
 * @author Ramih
 */
public class Main {
    public static void main(String[] arg){
        Horse h=new Horse("bory");
        h.move(45, 53);
        Pegasus p=new Pegasus("le pega");
        p.move(123, 45);
        p.fly(23);
    }
    
}
