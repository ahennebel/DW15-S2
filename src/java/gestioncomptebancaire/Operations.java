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
    int soldeAvant;    
    int newSolde;
    
    public Operations(String _objet,int _montant){
        objet = _objet;
        montant = _montant;    
    }
    
      public Operations() {
		// TODO Auto-generated constructor stub
    	super();
    	
	}
    
    public int getSoldeAvant(){
        return soldeAvant;
    }
    
    public int getNewSolde(){       
        return newSolde;
    }
    
    public int getMontant(){
        return montant;
    }
    
    public void setObjet(String objet){
        this.objet = objet;
    }
    
    public void setMontant(int montant){
        this.montant = montant;
    }
    
     public void setNewSolde(int newSolde){
        this.newSolde = newSolde;        
    }
     
      public void setSoldeAvant(int soldeAvant){
        this.soldeAvant = soldeAvant;
    }
     
    
    public String toString()
    {
       // return objet+","+prenom+","+age+"ans : notes "+notes+"Moyenne :"+this.moyenne();
            String retour = "";
            retour = retour + "Objet : " + objet + "   ";
            retour = retour + "Montant : " + montant + "   ";
            //retour = retour + "Solde Précèdant : " + soldeAvant + "  ";
            //retour = retour +"Nouveau solde : "+newSolde+"  ";    
            return retour;
        
    }
}
