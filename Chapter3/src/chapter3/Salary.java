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
public class Salary {
    private Integer tarifa;
    private Integer horas;
    private Integer h_extra;
    public Salary(Integer tarifa, Integer horas, Integer h_extra){
        this.tarifa=tarifa;
        this.horas=horas;
        this.h_extra=h_extra;
    }
    public Integer getTarifa() {
        return tarifa;
    }
    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Integer getH_extra() {
        return h_extra;
    }
    public void setH_extra(Integer h_extra) {
        this.h_extra = h_extra;
    }
    public Double horasExtra(){
        return (this.getHoras()*this.getTarifa())+(this.getH_extra()*(this.getTarifa()*0.15));
    }
    public Double salario(){
        return (this.horas*this.tarifa)+this.horasExtra();
    }
    @Override
    public String toString(){
        return String.format("El pago por horas extra es: %.2f, el salario semanal es de: %.2f",this.horasExtra(),this.salario());
    }
    
}
