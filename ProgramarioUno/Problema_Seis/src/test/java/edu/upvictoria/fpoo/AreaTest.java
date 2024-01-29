package edu.upvictoria.fpoo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AreaTest {
    @Test
    public void area1() {
        double a,b,h,r,a1,a2,Atotal;
        h=6;
        r=3;
        b=10;
        a = Math.sqrt(h * h - r * r);
        a1=((r * b) / 2)*2;
        a2 = Math.PI * Math.pow(r, 2) / 2;
        Atotal=a1+a2;
        AreaFigura are = new AreaFigura();
        assertEquals(44.1371, are.are(a,b,h,r,a1,a2,Atotal));
    }
    @Test
    public void area2() {
        double a,b,h,r,a1,a2,Atotal;
        h=1;
        r=1;
        b=2;
        a = Math.sqrt(h * h - r * r);
        a1=((r * b) / 2)*2;
        a2 = Math.PI * Math.pow(r, 2) / 2;
        Atotal=a1+a2;
        AreaFigura are = new AreaFigura();
        assertEquals(3.5707, are.are(a,b,h,r,a1,a2,Atotal));
    }
    @Test
    public void area3() {
        double a,b,h,r,a1,a2,Atotal;
        h=5;
        r=3;
        b=7;
        a = Math.sqrt(h * h - r * r);
        a1=((r * b) / 2)*2;
        a2 = Math.PI * Math.pow(r, 2) / 2;
        Atotal=a1+a2;
        AreaFigura are = new AreaFigura();
        assertEquals(35.137, are.are(a,b,h,r,a1,a2,Atotal));
    }
}
