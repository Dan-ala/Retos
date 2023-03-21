import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args){

        //Cara y sello apostando y con vidas

        int valJugador=0,cantApostar=0,siGana=0,siPierde=0,lives=3;
        String respuesta;

        Scanner ingreNum=new Scanner(System.in);

        System.out.println("¿Desea jugar?, Digite Si o No");
        respuesta=ingreNum .next();

        System.out.print("Ingrese la cantidad para apostar: ");
        cantApostar=ingreNum .nextInt();
    
        while(respuesta.equals("Si")){
            while(lives>0){
        for(int i=0;i<cantApostar;i++){
                System.out.print("La cantidad de vidas que tiene son: " + lives);
                System.out.println();

        System.out.print("¿Qué opción es de su preferencia?, 0 es para cara y 1 para sello: ");
        valJugador=ingreNum .nextInt();

        int valMaquina=(int)(Math.random()*2 + 1);

        if (valJugador==valMaquina) {
            System.out.println("Felicitraciones usted GANÓ");

            siGana+=cantApostar;
            System.out.print("Ahora tiene: " + siGana);
            System.out.println();
        }

        else{
            System.out.println("Perdió");
            System.out.println();
            siPierde-=cantApostar;

            System.out.print("Lleva hasta ahora en apuesta: " + siPierde);
            System.out.println();

            lives-= 1;

            System.out.println("Le quedan " + lives + " vidas");
            System.out.println();
        
            }
        }

        if (lives==0) {
            System.out.println("Ha pertido todas las vidas, GAMEOVER");
        }
        
                    }
                }
            
            ingreNum.close();
        }
}