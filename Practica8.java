/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author faran
 */
public class Practica8 {

    public static void main(String[] args) {
        
        Poligono poligono1 = new Poligono();
        System.out.println(poligono1);
        
        System.out.println("");
        System.out.println("###### TRIANGULO ######");
        Triangulo triangulo1 = new Triangulo(60, 60, 60, 5, 5, 5, 5, 6);
        System.out.println(triangulo1);
        System.out.println("Area = " + triangulo1.area());
        System.out.println("Perimetro = " + triangulo1.perimetro());
        
        System.out.println("");
        
        Poligono poligono2 = new Poligono();
        System.out.println(poligono2);
        
        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2);
        poligono2 = triangulo2;
        System.out.println(poligono2);
        
        System.out.println("");
        System.out.println("###### CUADRILATERO ######");
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(90, 90, 90, 4, 4, 4, 5);
        System.out.println(cuadrilatero1);
        System.out.println("Area = " + cuadrilatero1.area());
        System.out.println("Perimetro = " + cuadrilatero1.perimetro());
        
        System.out.println("");
        
        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println(cuadrilatero2);
        Object object1 = new Object();
        System.out.println(object1);
        object1 = cuadrilatero2;
        System.out.println(object1);
        
        System.out.println("");
        System.out.println("###### IDENTIFICAR ######");
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);
        
        System.out.println("");
        System.out.println("####### FLAUTA #######");
        Flauta flauta = new Flauta();
        flauta.tocar();
        flauta.afinar();
        flauta.tipoDeInstrumento();
        
        System.out.println("");
        System.out.println("###### MESES ######");
        System.out.println(Math.PI);
        System.out.println(Meses.UNO);
        System.out.println(Meses.MESES[Meses.TRES]);
        
    }
    
    public static void identificarFiguras(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia del Triangulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Instancia del Cuadrilatero");
        }
    }
}
