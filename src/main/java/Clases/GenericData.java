
package Clases;


public class GenericData <T> {
    T data;

    public GenericData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
    
    public void identify(T argument1){
        if (argument1 instanceof String){
            System.out.println("Esto es un string");
            }
            else if (argument1 instanceof Integer){
            System.out.println("Esto es un Entero");
             }
            else if (argument1 instanceof Double){
            System.out.println("Esta variable es un Double");
             }
        }
    }
    
    

