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
public class TestBankAccount {
    private BankAccount account;
    public TestBankAccount(BankAccount account){
        this.account=account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    @Override
    public String toString(){
        return String.format("El numero de cuenta %d del propietario %s con un saldo anterior de: %d\n%s, por lo que su nuevo saldo es de: %.2f\n",this.getAccount().getCuenta(),this.getAccount().getPropiet(),this.getAccount().getSaldo(),this.getAccount().ExplayAccountPolicy(),this.getAccount().deductMonthlyFee());
    }
}
