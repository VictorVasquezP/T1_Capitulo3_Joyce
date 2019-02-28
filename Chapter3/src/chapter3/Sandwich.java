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
public class Sandwich {
    private String ingredient;
    private String tipo;
    private Double price;
    public Sandwich(String ingredient, String tipo, Double price){
        this.ingredient=ingredient;
        this.tipo=tipo;
        this.price=price;
    }
    public String getIngredient() {
        return ingredient;
    }
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("El Sandwich es de %s con pan de %s a un precio de %.2f",this.getIngredient(),this.getTipo(),this.getPrice());
    }
}
