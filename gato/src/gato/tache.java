/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author kevin
 */
public class tache extends Thread{
    private final Tablero tablero1;
    private final Tablero_1 tablero2;
    int[] jugada = new int[9];
    int ejecutar=1;
    public tache(Tablero tableropasado,Tablero_1 tableropasado2){
        tablero1 = tableropasado;
        tablero2 = tableropasado2;       
    }

    
    public void run(){
        int valor;
        int play=0;
        while(ejecutar==1){
            ejecutar=tablero1.getEjecutar();
            valor=tablero1.getValor();
            jugada=tablero2.getJugada();
            play=tablero2.getPlay();
            
            if(play==1){
                if(valor==1 && jugada[0]==0){
                    tablero1.jButton1.setText("X");
                    tablero2.jButton1.setText("X");
                    jugada[0]=2;
                    play=0;
                }
                if(valor==2 && jugada[1]==0){
                    tablero1.jButton2.setText("X");
                    tablero2.jButton2.setText("X");
                    jugada[1]=2;
                    play=0;
                }
                if(valor==3 && jugada[2]==0){
                    tablero1.jButton3.setText("X");
                    tablero2.jButton3.setText("X");
                    jugada[2]=2;
                    play=0;
                }
                if(valor==4 && jugada[3]==0){
                    tablero1.jButton4.setText("X");
                    tablero2.jButton4.setText("X");
                    jugada[3]=2;
                    play=0;
                }
               if(valor==5 && jugada[4]==0){
                    tablero1.jButton5.setText("X");
                    tablero2.jButton5.setText("X");
                    jugada[4]=2;
                    play=0;
                }
                if(valor==6 && jugada[5]==0){
                    tablero1.jButton6.setText("X");
                    tablero2.jButton6.setText("X");
                    jugada[5]=2;
                    play=0;
                }
                if(valor==7 && jugada[6]==0){
                    tablero1.jButton7.setText("X");
                    tablero2.jButton7.setText("X");
                    jugada[6]=2;
                    play=0;
                }
                if(valor==8 && jugada[7]==0){
                    tablero1.jButton8.setText("X");
                    tablero2.jButton8.setText("X");
                    jugada[7]=2;
                    play=0;
                }
                if(valor==9 && jugada[8]==0){
                    tablero1.jButton9.setText("X");
                    tablero2.jButton9.setText("X");
                    jugada[8]=2;
                    play=0;
                }

            }else{tablero1.setValor(0);}
            
            tablero1.setJugada(jugada);
            tablero2.setJugada(jugada);
            tablero1.setPlay(play);
            tablero2.setPlay(play);
            System.out.println(valor);
        
        }

    }
    
}
