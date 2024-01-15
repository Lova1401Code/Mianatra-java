/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Lova14012000
lo14va2000
lova1401
 */
package mianatra_java;

import java.util.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;
import mypackage.*;

/**
 *
 * @author Ramih
 */
public class App {
    public static void main(String[] args){
        //quand t on utilise un constructeur ailleur, il faut créer une instance stocké dans une variable
        Cat saka=new Cat("Akelah", 3);
        Cat saka1=new Cat("bibouh", 2);
        //appel du methode prog
        prog();
        System.out.println(getNumberTwo());
        //affichage du methode avec paramettre
        int valiny = calculAdd(5, 5);
        System.out.println("ny valiny dia "+valiny);
        Player P = new Player();
        Player P1 = new Player("Lova");
        Player P3 = new Player("Lova", 1);
        String m = P.mis("ao ve ianareo");
        System.out.println();
        P1.attaque("zah");
        //appelle d'une methode dans un objet
        //mampiase seters sy geters
        ManaoRegistration mn = new ManaoRegistration(2021);
        ManaoRegistration mn2 = new ManaoRegistration(2022);
        mn.setExpiration(2020);
        System.out.println(mn.getExpiration());
        //miantra tableau
        //déclaration d'un tableau
        int tab[] = new int[3];//3 cases de type int ou bien int[] tab
        //déclaration avec initialisation
        int zavatra[] = {1, 3, 1, 5};// ou bien int tab[] = new int[]{1, 23, 66}
        //affichage du nombre 3
        System.out.println(zavatra[1]);
        for (int nb : zavatra)
            System.out.println(nb);
        //tableau à deux dimension
        int[][] tableau = {{1,2,3},{1,5,3}};
        //afficher la valeur 5
        System.out.println(tableau[1][1]);
        //afficher tous les contenus
        for (int[] i : tableau)
            for (int tab2 : i)
                System.out.println(tab2);
        asehoyTableau(zavatra);
        System.out.println("mianatra manao package");
        MyPlayer p = new MyPlayer();
        Item it = new Item();
        try
        {
            System.out.println("Lecture d'un clavier");
            Scanner sc = new Scanner(System.in);
            System.out.println("votre année de naissance ");
            int nom = sc.nextInt();
            System.out.println("née en "+nom);
        }
        catch(InputMismatchException e)
        {
            System.out.println("votre age n/'est pas valide!");
        }
        
            
    }
    //création d'une methode sans valeur de retour
    public static void prog()
    {
        System.out.println("Bonjour tous le monde");
    }
    //méthode avec valeur de retour
    public static int getNumberTwo()
    {
        return 2;
    }
    //methode avec paramettre
    public static int calculAdd(int a, int b)
    {
        System.out.println("nampiditra ny isa "+a+" sy ny isa "+b+" ianao");
        return a + b;
    }
    public static void asehoyTableau(int[] tab){
        for (int nb : tab)
            System.out.println(nb);
        System.out.println(tab);
    //utilisation d'une methode de la classe Arrays
    int tab5[] = new int[10];
    Arrays.fill(tab5, 15);
    for (int number : tab5)
        System.out.println(number);
    }
    
}
