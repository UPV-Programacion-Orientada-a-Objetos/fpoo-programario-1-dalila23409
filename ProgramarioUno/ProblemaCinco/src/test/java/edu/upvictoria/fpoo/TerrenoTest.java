package edu.upvictoria.fpoo;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
public class TerrenoTest {
    @Test
    public void area1() throws IOException {
      double a,b,c,r,t,Atotal;
      a=5;
      b=9;
      c=4;
        t=(b*(a-c))/2;
        r=b*c;
        Atotal=t+r;
        AreaTerreno are = new AreaTerreno();
        assertEquals(48.5, are.are(a,b,c,r,t,Atotal));
    }
    @Test
    public void area2() throws IOException {
        double a,b,c,r,t,Atotal;
        a=4;
        b=7;
        c=8;
        t=(b*(a-c))/2;
        r=b*c;
        Atotal=t+r;
        AreaTerreno are = new AreaTerreno();
        assertEquals(42, are.are(a,b,c,r,t,Atotal));
    }
    @Test
    public void area3() throws IOException {
        double a,b,c,r,t,Atotal;
        a=5;
        b=2;
        c=3;
        t=(b*(a-c))/2;
        r=b*c;
        Atotal=t+r;
        AreaTerreno are = new AreaTerreno();
        assertEquals(8, are.are(a,b,c,r,t,Atotal));
    }
}

