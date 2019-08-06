
package nivel1exercicio8;

import java.util.Scanner;


public class Nivel1Exercicio8 {

   
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe um Número");
        int numero1 = leia.nextInt();
        
        System.out.println ("Informe outro Número");
        int numero2 = leia.nextInt();
        
        if (numero1 > numero2) {
    System.out.println ("Os números na ordem crescente são: "+(numero2)+", "+(numero1)); 
    } else {
            System.out.println ("Os números na ordem crescente são: "+(numero1)+", "+(numero2));                
    }

    }
    
}
