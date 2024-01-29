package edu.upvictoria.fpoo;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class CircuferenciaTest {
    @Test
    public void area_1() throws IOException {
        double r= 8;
        double circu= Math.PI * Math.pow(r, 2);
        Area a= new Area();
        assertEquals(201.0619, a.area(circu, r));


    }
    @Test
    public void area_2() throws IOException {
        double r= 10;
        double circu= Math.PI * Math.pow(r, 2);
        Area a= new Area();
        assertEquals(314.1592, a.area(circu, r));
    }
    @Test
    public void area_3() throws IOException {
        double r= 4.5;
        double circu= Math.PI * Math.pow(r, 2);
        Area a= new Area();
        assertEquals(63.6172, a.area(circu, r));
    }
}

