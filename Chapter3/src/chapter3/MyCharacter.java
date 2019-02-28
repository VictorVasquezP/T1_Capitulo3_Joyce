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
public class MyCharacter {
    private String color;
    private String type;
    private Integer eyes;
    private Integer life;
    public MyCharacter(String color, String type, Integer eyes, Integer life){
        this.color=color;
        this.type=type;
        this.eyes=eyes;
        this.life=life;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public Integer getEyes() {
        return eyes;
    }

    public void setEyes(Integer eyes) {
        this.eyes = eyes;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }
    
}
