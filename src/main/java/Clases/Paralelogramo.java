
package Clases;


public class Paralelogramo extends FiguraGeometrica {
    
    private double lado;
    private double altura;

    public Paralelogramo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    
    
    @Override
    public double calculoArea() {
        double ParalelogramoArea = lado*altura;
      return ParalelogramoArea;
        
    }

    public double getBase() {
        return lado;
    }

    public void setBase(double base) {
        this.lado = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
