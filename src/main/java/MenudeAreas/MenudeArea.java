

package MenudeAreas;

import Clases.GenericData;
import Clases.Paralelogramo;
import Clases.Rombo;
import Clases.Trapecio;
import java.util.Scanner;




public class MenudeArea {

    public static void main(String[] args) {
        
        GenericData<Integer> a = new GenericData<>(1);
        GenericData<String> b = new GenericData<>("Hola_mundo3");
        GenericData<Double> c = new GenericData<>(2.0);
       a.identify(1);
       b.identify("");
       c.identify(2.4);
        System.out.println("  ");
        
        Scanner read = new Scanner (System.in);
        
       double numero1 = 0;
       double numero2 = 0;
       double numero3 = 0;
       int  opciones = 0; 
        
         do { 
           System.out.println("Selecciona una figura para calcular su Area:");
           System.out.println("");
           System.out.println("1 Trapecio");
           System.out.println("2 Rombo");
           System.out.println("3 Paralelogramo ");
         
           opciones= read.nextInt();
           
           switch(opciones){
                  
               case 1:    
                 System.out.println("Trapecio"); 
                 System.out.println("Ingr1ese valor de la base 1");
                 numero1 = read.nextDouble(); 
                 System.out.println("Ingrese valor de la base 2");
                 numero2 = read.nextDouble(); 
                 System.out.println("Ingrese Altura");
                 numero3 = read.nextDouble();
                 Trapecio Mitrapecio = new Trapecio (numero1, numero2,numero3);
                 System.out.println("El Area del Trapecio es  "+Mitrapecio.calculoArea());
                 c.identify(numero3);
                 Mitrapecio.calculoArea();
                 System.out.println("  ");
                 
                 break; 
                 
               case 2:
                 System.out.println("Rombo"); 
                 System.out.println("Ingr1ese valor de la Diagonal Mayor");
                 numero1 = read.nextDouble(); 
                 System.out.println("Ingrese valor de la Diagonal Menor");
                 numero2 = read.nextDouble(); 
                 Rombo Mirombo= new Rombo (numero1, numero2);
                 System.out.println("El Area del Rombo es  "+Mirombo.calculoArea());
                 c.identify(numero1);
                 Mirombo.calculoArea(); 
                 System.out.println("  ");
                 
                 break; 
                 
                case 3:
                 System.out.println("Paralelogramo"); 
                 System.out.println("Ingrese lado");
                 numero1 = read.nextDouble(); 
                 System.out.println("Ingrese valor de la altura");
                 numero2 = read.nextDouble(); 
                 Paralelogramo Miparalelogramo= new Paralelogramo (numero1, numero2);
                 System.out.println("El Area del Rombo es  "+Miparalelogramo.calculoArea());
                 c.identify(numero1);
                 Miparalelogramo.calculoArea(); 
                    System.out.println("  ");
                 
                 
          }
        } while (opciones>=1&&opciones<=3); 
      }
        
       
}
