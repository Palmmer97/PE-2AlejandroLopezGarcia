/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimorecur;

import java.util.Scanner;



/**
 *
 * @author Alejandro Lopez Garcia 16210545
 */
public class MinimoRecur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinimoRecur2 fb = new MinimoRecur2();
        int num,Menu;
       System.out.println("----------------Menu-------------");
       System.out.println("1. Invertir Numeros");
       System.out.println("2.-Minimo ");
       System.out.println("3.-Maximo ");
       System.out.println("4.-Salir");
       Menu=sc.nextInt();
       
        switch(Menu)
       {
           case 1:
       
        System.out.print("Introduce un número para invertir: ");
        num = sc.nextInt();
        sc.close();
        int numCifras = String.valueOf(num).length();
        System.out.printf("El número invertido es el "+ fb.invertirNumero(num, numCifras-1));
        break;
           case 2:
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Menor: " + fb.Menor(array, 0, array[0]));
        break;
           case 3:
        int[] arre = {1,2,3,4,5,6,7,8,9,10};    
	System.out.println("Mayor: " + fb.Mayor(arre, 0, arre[0]));
        break;
        case 4:
          System.out.println("Salir");
                  break;
           default:
        System.out.println("Esa opcion no existe ");
               break;
        }
    }
    
}
