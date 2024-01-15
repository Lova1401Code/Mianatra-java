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
public class Cat {
/**constructeur:
 * un constructeur est une methode aui permet de construire notre objet
 * un objet : quelque chose issue d'une classe (zavatra iray avy amin'ny class)
 * pour pouvoir creer plusieur chat et chat est une objet instance de class cat
 * Le mot clé this : reference à l'objet qu'on vient de créer,reference au objet creer en cour. 
 * Appeler le constructeur pour creer un objet
 * Une classe est une modèle de fabrication, c'est comme une moule
 * Un attribut : est un nom different pour des variables
 * par exemple la variable saka1 a des attribut nom, couleur, taille differemment que saka2 a aussi ses propres attribut.
 * et aussi c'est une varibale qui appartient à une classe
*/ 
    public Cat(String nom, int age)
    {
        this.mAnarana = nom;
        this.mTaona = age;
        System.out.println("je suis un chat, mon nom c\'est "+this.mAnarana+" et j\'ai "+this.mTaona+" ans");
    }
     private String mAnarana;
     private int mTaona;
}
