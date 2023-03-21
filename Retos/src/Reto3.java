import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {

        int valJugador=0,cantApostar=0,siGana=0,siPierde=0;

        Scanner ingreNum=new Scanner(System.in);

        int cantiParaIniciar=(int)(Math.random()*50);

        System.out.println("La cantidad requerida para apostar es de: " + cantiParaIniciar);

        System.out.print("Ingrese la cantidad para apostar: ");
        cantApostar=ingreNum .nextInt();
    
        while(cantApostar>cantiParaIniciar && cantApostar>=Math.abs(siPierde)){

        System.out.print("¿Qué opción es de su preferecnia?, 0 es para cara y 1 para sello: ");
        valJugador=ingreNum .nextInt();
        

        int valMaquina=(int)(Math.random()*2);


        if (valJugador==valMaquina) {
            System.out.println("Felicitraciones usted GANÓ");

            siGana+=cantApostar;
            System.out.print("Ahora tiene: " + siGana);
            System.out.println();

        }

        else{
            System.out.println("Perdió");
    
            siPierde-=siGana;
            System.out.print("Ahora tiene: " + siPierde);
            System.out.println();

            }   
        }
        
        if (cantApostar>=siPierde) {
            System.out.print("Pierde con: " + Math.abs(siPierde));
            System.out.println();
        }
        ingreNum.close();
    }
}