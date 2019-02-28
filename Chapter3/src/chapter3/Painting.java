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
public class Painting {
    private String title;
    private String artist;
    private String medio;
    private Double price;
    private Double comision;
    public Painting(){
        this.artist="Unknown";
        this.comision=0.0;
        this.medio="Unknown";
        this.price=0.0;
        this.title="Unknown";
    }
    public Painting(String title, String artist,String medio,Double price){
        this.artist=artist;
        this.medio=medio;
        this.price=price;
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getMedio() {
        return medio;
    }
    public void setMedio(String medio) {
        this.medio = medio;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getComision() {
        return comision;
    }
    public void setComision(Double comision) {
        this.comision = comision;
    }
    public Double comisCalc(){
        return (this.getPrice()*20)/100;
    }
    public String explainsGallery(){
        return "La galeria tiene una comision del 20% por ciento del precio";
    }
}
