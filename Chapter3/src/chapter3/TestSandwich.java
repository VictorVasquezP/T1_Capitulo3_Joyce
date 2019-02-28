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
public class TestSandwich {
    
    private Sandwich sand;
    
    public TestSandwich(Sandwich sand) {
        this.sand =sand;
    }
    public Sandwich getSand() {
        return sand;
    }
    public void setSand(Sandwich sand) {
        this.sand = sand;
    }
   
}
