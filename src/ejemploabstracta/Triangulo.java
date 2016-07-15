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
public class Triangulo extends FiguraGeometrica {
    
    float base;
    float altura;

    public Triangulo(float base, float altura, String nombre) {
        super(nombre);
        
        this.base = base;
        this.altura = altura;
    }

    /**
     * Sobreescritura del método toString() que imprime los datos 
     * de un triángulo por pantalla
     * @return 
     */
    @Override
    public String toString() {
        return "Triangulo{" + " base="  + base + ", altura= " + altura + 
                " Area= " + calcularArea(base, altura) + '}';
    }
    
    //TODO: Implementar cabecera para que se incluya en el Javadoc
    
    public float calcularArea(float base, float altura){
        
        return base * altura / 2;
    }
    
    
    //GETTERS Y SETTERS
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
