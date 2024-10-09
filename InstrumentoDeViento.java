/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author faran
 */
public class InstrumentoDeViento implements InstrumentoMusical {

    public InstrumentoDeViento() {
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento musical");
    }

    @Override
    public String tipoDeInstrumento() {
        System.out.println("Instrumento de Viento");
        return null;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    @Override
    public String toString() {
        return "InstrumentoDeViento{}";
    }
}
