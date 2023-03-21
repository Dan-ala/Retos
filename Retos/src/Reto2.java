public class Reto2 {
    public static void main(String[] args) {

        System.out.println("Hey Develper! Welcome again! Hoy vamos a calcular 350°C a 350°K. Luego, veremos el otro procedimiento.");
        System.out.println();

        int celsius = 350;
        double kelvin = celsius + 273.15;

        System.out.print("La temperatura 350°C en Kelvil es de: " + kelvin);
        System.out.println();

        //Ahora el segundo procedimiento

        System.out.println("Ahora vamos a calcular la cantidad de harina que se necesita para 10 personas, por cada persona se necesita 13g. Lo que debe mostrar al final es la cantidad de harina que se necesita en la torta en gramos. Let's check it out!");
        System.out.println();

        int people = 10;
        int gram = 13;

        //Proceso

        int flour = gram * people;

        System.out.print("La hariana que se necita para 10 personas es: " + flour ); System.out.print(" gramos"); 
        
    }
}