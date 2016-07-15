/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploabstracta;

/**
 *
 * @author Javi
 */
public class Cuadrado extends FiguraGeometrica {
    
    float lado;
    
    public Cuadrado(float lado, String nombre)
    {
        //Podemos enteder super como una especie de puente 
        //entre el constructor de la clase hija con la clase padre
        super(nombre);
        
        this.lado = lado;
        
    }
    
    /**
     * Sobreescritura del método toString() que imprime por pantalla
     * la información del objeto.
     * @return 
     */
    @Override
    public String toString() {
        return "Cuadrado{" + "lado = " + lado + '}';
    }
    
    
    
    
}
