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
public abstract class FiguraGeometrica {
    
    //NO SE PUEDE INSTANCIAR NINGÚN OBJETO DE UNA
    //CLASE ABSTRACTA
    
    //Por defecto si no se pone un modificador de acceso
    //se sobrentiende que éste es private
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que calcula la superficie de una figura geométrica
     * @param lado
     * @return 
     */
    public float calcularSuperfice(float lado)
    {
        //Esta opción es más sencilla pero tiene mas coste
        //de memoria
        /*
        float resul;
        
        resul = (float) Math.pow(lado, 2);
        
        return resul;*/
        
        //Esta opción es más óptima
        return (float) Math.pow(lado, 2);
    }
    
    //MÉTODOS Y GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //TODO: Implementar un método toString que imprima por pantalla
    //el nombre y la superfice de la figura geométrica.
    
    
}
