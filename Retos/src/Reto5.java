import java.util.*;
public class Reto5 {
    public static void main(String[]args){
        //Este programa es de una caja registradora

        System.out.println("¡Bienvenido a nuestra tienda!");
        String nClothes,respuAfirma="Yes",nPersonaCajaRegis="Dan", nPersonaCajaSinReg="",nClieRegis="Alan",nClieSinReg="";
        long price,totalCompra1=0,paga;
        int cantidad;

        Scanner aboutMyStore=new Scanner(System.in);

        System.out.println("¿Desea comprar algún artículo? (Sí es así, escriba Yes, sino No)");
        respuAfirma=aboutMyStore .next();


        while (respuAfirma.equals("Yes")) {
            
            System.out.print("Digite la cantidad de los artículos que va a comprar: ");
            cantidad=aboutMyStore .nextInt();

                for(int i=0;i<cantidad;i++){

                        System.out.print("¿Qué artículo desea comprar?, Ingrese el nombre: ");
                        nClothes=aboutMyStore .next();
                            System.out.print("Por favor digite el precio de " + nClothes + ": ");
                            price=aboutMyStore .nextLong();

                            totalCompra1=totalCompra1+price;
                        }

                        System.out.println("¿Desea comprar algo más? (Sí es así, escriba Yes, sino No)");
                        respuAfirma=aboutMyStore .next();

                        System.out.println("La compra tiene un total de: " + totalCompra1);

                        //Desde a quí inicia la caja registradora:

                            System.out.print("¿Con cuánto paga?, ingrese la cantidad con la que paga: ");
                            paga=aboutMyStore .nextLong();

                             //La caja registradora le pregunta a la persona encargada en la caja
                            System.out.print("Por favor digite su nombre: ");
                            nPersonaCajaRegis=aboutMyStore .next();
                            
                             if (nPersonaCajaRegis.equals("Dan")) {
                            System.out.print("El cliente fue atendido por: " + nPersonaCajaRegis);
                            System.out.println("");

                            }else{
                            System.out.println("La persona encargada de la caja, no se encuentra registrada, regístrese, escriba su nombre.");
                            nPersonaCajaSinReg=aboutMyStore .next();
                            System.out.println(nPersonaCajaSinReg + " Ha sido registrad@ con éxito");
                            System.out.println("");
                            }

                             //Cliente

                            System.out.println("Por favor ingrese el nombre del cliente: ");
                            nClieRegis=aboutMyStore .next();

                            if (nClieRegis.equals("Alan")) {
                            System.out.print("El nombre del cliente es: " + nClieRegis);
                            System.out.println("");

                            }else{
                            System.out.print("El cliente no se encuentra registrado, registre su nombre:  ");
                            nClieSinReg=aboutMyStore .next();
                            System.out.println(nClieSinReg + " Ha sido registrado como un nuevo cliente: ");
                            System.out.println("");
                            }

                            if (paga==totalCompra1) {
                                System.out.println("No hay cambio");
                            } else if(paga>totalCompra1){
                                long cambio=paga-totalCompra1;
                                System.out.println("Su cambio es de: " + cambio);
                            }else{
                                long noAlcanza=totalCompra1-paga;
                                System.out.println("No le alacanza, le hace falta un valor de: " + noAlcanza);
                            } 

                            System.out.print("El cliente fue atendido por: " + nPersonaCajaRegis + nPersonaCajaSinReg);
                            System.out.println("");

                            }System.out.println("La compra fue de: " + totalCompra1);
                            System.out.println("Gracias por visitarnos");

                            aboutMyStore.close();
          }
}