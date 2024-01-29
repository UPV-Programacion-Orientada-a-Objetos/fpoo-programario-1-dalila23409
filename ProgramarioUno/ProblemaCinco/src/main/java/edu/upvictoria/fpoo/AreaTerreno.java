package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaTerreno {
    public double are(double a, double b, double c,double t, double r,double Atotal) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el lado A");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese el lado B");
        b = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese el lado C");
        c = Double.parseDouble(reader.readLine());
        t=(b*(a-c))/2;
        r=b*c;
        Atotal=t+r;
        System.out.println("EL área del terreno es: "+ Atotal);

        return Atotal;
    }
}
