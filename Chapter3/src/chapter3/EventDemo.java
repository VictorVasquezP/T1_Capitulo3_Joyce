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
public class EventDemo {
    private Event evento;
    private String stri;

    public EventDemo(Event evento,String stri){
        this.evento=evento;
        this.stri=stri;
    }

    public Event getEvento() {
        return evento;
    }

    public void setEvento(Event evento) {
        this.evento = evento;
    }
    
    @Override
    public String toString(){
        return String.format("%s\nNumero de evento %s, numero de invitados %d con un precio por invitado de %d, con un total de precio de %d, es un %s",this.getStri(),this.getEvento().getNumber_e(),this.getEvento().getInvita(),this.getEvento().getPrecio()/this.getEvento().getInvita(),this.getEvento().getPrecio(),this.getEvento().calculate());
    }

    public String getStri() {
        return stri;
    }

    public void setStri(String stri) {
        this.stri = stri;
    }
}
