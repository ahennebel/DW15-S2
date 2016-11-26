/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncomptebancaire;

/**
 *
 * @author Aurelie pc neuf
 */
public class Solde {
    int solde;

public Solde() {
		// TODO Auto-generated constructor stub
    	super();
    	
	}    
    public Solde(int _solde){
        solde = _solde;
    }
    
    public void setSolde(int solde){
        this.solde = solde;
    }
    
    public int getSolde(){
        return solde;
    }
}
