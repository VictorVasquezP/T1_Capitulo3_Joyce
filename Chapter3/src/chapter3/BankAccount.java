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
public class BankAccount {
    private Integer cuenta;
    private String propiet;
    private Integer saldo;
    public BankAccount(){
        this.cuenta=0;
        //para las cadenas es " " comillas
        this.propiet="Unknown";
        this.saldo=4;
    }
    public BankAccount(Integer cuenta, String propiet, Integer saldo){
        this.cuenta=cuenta;
        this.propiet=propiet;
        this.saldo=saldo;
    }
    public Integer getCuenta() {
        return cuenta;
    }
    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }
    public String getPropiet() {
        return propiet;
    }
    public void setPropiet(String propiet) {
        this.propiet = propiet;
    }
    public Integer getSaldo() {
        return saldo;
    }
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    public Double deductMonthlyFee(){
        return this.getSaldo()-4.0;
    }
    public String ExplayAccountPolicy (){
        return "La tarifa del servicio de $ 4 se deducirá cada mes";
    }
    
}
