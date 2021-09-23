/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimales;

/**
 *
 * @author Lukelar
 */
public class Decimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numeroFloat = (float) 10.0;
        double numeroFloat2 = 10.0;
        System.out.println(numeroFloat);
        System.out.println("Valor minimo del tipo float: "+Float.MIN_VALUE);
        System.out.println("Valor maximo del tipo float: "+Float.MAX_VALUE);
        
//        Tipo Double
        double numeroDouble2= 10;
        System.out.println(numeroDouble2);
        System.out.println("Valor minimo del tipo double: "+Double.MIN_VALUE);
        System.out.println("Valor maximo del tipo double: "+Double.MAX_VALUE);
    }
    
}
