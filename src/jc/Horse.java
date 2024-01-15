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
public class Horse {
    public Horse(String nom)
    {
        this.mName = nom;
        this.mPosX = 50;
        this.mPosY = 50;
    }
    public void move(int x, int y)
    {
        this.mPosX = x;
        this.mPosY = y;
        System.out.println("L'animal se deplace en X= "+x+" et Y= "+y);
    }
    protected String mName;
    protected int mPosX;
    protected int mPosY;
}
class Rectangle {
    int longueur ;
    int largeur ;
    int origine_x ;
    int origine_y ;
void deplace(int x, int y) {
    this.origine_x = this.origine_x + x ;
    this.origine_y = this.origine_y + y ;
}
int surface() {
    return this.longueur * this.largeur ;
}
}
