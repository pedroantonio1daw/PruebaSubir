/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmayoprogramacion;

import java.util.Scanner;


public class ArrayBidimensional {
    
    
      public static void mostrarBi(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] Colores=new String[8][4];
        
       
       
        for (int i = 0; i < Colores.length; i++) {
            for (int j = 0; j < Colores[0].length; j++) {
                if (i==0 && j!=3) {
                    System.out.println("introduce los colores");
                    Colores[i][j]=sc.nextLine();
                }
                if (j==3) {
                    System.out.println("introduce letras");
                    Colores[i][j]=sc.nextLine();
                }
                if (i==7) {
                    System.out.println("introduce letras");
                    Colores[i][j]=sc.nextLine();
                }
                if (i==6 && j!=3) {
                    System.out.println("introduce alumnos");
                    Colores[i][j]=sc.nextLine();
                }
                if (j==1 && i!=0 && i!=7 && i!=6) {
                    System.out.println("introduce meses");
                    Colores[i][j]=sc.nextLine();
                    
                }
                if (j==0 &&  i!=0 && i!=1 && i!=7 && i!=6) {
                    System.out.println("introduce las ciudades");
                    Colores[i][j]=sc.nextLine();
                    
                }
                if (j==2 && i!=0 && i!=1 && i!=7 && i!=6) {
                    System.out.println("introduce pueblos");
                     Colores[i][j]=sc.nextLine();
                }
               
            }
            
        }
        
                System.out.println("introduce color");
                  Colores[1][0]=sc.nextLine();
       
 
                System.out.println("introduce color");
                  Colores[1][2]=sc.nextLine();
                
        
         ArrayBidimensional.mostrarBi(Colores);
        
        
        
        
    }
    
}
