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
public class Card {
    private String tipo;
    private Character letra;
    private static final String [] arreg = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String valor;
    public Card(){
        this.tipo="espadas";
        this.letra='s';
        setValor();
    }
    public String getTipo() {
        return tipo;
    }
    public void settTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValor(){
        int a;
        a=(int)(Math.random()*14)+1;
        this.valor=arreg[a];
    }

    public String getValor() {
        return valor;
    }
    public void setLetra(Character letra) {
        this.letra = letra;
    }
    public Character getLetra(){
        return this.letra;
    }
    
}
