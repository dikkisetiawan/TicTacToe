/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.util.Scanner;

/**
 *
 * @author Husna
 */
public class TicTacToeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner input = new Scanner (System.in);
        
int baris=0; int kolom=0; int f=0;  int i=0; int p=0; boolean trigger= false; int count=0; boolean retry=false; int retry1=0;
int [][] x; x= new int [3][3];

  
        
        System.out.println("TIC TAC TOE GAME");
while(!trigger||i==0){
        x[0][0]=0;
        x[0][1]=0;
        x[0][2]=0;
        
        x[1][0]=0;
        x[1][1]=0;
        x[1][2]=0;
        
        x[2][0]=0;
        x[2][1]=0;
        x[2][2]=0;
for(i=0; i<8;i++){
            
   Displayboard(x);

        if(trigger){break;}
        if(i==0){f=1; p=1;} else{ f=-1; p=2;}
        if(i%2==0){f=1; p=1;} else{f=-1;p=2;}
          
        System.out.println("Player "+p+" Input row = ");
        baris = input.nextInt();
        System.out.println("Player "+p+" Input colum = ");
        kolom = input.nextInt();
        
         if((baris==1)&&(kolom==1)){x[0][0]=f;} 
         if((baris==1)&&(kolom==2)){x[0][1]=f;} 
         if((baris==1)&&(kolom==3)){x[0][2]=f;} 
         if((baris==2)&&(kolom==1)){x[1][0]=f;} 
         if((baris==2)&&(kolom==2)){x[1][1]=f;} 
         if((baris==2)&&(kolom==3)){x[1][2]=f;} 
         if((baris==3)&&(kolom==1)){x[2][0]=f;} 
         if((baris==3)&&(kolom==2)){x[2][1]=f;} 
         if((baris==3)&&(kolom==3)){x[2][2]=f;} 
         
    System.out.println("");
         
         if(x[0][0]+x[1][0]+x[2][0]==3||x[0][0]+x[1][0]+x[2][0]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //p1   //script by initialDS.com
         if(x[0][1]+x[1][1]+x[2][1]==3||x[0][1]+x[1][1]+x[2][1]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //p2   //script by initialDS.com
         if(x[0][2]+x[1][2]+x[2][2]==3||x[0][2]+x[1][2]+x[2][2]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //p3   //script by initialDS.com
         if(x[0][0]+x[0][1]+x[0][2]==3||x[0][0]+x[0][1]+x[0][2]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //q1   //script by initialDS.com
         if(x[1][0]+x[1][1]+x[1][2]==3||x[1][0]+x[1][1]+x[1][2]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //q2   //script by initialDS.com
         if(x[2][0]+x[2][1]+x[2][2]==3||x[2][0]+x[2][1]+x[2][2]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //q3   //script by initialDS.com
         if(x[0][0]+x[1][1]+x[2][2]==3||x[0][0]+x[1][1]+x[2][2]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //r   //script by initialDS.com
         if(x[2][0]+x[1][1]+x[0][2]==3||x[2][0]+x[1][1]+x[0][2]==-3){System.out.println("Player "+p+" wins!"); trigger=true;} //s   //script by initialDS.com
    
        }
        

       if(trigger) System.out.println("THANK YOU FOR PLAYING"); else {System.out.println("It seems that no one wins"); retry=true;}
       if(retry){System.out.print("You might want to retry. press 1 "); retry1=input.nextInt(); }
       if(retry1==1){i=0;}//script by initialDS.com
}
}    
    
    
    public static void Displayboard(int [][] x){
      for(int row=0; row<3; row++){
         for(int col=0; col<3; col++)
         {if(x[row][col]==0)System.out.print(" - "); else {if(x[row][col]==1)System.out.print(" x "); else {System.out.print(" 0 ");}}
         
           }           System.out.println(" "); } }
    




}

