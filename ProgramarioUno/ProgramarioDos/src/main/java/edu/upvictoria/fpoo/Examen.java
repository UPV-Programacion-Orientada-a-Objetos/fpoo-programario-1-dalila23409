package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examen {
    public double e(float e1, float e2, float e3, float e4) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la calificación del primer examen:");
        e1 = Float.parseFloat(reader.readLine());
        System.out.println("Ingrese la calificación del segundo examen:");
        e2 = Float.parseFloat(reader.readLine());
        System.out.println("Ingrese la calificación del tercer examen:");
        e3 = Float.parseFloat(reader.readLine());
        System.out.println("Ingrese la calificación del cuarto examen:");
        e4 = Float.parseFloat(reader.readLine());
        double promedio;
        promedio = (e1 * 0.65) + (e2 * 0.65) + (e3 * 0.65) + (e4 * 0.65);
        promedio = promedio / 4;
        System.out.println("El promedio de las calificaciones es: " + promedio);


        return promedio;
    }
}
    