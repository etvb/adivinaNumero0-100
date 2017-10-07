/*
Ejercicio 5: Realizar un juego para adivinar un numero. Para ello genera un 
número aleatorio entre 0-100 y luego ir pidiendo números indicando "es mayor" o 
"es menor" según sea el caso. El proceso termina cuando el usuario acierta y 
mostrar el número de intentos.
 */
package pats.pkg32.pkg5.adivinanuero0.pkg100;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS325AdivinaNuero0100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int random, valor, contador =0;
        
        random = (int)(Math.random()*100);
        System.out.println(random);
        
        do{
            
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        
            contador ++;
            
            if (valor < random) {
                JOptionPane.showMessageDialog(null, "Tu dato es MENOR que el que buscamos");
            }else if(valor > random){
                JOptionPane.showMessageDialog(null, "Tu dato es MAYO que el que buscamos");   
            }
            
        }while (random != valor);            
        
        
       JOptionPane.showMessageDialog(null, "Felicidades, encontraste el valor en " + contador + " intentos");
    }
    
}
