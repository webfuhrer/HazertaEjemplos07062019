package ejerciciocorregir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class EjercicioCorregir {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      int a=9;
      int b=2;
      int z=a+b;
	String saludo=saludar();
        String a="Ana";
        saludarAPersona(a);
        String saludo2=saludarAPersonaPorNombre(a);
        System.out.println(saludo);
         System.out.println(saludo2);
    }
     static String saludarAPersonaPorNombre(String fhfhgfhgfgf)
     {
         String aux="Buenos días "+fhfhgfhgfgf;
         return aux;
     }
    private static void saludarAPersona(String x)
    {
        System.out.println("Hola "+x);
        
    }
    private static String saludar()
    {
        
    return "Hola mundo";
    }
}
