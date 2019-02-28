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
public class Rental {
    public static final Integer MIN=60;
    public static final Integer TARIFA=40;
    private String contrato_n;
    private SammysRentalPriceWithMethods samys;
    private Integer price;
    public Rental(SammysRentalPriceWithMethods samys){
        this.samys=samys;
        this.contrato_n=("k"+(int)(Math.random()*100)+1);
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("%s\nEl numero de contrato es %s, %s",this.getSamys().lemaS(),this.getContrato_n(),this.getSamys().toString());
    }
    public String getContrato_n() {
        return contrato_n;
    }
    public void setContrato_n(String contrato_n) {
        this.contrato_n = contrato_n;
    }
    public SammysRentalPriceWithMethods getSamys() {
        return samys;
    }
    public void setSamys(SammysRentalPriceWithMethods samys) {
        this.samys = samys;
    }
}
