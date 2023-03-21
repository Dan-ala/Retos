import java.util.Scanner;
public class Reto8{
    public static void main(String[] args){

        int tID=1021396143,i=0,numTel,numFicha,ayuda;
        String respuesta, nAprendiz;

        System.out.println("Hi there! Ha ingresado a las ayudas que el SENA brinda al aprendiz SENA");

        Scanner digiteInfo=new Scanner(System.in);
        System.out.print("¿Desea registrarse?, Ingrese Si o No: ");
        respuesta=digiteInfo .nextLine();

        if(respuesta.equals("Si")){

        tID+=tID; //Se almacenan los números de indetificación

            System.out.print("Para registrarse a un auxilio, escriba su número de Identificación: ");
            tID=digiteInfo .nextInt();

            if (tID==1021396143) {
                System.out.println("Ya se encuentra registrado, NO SE INSCRIBA A OTRO");                
            }else{
                System.out.println("¿Qué tipo de ayuda necesita? Transporte=1 o Alimentacion=2:");

                ayuda=digiteInfo .nextInt();

                switch (ayuda) {
                    case 1:
                        System.out.print("Ingrese su nombre: ");
                        nAprendiz=digiteInfo .next();
                        System.out.print(nAprendiz +"Ingrese número de teléfono: ");
                        numTel=digiteInfo .nextInt();
                        System.out.println( nAprendiz + "Ingrese el número a la ficha a la cual pertenece: ");
                        numFicha=digiteInfo .nextInt();
                        System.out.println("Registro exitoso");
                        break;

                        case 2:
                        System.out.print("Ingrese su nombre: ");
                        nAprendiz=digiteInfo .next();
                        System.out.print(nAprendiz +"Ingrese número de teléfono: ");
                        numTel=digiteInfo .nextInt();
                        System.out.println(nAprendiz + "Ingrese el número a la ficha a la cual pertenece: ");
                        numFicha=digiteInfo .nextInt();
                        System.out.println("Registro exitoso");
                        break;
                
                    default:
                        break;
                }
            }
            
        }

        System.out.println("Gracias por consultarnos");

        digiteInfo.close();
        }
    }