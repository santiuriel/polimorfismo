/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author yofac
 */
public class Rectangulo extends Figura {

    
    private int anchoLado;
    private int altoLado;

    
    
    public Rectangulo(int anchoLado, int altoLado, int cantlado) {
        super(cantlado);
        this.anchoLado = anchoLado;
        this.altoLado = altoLado;
    }
    
    

    
    
    @Override
    public void calcularArea(int ladoCm) {
        // Para calcular el area del rectangulo: ladoCm = anchoLado * altoLado;
        System.out.println("Area: " + ladoCm);
        
    }
    
    
    
    
}
