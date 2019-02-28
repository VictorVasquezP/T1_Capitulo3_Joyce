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
public class TwoCharacters {
    private MyCharacter personaje;
    public TwoCharacters(MyCharacter personaje){
        this.personaje=personaje;
    }
    public MyCharacter getPersonaje() {
        return personaje;
    }

    public void setPersonaje(MyCharacter personaje) {
        this.personaje = personaje;
    }
    @Override
    public String toString(){
        return String.format("El personaje color %s es de tipo %s con %d ojos y tiene %d vidas en el juego",this.getPersonaje().getColor(),this.getPersonaje().gettype(),this.getPersonaje().getEyes(),this.getPersonaje().getLife());
    }
}
