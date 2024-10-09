/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author faran
 */
public class Flauta extends InstrumentoDeViento {

    public Flauta() {
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando flauta");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    }

    @Override
    public String tipoDeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }

    @Override
    public String toString() {
        return "Flauta{}";
    }
}
