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
public class Event {
    public static final Integer PRICE_PERSONA=35;
    public static final Integer EVENTO_GRANDE=50;
    private String number_e; //M312
    private Integer invita;
    private Integer precio;    
    public Event(String number_e, Integer invita){
        this.number_e=number_e;
        this.invita=invita;
        this.precio=invita*PRICE_PERSONA;
    }
    public void setNumber_e(String number_e) {
        this.number_e = number_e;
    }

    public void setInvita(Integer invita) {
        this.invita = invita;
    }

    public String getNumber_e() {
        return number_e;
    }

    public Integer getInvita() {
        return invita;
    }

    public Integer getPrecio() {
        return precio;
    }
    public String calculate(){
        return String.format("%s",this.getInvita()>=EVENTO_GRANDE?"Evento grande":"Evento normal");
    }
}
