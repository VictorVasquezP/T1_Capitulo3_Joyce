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
public class TestPainting {
    private Painting paint;
    public TestPainting(Painting paint){
        this.paint=paint;
    }
    public Painting getPaint() {
        return paint;
    }
    public void setPaint(Painting paint) {
        this.paint = paint;
    }
    @Override
    public String toString(){
        return String.format("La pintura de nombre %s, del artista %s, hecha de %s, a un precio de $%.2f, y una comision de %.2f\n%s\n\n",this.getPaint().getTitle(),this.getPaint().getArtist(),this.getPaint().getMedio(),this.getPaint().getPrice(),this.getPaint().comisCalc(),this.getPaint().explainsGallery());
    }
    
}
