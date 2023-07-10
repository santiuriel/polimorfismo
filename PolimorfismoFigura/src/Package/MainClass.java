/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author yofac
 */


import java.util.Scanner;

public class MainClass {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       boolean repetir = true;
        
       while (repetir){
       
        System.out.println("Elige de que figura quieres obtener Area");
        System.out.println("1.Cuadrado 2.Rectangulo 3.Triangulo 4.Circulo");
       
        int figuraSeleccion = scanner.nextInt();
        
        int perimetro;
        
        
        
        switch(figuraSeleccion){
        
            case 1:
                System.out.println("     ");
                System.out.println("          ........Cuadrado........");
                System.out.println("    ");
                
                System.out.print("Ingresa cuantos CM tendran los lados de tu cuadrado: ");
                 int ladoCm = scanner.nextInt();
                
                 perimetro = ladoCm * 4;
                 
                 
       
                Figura cuadrado = new Cuadrado(ladoCm,4);
                cuadrado.calcularArea(ladoCm);
                System.out.println("Perimtero: " + perimetro);
                
                    break;
                    
                    
            case 2:
                System.out.println("     ");
                System.out.println("          ........Rectangulo........");
                System.out.println("    ");    
                
                System.out.print("ingresa el alto del rectangulo: ");
                int altoLado = scanner.nextInt();
                System.out.print("ingrese el ancho del rectangulo: ");
                int anchoLado = scanner.nextInt();
                
                perimetro = (altoLado * 2) + (anchoLado * 2);
                ladoCm = anchoLado * altoLado;
                
                Rectangulo rectangulo = new Rectangulo(anchoLado,altoLado,ladoCm);
                rectangulo.calcularArea(ladoCm);
                System.out.println("Perimetro: " + perimetro);
                
                    break;
                    
            case 3:
                System.out.println("     ");
                System.out.println("          ........Triangulo........");
                System.out.println("    ");    
                
                System.out.print("Ingresa la base del rectangulo: ");
                int base = scanner.nextInt();
                System.out.print("Ingresa la altura del rectangulo: ");
                int altura = scanner.nextInt();
                
                ladoCm = (base * altura) /2;
                
                Triangulo triangulo = new Triangulo(base, altura, ladoCm);
                triangulo.calcularArea(ladoCm);
                
           
                
                
                
                break;
                    
            case 4:
                System.out.println("     ");
                System.out.println("          ........Ciruclo........");
                System.out.println("    ");  
                
                System.out.print("Ingresa el diametro del circulo: ");
                int diametro = scanner.nextInt();
                int radio = diametro / 2;
                
                Circulo circulo = new Circulo(diametro,radio);
                System.out.println("Radio: " + radio);                      
                circulo.calcularAreaCirculo(radio);
 
                break;
                    
            default:
                 System.out.println("Opción inválida");
                
                break;
                    
       
        }
 
        
        
        
    } // fin while 

    }
    
}
