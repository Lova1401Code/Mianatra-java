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
public class Lion extends KarazanaBiby implements Flyable {
    public Lion()
    {
        this.mName = "Liona aho";
    }
    public void eat()
    {
        System.out.println("je mange beaucoup");
    }
    public void speak()
    {
        System.out.println("Lion ne parle pas");
    }
    public void fly(String energy)
    {
        System.out.println("je vole comme ca "+energy);
    }
}
