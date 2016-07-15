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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //NO ES POSIBLE INSTANCIAR UN OBJETO DE UNA CLASE ABSTRACTA
        /*FiguraGeometrica fg = new FiguraGeometrica(nombre); {
        }*/
        
        Cuadrado c = new Cuadrado(10, "Square_A");
        
        String cuadrado = c.toString();
        
        System.out.println(c);
        
        Triangulo t = new Triangulo(3, 5, "Tri_A");
        
        System.out.println(t.toString());
        
    }
    
}
