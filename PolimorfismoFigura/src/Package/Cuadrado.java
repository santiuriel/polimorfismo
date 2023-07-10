
package Package;

/**
 *
 * @author yofac
 */
public class Cuadrado extends Figura {
    
    private int ladoCm;
    
   
    
  // Constructor .....................  
    public Cuadrado(int ladoCm, int cantlado) {   
        super(cantlado);
        this.ladoCm = ladoCm;
    }

    //Metodos .......................
    @Override
    public void calcularArea(int ladoCm) {
        System.out.println("Area: "+ ladoCm);
    }

   

    // ---------------------------------
    
    
}
