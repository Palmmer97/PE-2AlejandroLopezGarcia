/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimorecur;

/**
 *
 * @author Alejandro Lopez Garcia 16210645
 */
public class MinimoRecur2 {
     public int num=0,pos=0;
     static int invertirNumero(int num, int pos)
     {
        if(num<10){
            return num;
        } else {
            return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1); 
        }
     }
    static int Menor(int[] array, int n, int menor)
	{
		if (n == array.length)
                {
			return menor;
                } 
		if (array[n] < menor)
                {
			menor = array[n];
                }
		return Menor(array, ++n, menor);
                
                
	}
    static int Mayor(int[] arre, int n, int mayor)
	{
		if (n == arre.length)
			return mayor;
 
		if (arre[n] > mayor)
			mayor = arre[n];
 
		return Mayor(arre, ++n, mayor);
	}
}
