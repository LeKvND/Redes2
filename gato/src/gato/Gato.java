
package gato;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
/**
 *
 * @author kevin
 */
public class Gato extends Thread{
    private Tablero tablero1;
    private Tablero_1 tablero2;
    int[] jugada = new int[9];
    int ejecutar=1;
    public Gato(Tablero tableropasado,Tablero_1 tableropasado2){
        tablero1 = tableropasado;
        tablero2 = tableropasado2;
    }
    public void run(){

        while(ejecutar==1){
            jugada=tablero2.getJugada();
            if((jugada[0]==1 && jugada[1]==1 && jugada[2]==1) || 
               (jugada[3]==1 && jugada[4]==1 && jugada[5]==1) || 
               (jugada[6]==1 && jugada[7]==1 && jugada[8]==1) || 
               (jugada[0]==1 && jugada[3]==1 && jugada[6]==1) || 
               (jugada[1]==1 && jugada[4]==1 && jugada[7]==1) || 
               (jugada[2]==1 && jugada[5]==1 && jugada[8]==1) || 
               (jugada[0]==1 && jugada[4]==1 && jugada[8]==1) || 
               (jugada[2]==1 && jugada[4]==1 && jugada[6]==1)  ){
                tablero1.eliminarTablero();
                tablero2.eliminarTablero();
                new Ganador1().setVisible(true);
                tablero1.setEjecutar(ejecutar);
                ejecutar=0;
            }else if((jugada[0]==2 && jugada[1]==2 && jugada[2]==2) || 
               (jugada[3]==2 && jugada[4]==2 && jugada[5]==2) || 
               (jugada[6]==2 && jugada[7]==2 && jugada[8]==2) || 
               (jugada[0]==2 && jugada[3]==2 && jugada[6]==2) || 
               (jugada[1]==2 && jugada[4]==2 && jugada[7]==2) || 
               (jugada[2]==2 && jugada[5]==2 && jugada[8]==2) || 
               (jugada[0]==2 && jugada[4]==2 && jugada[8]==2) || 
               (jugada[2]==2 && jugada[4]==2 && jugada[6]==2)  ){
                tablero1.eliminarTablero();
                tablero2.eliminarTablero();
                new Ganador1_1().setVisible(true);
                tablero1.setEjecutar(ejecutar);
                ejecutar=0;
            }else if(jugada[0]!=0 && jugada[1]!=0 && jugada[2]!=0 &&
                     jugada[3]!=0 && jugada[4]!=0 && jugada[5]!=0 && 
                     jugada[6]!=0 && jugada[7]!=0 && jugada[8]!=0  ){
                tablero1.eliminarTablero();
                tablero2.eliminarTablero();
                new Ganador1_2().setVisible(true);
                tablero1.setEjecutar(ejecutar);
                ejecutar=0;
            }
            System.out.println(Arrays.toString(jugada));
        }
    }
    
}
     

