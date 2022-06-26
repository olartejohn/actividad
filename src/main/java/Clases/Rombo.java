
package Clases;

public class Rombo extends FiguraGeometrica {
    
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calculoArea() {
        double RomboArea = (diagonalMayor*diagonalMenor)/2;
      return RomboArea;
    }

    public double getDiagonalmayor() {
        return diagonalMayor;
    }

    public void setDiagonalmayor(double diagonalmayor) {
        this.diagonalMayor = diagonalmayor;
    }

    public double getDiagonalmenor() {
        return diagonalMenor;
    }

    public void setDiagonalmenor(double diagonalmenor) {
        this.diagonalMenor = diagonalmenor;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
   
    
}
