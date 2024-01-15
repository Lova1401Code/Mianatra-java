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
public class ManaoRegistration {
    /**encapsulation des données = chaque classe va possède ses propre attribut et on ne veut pas manipuler n'importe comment ces attribut à l'exterieur de cette classe
    * les accesseur sont le getters et le setters
    * le getters : accès à un attribut (lecture)
    * le setters : modification d'un attribut
    */
    public ManaoRegistration(int expiration)
    {
        if (numberRegistration > 0)
        {
            this.mExpiration = expiration;
            numberRegistration--;
            System.out.println("ce logiciel valide jusqu au "+this.mExpiration);
            System.out.println("reste du jour de validation "+numberRegistration);
        }
        else
        {
            System.out.println("Date de validation complet!");
        }
            
        
    }
    public int getExpiration()
    {
        return mExpiration;
    }
    public void setExpiration(int expiration)
    {
        this.mExpiration = expiration;
    }
    private static int numberRegistration = 1;
    private int mExpiration;
}
