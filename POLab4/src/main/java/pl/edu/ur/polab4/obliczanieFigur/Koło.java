package pl.edu.ur.polab4.obliczanieFigur;
/**
 *
 * @author Kasia
 */
public class Koło {
    public int promien;
    public float obwod;
    public float pole;

    public Koło(int promien) {
        this.promien = promien;
    }      
    public void Obwod(){
        this.obwod = (float) (2*Math.PI*this.promien);
    }
    public void Pole(){
        this.pole = (float) (Math.PI*(this.promien*this.promien));
    }
    public void WyswietlDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Figura kolo:");
        System.out.println("Pole: " + this.pole );
        System.out.println("Obwód: " + this.obwod );
    }
}