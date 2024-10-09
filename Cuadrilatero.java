/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author faran
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta, gamma;
    private float a, b;
    private float base, altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alfa, int beta, int gamma, float a, float b, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    // Getters y setters

    @Override
    public float area() {
        return base * altura;
    }
    
    @Override
    public float perimetro() {
        return a + b;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
