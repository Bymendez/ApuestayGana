import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Brayan Yair Mendez Rodriguez
      22-08-2024
      Apuesta y gana
     */
        int x= 0;
        int jugar=0;
        int dinero= 0;
        int opcion;
        System.out.println("BIENVENIDO AL JUEGO APUESTA Y GANA");
        System.out.println("Ingrese la cantidad de dinero");
        Scanner teclado = new Scanner(System.in);
        dinero = teclado.nextInt();
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(1, 4);
        System.out.println(n);
        if (n==3) {
            System.out.println("Usted perdio todo el dinero");
        }
        while (n!=3){
             if (n==2){
                System.out.println("Usted perdio la mitad del dinero");
                dinero= (dinero/2);
                System.out.println("Su dinero es: " +dinero);
                while (jugar == 0){
                    System.out.println("¿Desea seguir jugando?");
                    System.out.println("1.Si \n 2.No");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            jugar = 1;
                            break;
                        case 2:
                            jugar = 1;
                            n=3;
                            break;
                    }
                }
            } else if (n==1){
                dinero = (dinero*2);
                System.out.println("Usted duplico su dinero");
                System.out.println("Su dinero es: " +dinero);
                while (jugar == 0){
                    System.out.println("¿Desea seguir jugando?");
                    System.out.println(" 1.Si \n 2.No");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            jugar = 1;

                            break;
                        case 2:
                            jugar = 1;
                            n=3;
                            break;
                    }
                }
            }
            }
        }
        }

