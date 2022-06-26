
package Clases;

import Interface.IFigura;


public abstract class FiguraGeometrica implements IFigura {
    
  protected String nombreFigura;
  @Override
  public abstract double calculoArea();
  
}
