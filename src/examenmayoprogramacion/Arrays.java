package examenmayoprogramacion;

import java.util.Scanner;

public class Arrays {

    public static void burbujamin(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }

            }
        }

    }
public static void burbujamax(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }

            }
        }

    }
 public static void mostrarUni(int[] array) {
        for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            
        }
        
    }
 
public static void aleatorio(int[] array,int min,int max) {
    int contaPares=0;
        for (int i = 0; i < array.length; i++) {    
                array[i]=(int)(Math.random()*(max-min)+min);
                if (array[i]%2==0 && array[i]>12) {
                    contaPares++;
                
            }
              
        }
         System.out.println("los numeros pares mayores a 12: "+contaPares);
    } 


    public static void main(String[] args) {
        int[] matriz = new int[20];
        int[] matriz2 = new int[20];
        
       Arrays.aleatorio(matriz, 1, 25);
       Arrays.mostrarUni(matriz);
       Arrays.burbujamin(matriz);
        System.out.println("");
       Arrays.mostrarUni(matriz);
       
        System.out.println("");
       
       
        Arrays.aleatorio(matriz2, 1, 25);
       Arrays.mostrarUni(matriz2);
       Arrays.burbujamax(matriz2);
        System.out.println("");
       Arrays.mostrarUni(matriz2);
        
    }
}
