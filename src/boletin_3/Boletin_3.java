
package boletin_3;


public class Boletin_3 {

  
    public static void main(String[] args) {
       Consumo con1 = new Consumo();
       con1.setLitros(50f);
       con1.setPGas(1.57f);
       Consumo con2 = new Consumo(200f,20f,1.8f,10f);
       System.out.println("El consumo medio del consumo 2 es de " + con2.consumoMedio());
        con2.setLitros(70f);
        System.out.println("La velocidad media del consumo 2 es de " + con2.getVMedia());
       
    }
    
}
