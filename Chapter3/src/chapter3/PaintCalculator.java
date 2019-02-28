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
public class PaintCalculator {
    public static final Integer PRICE=32;
    public static final Integer COVER = 350;
    private Integer l;
    private Integer a;
    private Integer al;
    public PaintCalculator(Integer l, Integer a, Integer al){
        this.l=l;
        this.a=a;
        this.al=al;
    }
    
    public Integer calcularArea(){
        return ((getL()*getAl())*2+(getA()*getAl())*2);
    }
    public Integer numGal(){
        //calcular area y lo divides entre 350 que cubre y si existe residuo le sumas 1 y si no 0
        return (calcularArea()/COVER)+calcularArea()%COVER>0?1:0;
    }
    public Integer costo(){
        return (numGal()*PRICE);
    }

    /**
     * @return the l
     */
    public Integer getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(Integer l) {
        this.l = l;
    }

    /**
     * @return the a
     */
    public Integer getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Integer a) {
        this.a = a;
    }

    /**
     * @return the al
     */
    public Integer getAl() {
        return al;
    }

    /**
     * @param al the al to set
     */
    public void setAl(Integer al) {
        this.al = al;
    }
}
