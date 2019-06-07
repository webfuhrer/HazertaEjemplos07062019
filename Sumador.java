/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumador;

/**
 *
 * @author Admin
 */
public class Sumador {

    
    public static void main(String[] args) {
        int a=13;
        int b=9;
       int z=sumador(a, b);
        pintarSuma(a, b, z);
    }
    private static int sumador(int z, int q)
    {
       
        int resultado=z+q;
        return resultado;
        
    }
    private static  void pintarSuma(int x, int y, int zz)
    {
        System.out.println("La suma de "+x+" y "+y+" es: "+zz);
    }
    
}
