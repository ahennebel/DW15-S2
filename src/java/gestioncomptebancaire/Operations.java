/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncomptebancaire;
import java.util.Scanner;
/**
 *
 * @author Aurelie pc neuf
 */
public class Operations {
    String objet;
    int montant;        
    int solde;
    
    public Operations(String _objet,int _montant, int _solde){
        objet = _objet;
        montant = _montant;
        solde = _solde;
    }
    
      public Operations() {
		// TODO Auto-generated constructor stub
    	super();
    	
	}
    
    
    
    public int getMontant(){
        return montant;
    }
    
    public int getSolde(){
        return solde;
    }
    
    public void setObjet(String objet){
        this.objet = objet;
    }
    
    public void setMontant(int montant){
        this.montant = montant;
    }
    
    public void setSolde(int solde){
        this.solde = solde;
    }
   
     
    
    public String toString()
    {
       // return objet+","+prenom+","+age+"ans : notes "+notes+"Moyenne :"+this.moyenne();
            String retour = "";
            retour = retour + "Objet : " + objet + "   ";
            retour = retour + "Montant : " + montant + "   ";
            retour = retour + "Solde : " + solde + "  ";               
            return retour;
        
    }
}
