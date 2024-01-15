/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mianatra_java;

/**
 *
 * @author Ramih
 * [note]
 * = affectation
 * + concatenation
 */
public class Mianatra_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("bonjour tous le monde");
        //declaration du variable
        int ageUtilisateur = 22;
        //declaration d'une variable constant
        final int numero = 24;
        System.out.println("votre age est "+ageUtilisateur+" \n votre numero final est "+numero);
        
        int result = 5/2;
        System.out.println(result);
        int modulo = 13%2;
        int mod = modulo;
        System.out.println(mod);
        boolean myvar = !true;
        System.out.println(myvar);
        mod = 20;
        System.out.println(mod+"\n lesona hafa");
        int goldcoins = 0;
        System.out.println(goldcoins);
        goldcoins = goldcoins + 10;
        System.out.println(goldcoins);
        goldcoins += 90;
        System.out.println(goldcoins);
        //incrémentation
        int nb1 = 1;
        int nb2 = ++nb1;//nb1 = nb1 + 1 puis nb2 = nb1
        System.out.println("pré-incrémentation");
        System.out.println(nb1);
        System.out.println(nb2);
        System.out.println("post-incrémentation");
        int nb3= 1;
        int nb4 = nb3++;//nb4 = nb3 puis nb3 = nb3 + 1
        System.out.println(nb3);
        System.out.println(nb4);
        System.out.println("comparaison");
        boolean test = 14 > 5;
        System.out.println(test);
        //condition
        System.out.println("condition");
        int value = 1000000;
        if (value < 0)
            System.out.println("value > 0");
        else if (value < 100)
            System.out.println("value < 100");
        else if (value < 1000)
            System.out.println("value < 1000");
        else
            System.out.println(value);
        System.out.println("condition avec switch");
        int number = 3;
        switch(number){
                    case 1://if (option == 1);
                        System.out.println("option = 1");
                        break;
                    case 2:
                        System.out.println("number = 2");
                        break;
                    default:
                        System.out.println("autre que 1 et 2");
        System.out.println("switch avec string");
        String choice = "s";
        switch(choice)
        {
            case "i":
                System.out.println("NON");
                break;
            case "s":
                System.out.println("OUI");
                break;    
            default: 
                System.out.println("ni OUI ni NOM");
        }
        }
        //ndao indray hianatra boucle
        System.out.println("manomboka eto ny boucle");
        int i = 0;
        while (i != 9)
        {
            System.out.println(i);
            if (i == 6)
                break;
            i++;
        }
        int j = 0;
        do 
        {
            System.out.println("salut "+j);
            j++;
        }
        while (j != 10);
        //avec boucle for
        System.out.println("indro ny boucle for ary \n  ");
        for (i = 0; i!=10; i++)
        {
            System.out.println(" "+i);
        }
    }
    public void autreMethode(){
        int ageUtilisateur = 0;
        System.out.println("votre age est "+ageUtilisateur);
    }
}
