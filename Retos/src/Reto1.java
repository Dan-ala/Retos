import java.util.*;
public class Reto1 {
    public static void main(String[] args) {

        String doctorName,momName,babyName;
        
        System.out.print("Hi there! En este programa, vamos a calcular el número de dosis que se deben de aplicar a un bebé");
        System.out.println();

        Scanner meineObj = new Scanner(System.in);
        System.out.print("Digite el nombre del doctor que los atiende: ");
        doctorName=meineObj .next();

        System.out.print("Digite su nombre (mamá del bebé): ");
        momName=meineObj .next();

        System.out.print("Digite el nombre del bebé: ");
        babyName=meineObj .next();

        //Ahora muestra la información ingresada

        System.out.println("La información digitalizada es la siguiente: ");System.out.println();

        System.out.print("Nombre del doctor: " + doctorName);System.out.println();
        System.out.print("Nombre de la mamá: " + momName);System.out.println();
        System.out.print("Nombre del bebé: " + babyName);System.out.println();

        //Vamos a calcular el número de dosis que el bebé debe consumir

        System.out.println("Por favor digite lo siguiente...");

        int meses;

        //Estas son las 6 posibilidades de peso según los meses del niño(bebé)

         double peso;

        System.out.println("A tener en cuenta:");

        System.out.println("3.4 (de peso) Recién Nacido");
        System.out.println("6.2 (de peso) 3 meses");
        System.out.println("6.7 (de peso) 4 meses");
        System.out.println("8 (de peso) 6 meses"); 
        System.out.println("9.2 (de peso) 9 meses"); 
        System.out.println("10.2 (de peso) 12 meses"); 

        System.out.print("¿Cuántos meses tiene el bebé?: ");
        meses=meineObj .nextInt();


        System.out.print("¿Cuánto pesa el bebé?: ");
        peso=meineObj .nextDouble();
    

        //El número de dosis es:

        double dosis = peso + 15;
        double dosage = dosis / meses * 10;
        double seAplica = dosis + dosage * 8;

        System.out.print("El numero de dosis es: " + seAplica);

        meineObj.close();
    }
    
}