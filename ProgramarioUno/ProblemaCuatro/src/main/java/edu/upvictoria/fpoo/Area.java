package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
    public double area( double circu, double r) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el radio del círculo:");
        r = Double.parseDouble(reader.readLine());
        circu=0;
        circu = Math.PI * Math.pow(r, 2);
        System.out.println("El área de la circuferencia es: " + circu);
        return circu;
    }
}

