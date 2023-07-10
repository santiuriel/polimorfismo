/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author yofac
 */
public class Triangulo extends Figura {

 private int base;
 private int altura;

    public Triangulo(int base, int altura, int cantlado) {
        super(cantlado);
        this.base = base;
        this.altura = altura;
    }
 
 
    
    
    
    
    
    @Override
    public void calcularArea(int ladoCm) {
      // Para calcular el area del triangulo: ladoCm = anchoLado * altoLado;
        System.out.println("Area: " + ladoCm);
    }
    
}
