/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mianatra_java;

/**
 *
 * @author Ramih
 */
public class Player {
    public Player()
    {
        this.nNom = "bory";
        this.mLevel = 0;
        System.out.println("votre nom est "+this.nNom+" et votre level est "+this.mLevel);
    }
    public Player(String nom)
    {
        this.nNom = nom;
        this.mLevel = 0;
        System.out.println("votre nom est "+this.nNom+" et votre level est "+this.mLevel);
    }
    public Player(String nom, int level)
    {
        this.mLevel = level;
        this.nNom = nom;
        System.out.println("votre nom est "+this.nNom+" et votre level est "+this.mLevel);
    }
    public String mis(String message)
    {
        return message;
    }
    public void attaque(String nom)
    {
        this.nNom = nom;
        System.out.println(this.nNom+" cible une attaque");
    }
    private String nNom;
    private int mLevel;
}
