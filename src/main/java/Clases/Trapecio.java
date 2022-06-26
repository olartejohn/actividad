
package Clases;


public class Trapecio extends FiguraGeometrica {
    
    private double base1;
    private double base2;
    private double altura;
    
    
    

    public Trapecio(double base1,double base2, double altura) {
        this.altura = altura;
        this.base1= base1;
        this.base2=base2;
    }
   
    @Override
    public double calculoArea() {
        double TrapecioArea = ((base1+base2)*altura)/2;
      return TrapecioArea;
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

  
    
    
    
}
