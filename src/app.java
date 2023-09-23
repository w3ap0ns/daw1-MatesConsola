import java.util.Scanner;

public class app {

    public static void main(String[] arg){

       /* En el ejercicio 3 (MatesConsola) se solicitan los dos números a operar*/

        Scanner readln = new Scanner(System.in);

        // Declaración de Variables:
        double x = 0;
        double y = 0;

        // Operación - Pedir al usuario 2 números:

        System.out.printf("Introduce un número para operar:...\n");
        x = readln.nextDouble();
        System.out.printf("Introduce otro número distinto a 0:...\n");
        y = readln.nextDouble();

        // Operaciones matemáticas:
        double suma = x +y;
        double resta = x - y;
        double multiplicacion = x * y;
        double division = x / y;

        // ********** Operaciónes *********

        //Suma
        System.out.printf("La suma de %s y %s es igual a: %.2f\n",x,y,suma);

        //Resta
        System.out.printf("La resta de %s y %s es igual a: %.2f \n",x,y,resta);

        //Multiplicación
        System.out.printf("La multiplicación de %s y %s es igual a: %.2f \n",x,y,multiplicacion);

        //División
        System.out.printf("La división de %s y %s es igual a: %.2f \n",x,y,division);

    } // public static void main(String[] arg)

} //public class app
