package Estudiantes;

import java.util.Scanner;

public class Notas_estudiantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir al usuario sus calificaciones
        System.out.println("Ingrese la calificacion de la evaluacion 1 (40%): ");
        double eval1 = teclado.nextDouble();

        System.out.println("Ingrese la calificacion de la evaluacion 2 (35%): ");
        double eval2 = teclado.nextDouble();

        System.out.println("Ingrese la calificacion de la evaluacion 3 (35%): ");
        double eval3 = teclado.nextDouble();

        //Calcular la nota definitiva
        double notaDefinitiva = eval1*0.40 + eval2*0.35 + eval3*0.35;

        //Mostrar la nota definitiva
        System.out.println("La nota definitiva es:");

        //Clasificar el rendimiento del estudiante
        if (notaDefinitiva >= 1 && notaDefinitiva < 3){
            System.out.println("El rendimiento del estudiante es insuficiente.");
        } else if  (notaDefinitiva >= 3 && notaDefinitiva < 4){
            System.out.println("El rendimiento del estudiante es promedio.");
        } else if (notaDefinitiva >= 4) {
            System.out.println("El rendimiento del estudiante es sobresaliente.");
        } else {
            System.out.println("Eror en el calculo de la nota definitiva");
        }

    }
}
