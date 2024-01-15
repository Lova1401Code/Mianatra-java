/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myAbstract;

/**
 *
 * @author Ramih
 */
public class MyMain {
    public static void main(String[] arg)
    {
        Lion l=new Lion();
        System.out.println(l.inonaAryAho());
        l.eat();
        l.speak();
        l.fly("carbonetra");
        Tigre t=new Tigre();
        System.out.println(t.inonaAryAho());
        t.eat();
        t.speak();
    }
} 
