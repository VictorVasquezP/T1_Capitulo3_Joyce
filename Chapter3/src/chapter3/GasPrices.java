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
public class GasPrices {
    private Integer pricePerBarrel;
    public static final Double BOMBA=3.5;
    public static final Double BOMBA2=4.0;
    public GasPrices(Integer pricePerBarrel){
        this.pricePerBarrel=pricePerBarrel;
    }
    public void setpricePerBarrel(Integer pricePerBarrel){
        this.pricePerBarrel=pricePerBarrel;
    }
    public Integer getpricePerBarrel(){
        return this.pricePerBarrel;
    }
    public Double priceForGallon(){
        return (this.getpricePerBarrel()*BOMBA)/100;
    }
    public Double priceForGallon2(){
        return (this.getpricePerBarrel()*BOMBA2)/100;
    }
    @Override
    public String toString(){
        return String.format("Si el gas es de %d por barril, entonces el precio en la bomba debe estar entre $%.2f y $%.2f",this.getpricePerBarrel(),this.priceForGallon(),this.priceForGallon2());
    }
    
}
