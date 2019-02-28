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
public class ArithmeticMethods2 {
    private Integer a;
    private Integer b;
    public void setA(Integer a){
        this.a=a;
    }
    public Integer getA(){
        return this.a;
    }
    public void setB(Integer b){
        this.b=b;
    }
    public Integer getB(){
        return this.b;
    }
    public Integer displayNumberPlus10(Integer a,Integer b){
        return a+b+10; 
    }
    public Integer displayNumberPlus100(Integer a,Integer b){
        return a+b+100; 
    }
    public Integer displayNumberPlus1000(Integer a,Integer b){
        return a+b+1000; 
    }
}
