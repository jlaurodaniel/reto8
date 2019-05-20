


package palabras;

import javax.swing.JOptionPane;
import java.io.IOException;



public class Palabras {

 
    public static void main(String[] args)throws IOException {
      boolean respuesta=false,c=true;
          int aux,i,r,s=0;   
          String aux2,nivel,letra;
          try{
             do { s+=1;
                 JOptionPane.showMessageDialog(null,"Bienvenido a tu juego -adivina la letra-  ");    
                 nivel=JOptionPane.showInputDialog("escriba el nivel en que quiere jugar(1,2,3)");
                 aux=Integer.parseInt(nivel);
                 r=(int)(Math.random()*5);System.out.println(" Este es el numero de la palabra segun la matriz-----comodin para el jugador que esta viendo el codigo y la consola:---- "+r);
                 
                 
                 
                 switch (aux){
                 
                     case(1):
                        String palabra1 [][]={{"c","o","s","a"},{"b","o","l","i"},{"m","a","l","o"},{"r","a","t","o"},{"s","a","p","o"}};
                        letra=JOptionPane.showInputDialog("Adivine la letra de la palabra XXXX (4 LETRAS), Y escribala: ");
                        
                         do {
                          for(int j=0;j<4;j++){
                             if(letra.equals(palabra1[r][j])){
                                 JOptionPane.showMessageDialog(null,"Adivinaste una letra de la palabra");c=false;
                               } 
                             }   
                         if(c){JOptionPane.showMessageDialog(null,"no adivinaste la palabra");
                             letra=JOptionPane.showInputDialog("Adivine la letra de la palabra XXXX (4 LETRAS),Y escribala: ");
                         }
                        }
                         while(c);
                             
                     break;
                         
                         
                     case(2):
                        String palabra2 [][]={{"e","l","e","v","a","n","d","o"},{"e","s","p","i","n","o","s","a"},{"e","s","t","u","d","i","a","r"},
                                              {"h","o","s","p","i","t","a","l"},{"i","m","p","u","l","s","a","r"}};
                        letra=JOptionPane.showInputDialog("Adivine la letra de la palabra XXXXXXXX (8 LETRAS),Y escribala: ");
                        
                         do {
                          for(int j=0;j<4;j++){
                             if(letra.equals(palabra2[r][j])){
                                 JOptionPane.showMessageDialog(null,"Adivinaste una letra de la palabra");c=false;
                               } 
                             }   
                         if(c){JOptionPane.showMessageDialog(null,"no adivinaste la palabra");
                             letra=JOptionPane.showInputDialog("Adivine la letra de la palabra XXXXXXXX (8 LETRAS),Y escribala: ");
                         }
                        }
                         while(c);
                             
                     break;    
                 
                         
                     case(3):
                        String palabra3 [][]={{"a","b","u","l","t","a","m","i","e","n","t","o"},{"a","c","o","n","d","i","c","i","o","n","a","r"},{"v","i","l","l","a","h","e","r","m","o","s","a"},
                                              {"a","b","u","r","r","i","m","i","e","n","t","o"},{"a","c","o","t","a","m","i","e","n","t","o","s"}};
                        letra=JOptionPane.showInputDialog("Adivine la letra de la palabra XXXXXXXXXXXX(12 LETRAS), Y escribala: ");
                        
                         do {
                          for(int j=0;j<4;j++){
                             if(letra.equals(palabra3[r][j])){
                                 JOptionPane.showMessageDialog(null,"Adivinaste una letra de la palabra");c=false;
                               } 
                             }   
                         if(c){JOptionPane.showMessageDialog(null,"no adivinaste la palabra");
                             letra=JOptionPane.showInputDialog("Adivine la letra de la palabra XXXXXXXXXXX (12 LETRAS), Y escribala: ");
                         }
                        }
                         while(c);
                             
                     break;    
                 }
                         
               
                 aux2=JOptionPane.showInputDialog("Escriba 0 para cerrar o 1 para volver a jugar ");
                 aux=Integer.parseInt(aux2);
                 if (aux==1){
                             respuesta=true;
                 }else if (aux==0){JOptionPane.showMessageDialog(null,"hasta luego, usted jugo "+s+" veces");
                               respuesta=false;
                 }                 
       
               }while(respuesta );
          }catch (IOException xe){ JOptionPane.showMessageDialog(null,"ERROR ,INGRESA UN VALOR CORRECTO ¡¡¡");}
     
          
          
          
    }
       
}
