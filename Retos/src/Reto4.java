import java.util.*;
public class Reto4 {
    public static void main(String[] args){

        int valJug,cantApostar=0,siGana=0,siPierde=0;
        String respuesta;
    
        Scanner valJugador=new Scanner(System.in);

        int cantiParaIniciar=(int)(Math.random()*10 + 1);

        System.out.println("¿Desea jugar?, Digite Si o No");
        respuesta=valJugador .next();

        System.out.println("La cantidad requerida para apostar es de: " + cantiParaIniciar);

        System.out.print("Ingrese a cantidad con la que va a apostar, DEBE SER MAYOR A LA CANTIDAD QUE EL JUEGO DICE: ");
        cantApostar=valJugador .nextInt();

        while(respuesta.equals("Si")  && siPierde<=20){

        System.out.print("¡Hola jugador! Jugará, piedra, papel o tijeras; con el valor 1 es para piedra, 2 para papel y 3 para tijeras: ");
        valJug=valJugador .nextInt();

        int valMaq=(int)(Math.random()*3 + 1);
       
        if (valJug==valMaq) {
    
            System.out.print("Empate, la máquina optó por: " + valMaq);
            System.out.println("");
            System.out.println("No se gana ni se pierde"); 
            System.out.println("");
        }
    
        if (valJug==1 && valMaq==3 || valJug==2 && valMaq==1 || valJug==3 && valMaq==2) {
    
            System.out.print("Ha ganado! la máquina optó por: " + valMaq);

            siGana+= cantApostar;

            System.out.println();
            System.out.println("Ahora tiene en apuesta: " + siGana);
            System.out.println();

                                }

                    else if(valJug==1 && valMaq==2 || valJug==2 && valMaq==3 || valJug==3 && valMaq==1){
    
                     System.out.print("La máquina le ganó ya que optó por: " + valMaq);
                            
                    siPierde+=cantApostar;
                            
                    System.out.println();
                    System.out.println("Ahora la apuesta está en: " + siPierde);
                    System.out.println();           
                    }

                      if (siPierde>=siGana || siPierde>=cantApostar) {
                        System.out.print("Pierde con: " + siPierde);
                        System.out.println();
                        }
            }
        
                    System.out.println("Gracias por visitarnos");
                    System.out.println("GAMEOVER");

            valJugador.close();   
        }                
}