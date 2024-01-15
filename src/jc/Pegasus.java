/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc;

/**
 *
 * @author Ramih
 */
public class Pegasus extends Horse 
{
    public Pegasus(String nom)
    {
        super(nom);
        this.mPosZ = 50;
    }
    public void move(int x, int y)
    {
        super.move(x, y);
        System.out.println("Le pegase se deplace en X= "+x+" et en Y= "+y);
    }
    public void fly(int z)
    {
        this.mPosZ = z;
        System.out.println("Le Pegasus fly en Z= "+z);
    }
    private int mPosZ;
}
