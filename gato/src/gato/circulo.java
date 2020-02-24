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
public class circulo extends Thread{
    private Tablero tablero1;
    private Tablero_1 tablero2;
    int[] jugada = new int[9];
    int ejecutar=1;
    public circulo(Tablero tableropasado,Tablero_1 tableropasado2){
        tablero1 = tableropasado;
        tablero2 = tableropasado2;       
    }

    
    public void run(){
        int valor;
        int play=0;
        while(ejecutar==1){
            ejecutar=tablero1.getEjecutar();
            valor=tablero2.getValor();
            jugada=tablero1.getJugada();
            play=tablero1.getPlay();
            if(play==0){
                System.out.println("entro");
                if(valor==1 && jugada[0]==0){
                    tablero1.jButton1.setText("O");
                    tablero2.jButton1.setText("O");                
                    jugada[0]=1;
                    play=1;
                }
                if(valor==2 && jugada[1]==0){
                    tablero1.jButton2.setText("O");
                    tablero2.jButton2.setText("O");
                    jugada[1]=1;
                    play=1;
                }
                if(valor==3 && jugada[2]==0){
                    tablero1.jButton3.setText("O");
                    tablero2.jButton3.setText("O");
                    jugada[2]=1;
                    play=1;
                }
                if(valor==4 && jugada[3]==0){
                    tablero1.jButton4.setText("O");
                    tablero2.jButton4.setText("O");
                    jugada[3]=1;
                    play=1;
                }
                if(valor==5 && jugada[4]==0){
                    tablero1.jButton5.setText("O");
                    tablero2.jButton5.setText("O");
                    jugada[4]=1;
                    play=1;
                }
                if(valor==6 && jugada[5]==0){
                    tablero1.jButton6.setText("O");
                    tablero2.jButton6.setText("O");
                    jugada[5]=1;
                    play=1;
                }
                if(valor==7 && jugada[6]==0){
                    tablero1.jButton7.setText("O");
                    tablero2.jButton7.setText("O");
                    jugada[6]=1;
                    play=1;
                }
                if(valor==8 && jugada[7]==0){
                    tablero1.jButton8.setText("O");
                    tablero2.jButton8.setText("O");
                    jugada[7]=1;
                    play=1;
                }
                if(valor==9 && jugada[8]==0){
                    tablero1.jButton9.setText("O");
                    tablero2.jButton9.setText("O");
                    jugada[8]=1;
                    play=1;
                }
            }else{tablero2.setValor(0);}
            tablero1.setJugada(jugada);
            tablero2.setJugada(jugada);
            tablero1.setPlay(play);
            tablero2.setPlay(play);
            System.out.println(valor);
        
        }

    }
    
}