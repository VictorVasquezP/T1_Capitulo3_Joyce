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
public class Student {
    private Integer id;
    private Integer credit;
    private Integer points;
    public Student(Integer id,Integer credit, Integer points){
        this.credit=credit;
        this.id=id;
        this.points=points;
    }
    public Student(){
        this.id=9999;
        this.points=12;
        this.credit=3;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCredit() {
        return credit;
    }
    public void setCredit(Integer credit) {
        this.credit = credit;
    }
    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }
    public Integer promedio(){
        return this.getPoints()/this.getCredit();
    }
    
    @Override
    public String toString(){
        return String.format("El estudiante tiene un ID de %d, horas de credito %d y su promedio es: %d",this.getId(),this.getCredit(),this.promedio());
    }

}
