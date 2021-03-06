package es.joseantoniofornellmarquez.bingomatesproyecto;

import java.util.Random;

public class Carton {
    
    int[][] nums;
    int numFilas;
    public Carton(int numFilas){
            this.numFilas = numFilas;
            nums = new int[9][numFilas];
        
//        for(int y=0; y<3; y++) {
//            for(int x=0; x<9; x++) {
//                nums[x][y] = getNumAleatorio(1, 90);
//            }
//        }

        int num;
        int col;
        for(int fil=0; fil<numFilas; fil++) {
            for(int i=0; i<5; i++) {  
                do {
                    num = getNumAleatorio(1, 89);
                    //System.out.println("numAleatorio: "+ num);
                    col = this.getNumColumna(num);
                //Controlar que no se coloque en una posición ocupada
                // y controlar que nose repita el número
                } while(nums[col][fil] != 0);
                nums[col][fil] = num;
            }
        }
        
        this.mostrarPorConsola();    
        
    }
    
    // Retorna el número de la columna
    private int getNumColumna(int num) {
        return (num / 10);
    } 
    
    public void mostrarPorConsola() {
        for(int y=0; y<numFilas; y++) {
            for(int x=0; x<9; x++) {
                //System.out.println("x=" + x + " y=" + y);
                System.out.print(nums[x][y] + " ");
            }
            System.out.println();
        }        
    }
    
    public int getNumAleatorio(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
    
}