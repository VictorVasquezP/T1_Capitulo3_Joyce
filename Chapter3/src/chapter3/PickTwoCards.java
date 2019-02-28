/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author Victor
 */
public class PickTwoCards {
   
    private Card carta;
    public PickTwoCards(Card carta){
        this.carta=carta;
    }

    public Card getCarta() {
        return carta;
    }

    public void setCarta(Card carta) {
        this.carta = carta;
    }
    @Override
    public String toString(){
        return String.format("Carta %c de tipo %s con numero %s",this.getCarta().getLetra(),this.getCarta().getTipo(),this.getCarta().getValor());
    }
    
}
