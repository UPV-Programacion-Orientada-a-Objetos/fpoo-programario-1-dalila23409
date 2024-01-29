package edu.upvictoria.fpoo;
public class AreaFigura {
    public double are(double h, double r, double b,double a,double a1, double a2,double Atotal)  {
      h=45;
      r=23;
      b=10;
      a = Math.sqrt(h * h - r * r);
      a1=((r * b) / 2)*2;
      a2 = Math.PI * Math.pow(r, 2) / 2;
        Atotal=a1+a2;
        System.out.println("EL área de la figura es: "+ Atotal);

        return Atotal;
    }
}
